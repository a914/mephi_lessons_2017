public class Simplex {
    private int rows, cols; 
    private float[][] table; 
    private boolean solutionIsUnbounded = false;

    public static enum ERROR{
        NOT_OPTIMAL,
        IS_OPTIMAL,
        UNBOUNDED
    };
    
    public Simplex(int numOfConstraints, int numOfUnknowns){
        rows = numOfConstraints+1; 
        cols = numOfUnknowns+1;   
        table = new float[rows][]; 
         for(int i = 0; i < rows; i++){
            table[i] = new float[cols];
        }
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                String value = String.format("%.2f", table[i][j]);
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void fillTable(float[][] data){
        for(int i = 0; i < table.length; i++){
            System.arraycopy(data[i], 0, this.table[i], 0, data[i].length);
        }
    }

    public ERROR compute(){
        if(checkOptimality()){
            return ERROR.IS_OPTIMAL; 
        }
        int pivotColumn = findEnteringColumn();
        System.out.println("Опорный столбец: "+pivotColumn);
        

        float[] ratios = calculateRatios(pivotColumn);
        if(solutionIsUnbounded == true)
            return ERROR.UNBOUNDED;
        int pivotRow = findSmallestValue(ratios);

        formNextTableau(pivotRow, pivotColumn);
        return ERROR.NOT_OPTIMAL;
    }

    private void formNextTableau(int pivotRow, int pivotColumn){
        float pivotValue = table[pivotRow][pivotColumn];
        float[] pivotRowVals = new float[cols];
        float[] pivotColumnVals = new float[cols];
        float[] rowNew = new float[cols];
        System.arraycopy(table[pivotRow], 0, pivotRowVals, 0, cols);
        for(int i = 0; i < rows; i++)
            pivotColumnVals[i] = table[i][pivotColumn];
        for(int  i = 0; i < cols; i++)
            rowNew[i] =  pivotRowVals[i] / pivotValue;
        for(int i = 0; i < rows; i++){
            if(i != pivotRow){
                for(int j = 0; j < cols; j++){
                    float c = pivotColumnVals[i];
                    table[i][j] = table[i][j] - (c * rowNew[j]);
                }
            }
        }

        System.arraycopy(rowNew, 0, table[pivotRow], 0, rowNew.length);
    }

    private float[] calculateRatios(int column){
        float[] positiveEntries = new float[rows];
        float[] res = new float[rows];
        int allNegativeCount = 0;
        for(int i = 0; i < rows; i++){
            if(table[i][column] > 0){
                positiveEntries[i] = table[i][column];
            }
            else{
                positiveEntries[i] = 0;
                allNegativeCount++;
            }

        }
        
        if(allNegativeCount == rows)
            this.solutionIsUnbounded = true;
        else{
            for(int i = 0;  i < rows; i++){
                float val = positiveEntries[i];
                if(val > 0){
                    res[i] = table[i][cols -1] / val;
                }}}
        return res;
    }
    

    private int findEnteringColumn(){
        float[] values = new float[cols];
        int location = 0;
        
        int pos, count = 0; 
        for(pos = 0; pos < cols-1; pos++){
            if(table[rows-1][pos] < 0){
                count++;
            }
        }
        
        if(count > 1){
            for(int i = 0; i < cols-1; i++)
                values[i] = Math.abs(table[rows-1][i]);
            location = findLargestValue(values);
        } else location = count - 1;
        
        return location;
    }
    
    private int findSmallestValue(float[] data){
        float minimum ;
        int c, location = 0;
        minimum = data[0];
        
        for(c = 1; c < data.length; c++){
            if(data[c] > 0){
                if(Float.compare(data[c], minimum) < 0){
                    minimum = data[c];
                    location  = c;
                }
            }
        }
        
        return location;
    }
    

    private int findLargestValue(float[] data){
        float maximum = 0;
        int c, location = 0;
        maximum = data[0];
        
        for(c = 1; c < data.length; c++){
            if(Float.compare(data[c], maximum) > 0){
                maximum = data[c];
                location  = c;
            }
        }
        
        return location;
    }

    public boolean checkOptimality(){
        boolean isOptimal = false;
        int vCount = 0;
        
        for(int i = 0; i < cols-1; i++){
            float val = table[rows-1][i];
            if(val >= 0){
                vCount++;
            }
        }
        
        if(vCount == cols-1){
            isOptimal = true;
        }
        
        return isOptimal;
    }

    public float[][] getTable() {
        return table;
    }
}