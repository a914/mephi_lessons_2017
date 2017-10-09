
package lab01;


public class simmsearch {
    double function(double x, int i){
            switch (i)
            {
                case 1: return Math.pow(x,2); 
                case 2: return Math.cos(x);
                case 3: return Math.pow(x, 2) - 4*x;
                case 4: return Math.pow(x,3)-3*x;
                case 5: return 4*x - Math.pow(x, 2);
                case 6: return Math.pow(x, 3) - Math.pow(x, 2)+1;
                case 7: return Math.pow(Math.pow(x,2)-1, 2);
                case 8: return Math.pow(x-3, 2);
                case 9: return Math.sin(x-45);
                case 10: return Math.pow(x-1, 3)- Math.pow(x, 2);
                default: return x;
            }   
}
    public double MinBiS (double a, double b, double eps, double delta, int i){
        double x1, x2;
        while ((b-a)/2 >= eps) {
        x1=(a+b-delta)/2;
        x2=(a+b+delta)/2;
        if (function(x1,i)>function(x2,i)){
            a=x1;
        }else{
            b=x2;
        }
    }
        return (a+b)/2;
    }
    
     public double MaxBiS (double a, double b, double eps, double delta, int i){
        double x1, x2;
        while ((b-a)/2 >= eps) {
        x1=(a+b-delta)/2;
        x2=(a+b+delta)/2;
        if (function(x1,i)<function(x2,i)){
            a=x1;
        }else{
            b=x2;
        }
    }
        return (a+b)/2;
    }
     
    public double MinGoldS(double a, double b, double eps, int i){
        double phi, x1, x2;
            phi = ((1+Math.sqrt(5))/2); 
            x1 = b-(b-a)/phi;
            x2 = a + (b-a)/phi;
            while ((b - a) / 2 >= eps){
                if (function(x1,i) > function(x2,i))
                {
                    a = x1;
                    x1 = x2;
                    x2 = b - (x1 - a);
                }
                else
                {
                    b = x2;
                    x2 = x1;
                    x1 = a + (b - x2);
                }
            }
            return (a + b)/2;
    }
    
     public double MaxGoldS(double a, double b, double eps, int i){
        double phi, x1, x2;
            phi = ((1+Math.sqrt(5))/2); 
            x1 = b-(b-a)/phi;
            x2 = a + (b-a)/phi;
            while ((b - a) / 2 >= eps){
                if (function(x1,i) < function(x2,i))
                {
                    a = x1;
                    x1 = x2;
                    x2 = b - (x1 - a);
                }
                else
                {
                    b = x2;
                    x2 = x1;
                    x1 = a + (b - x2);
                }
            }
            return (a + b)/2;
    }
     
     
    }