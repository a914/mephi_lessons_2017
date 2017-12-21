

        
public class main {

    public static void main(String[] args) {
        
        boolean quit = false;
        
        //макисмум 2x+5y
        // 2x+2y=8
        // x+2y=6
        float[][] standardized =  {
                { 2,   2,    1,  0,   8},
                { 1,   2,    0,  1,   6},
                {-2,  -5,    0,  0,   0}
        };
        
       
        Simplex simplex = new Simplex(2, 4);
        
        simplex.fillTable(standardized);

       
        System.out.println("Начальные данные");
        simplex.print();
        
        
        while(!quit){
            Simplex.ERROR err = simplex.compute();

            if(err == Simplex.ERROR.IS_OPTIMAL){
                simplex.print();
                quit = true;
            }
            else if(err == Simplex.ERROR.UNBOUNDED){
                System.out.println("Решение неограничено");
                quit = true;
            }
        }
    } 
}