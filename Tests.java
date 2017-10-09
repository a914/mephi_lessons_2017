
package lab01;


public class Tests {
    public static void main (String[] args){
        simmsearch s = new simmsearch();
        double delta = 0.0001;
        double eps = 0.01;
        //function1
        System.out.println("Function1 minimum");
        double r1 = s.MinBiS(-1,1,eps,delta,1);
        double r2 = s.MinGoldS(-1,1,eps,1);
        if (Math.abs(r1-0)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r1);
        if (Math.abs(r2-0)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r1);
        
        System.out.println("Function1 maximum");
        double r3 = s.MaxBiS(-2,2,eps,delta,1);
        double r4 = s.MaxGoldS(-2,2,eps,2);
        if (Math.abs(r3+1)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r3);
        if (Math.abs(r4+1)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r4);
        //function2
        System.out.println("Function2 minimum");
        double r5 = s.MinBiS(2,4,eps,delta,2);
        double r6 = s.MinGoldS(2,4,eps,2);
        if (Math.abs(r5-Math.PI)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r5);
        if (Math.abs(r6-Math.PI)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r6);
        
        System.out.println("Function2 maximum");
        double r7 = s.MaxBiS(-1,1,eps,delta,2);
        double r8 = s.MaxGoldS(-1,1,eps,2);
        if (Math.abs(r7-0)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r7);
        if (Math.abs(r8-0)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r8);
         //function3
        System.out.println("Function3 minimum");
        double r9 = s.MinBiS(1,3,eps,delta,3);
        double r10 = s.MinGoldS(1,3,eps,3);
        if (Math.abs(r9-2)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r9);
        if (Math.abs(r10-2)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r10);
        
        System.out.println("Function3 maximum");
        double r11 = s.MaxBiS(1,3,eps,delta,3);
        double r12 = s.MaxGoldS(1,3,eps,3);
        if (Math.abs(r11-0)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r11);
        if (Math.abs(r12-0)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r12);
         //function4
        System.out.println("Function4 minimum");
        double r13 = s.MinBiS(0,2,eps,delta,4);
        double r14 = s.MinGoldS(0,2,eps,4);
        if (Math.abs(r13-1)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r13);
        if (Math.abs(r14-1)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r14);
        
        System.out.println("Function4 maximum");
        double r15 = s.MaxBiS(-2,0,eps,delta,4);
        double r16 = s.MaxGoldS(-2,0,eps,4);
        if (Math.abs(r15+0.999)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r15);
        if (Math.abs(r16+0.999)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r16);
         //function5
        System.out.println("Function5 minimum");
        double r17 = s.MinBiS(0,4,eps,delta,5);
        double r18 = s.MinGoldS(0,4,eps,5);
        if (Math.abs(r17-1)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r17);
        if (Math.abs(r18-1)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r18);
        
        System.out.println("Function5 maximum");
        double r19 = s.MaxBiS(-5,5,eps,delta,5);
        double r20 = s.MaxGoldS(-5,5,eps,5);
        if (Math.abs(r19-1.999)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r19);
        if (Math.abs(r20-1.999)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r20);
             //function6
        System.out.println("Function6 minimum");
        double r21 = s.MinBiS(0,1,eps,delta,6);
        double r22 = s.MinGoldS(0,1,eps,6);
        if (Math.abs(r21-0.668)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r21);
        if (Math.abs(r22-0.668)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r22);
        
        System.out.println("Function6 maximum");
        double r23 = s.MaxBiS(-0.5,0.5,eps,delta,6);
        double r24 = s.MaxGoldS(-0.5,0.5,eps,6);
        if (Math.abs(r23+0)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r23);
        if (Math.abs(r24+0)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r24);
             //function7
        System.out.println("Function7 minimum");
        double r25 = s.MinBiS(0.5,1.5,eps,delta,7);
        double r26 = s.MinGoldS(0.5,1.5,eps,7);
        if (Math.abs(r25-1)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r25);
        if (Math.abs(r26-1)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r26);
        
        System.out.println("Function7 maximum");
        double r27 = s.MaxBiS(-0.5,0.5,eps,delta,7);
        double r28 = s.MaxGoldS(-0.5,0.5,eps,7);
        if (Math.abs(r27-0)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r27);
        if (Math.abs(r28-0)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r28);
             //function8
        System.out.println("Function8 minimum");
        double r29 = s.MinBiS(2,4,eps,delta,8);
        double r30 = s.MinGoldS(2,4,eps,8);
        if (Math.abs(r29-2.998)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r29);
        if (Math.abs(r30-2.998)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r30);
        
        System.out.println("Function8 maximum");
        double r31 = s.MaxBiS(-3,0,eps,delta,8);
        double r32 = s.MaxGoldS(-3,0,eps,8);
        if (Math.abs(r31+1.6334)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r31);
        if (Math.abs(r32+1.6334)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r32);
        //function9
        System.out.println("Function9 minimum");
        double r33 = s.MinBiS(5,7,eps,delta,9);
        double r34 = s.MinGoldS(5,7,eps,9);
        if (Math.abs(r33-5.729)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r33);
        if (Math.abs(r34-5.729)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r34);
        
        System.out.println("Function9 maximum");
        double r35 = s.MaxBiS(2,3,eps,delta,9);
        double r36 = s.MaxGoldS(2,3,eps,9);
        if (Math.abs(r35-2.591)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r35);
        if (Math.abs(r36-2.591)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r36);
        //function10
        System.out.println("Function10 minimum");
        double r37 = s.MinBiS(1,3,eps,delta,10);
        double r38 = s.MinGoldS(1,3,eps,10);
        if (Math.abs(r37-2.219)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r37);
        if (Math.abs(r38-2.219)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r38);
        
        System.out.println("Function10 maximum");
        double r39 = s.MaxBiS(0,1,eps,delta,10);
        double r40 = s.MaxGoldS(0,1,eps,10);
        if (Math.abs(r39-0.449)>eps) System.out.println("Error");
        else 
        System.out.println("Bisection result:"+r39);
        if (Math.abs(r40-0.449)>eps) System.out.println("Error");
        else 
        System.out.println("Goldsection result:"+r40);
       
        
    }
}
