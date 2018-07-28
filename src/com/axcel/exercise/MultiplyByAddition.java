package com.axcel.exercise;


/**
 * <h>This class is an Implemntation to the Multiply By Addition Algorithm  </>
 *
 * This Algorithm is to Multiply two numbers a and b
 * where both a and b are Integers
 * and stores the result in c
 *
 * AL1:
 * 1. set c = 0
 * 2. set c = c + a
 * 3. repeat step 2 for (b-1) times
 * 4. end
 *
 *
 * Multiply:
 * 1. if a is 0 or b is 0 then
 *      1.1 set c = 0
 *      1.2 end
 * 2. if b grater then 0 then
 *      2.1 execute AL1 with input a and b
 *      2.2 set c to the result of AL1
 * 3. if b less then 0 then
 *      3.1 execute AL1 with input a and -b
 *      3.2 set c to the negative of the result of AL1
 *  4. end
 *
 * @author Ahmed EL-Serafy
 */
public class MultiplyByAddition {

    /**
     *   Calculate the multiplication of two numbers
     *   AL1:
     *   1. set c = 0
     *   2. set c = c + a
     *   3. repeat step 2 for (b-1) times
     *   4. end
     *
     * @param a2 the 1st number can be any integer
     * @param b2 the 2nd number must be b2>0
     * @return c which is a2*b2
     */
    static int multiplyPositiveB(int a2, int b2){
        int c=0;                                    //  1. set c = 0
        c= c + a2;                                  //  2. set c = c + a
        for(int i=0 ; i< b2-1; i++) {               //  3. repeat step 2 for (b-1) times
            c= c + a2;                              //            step 2
//            System.out.println("multiplyPositiveB:"
//                    + " this is iteration: "
//                    +i
//                    + " the value of c = "
//                    + c);
        }
        return c;                                   // 4. end
    }

    /**
     * Calculate the multiplication of two numbers
     * Multiply:
     *  1. if a is 0 or b is 0 then
     *       1.1 set c = 0
     *       1.2 end
     *  2. if b grater then 0 then
     *       2.1 execute AL1 with input a and b
     *       2.2 set c to the result of AL1
     *
     *  3. if b less then 0 then
     *       3.1 execute AL1 with input a and -b
     *       3.2 set c to the negative of the result of AL1
     *
     *   4. end
     *
     * @param a1 the 1st number can be any integer
     * @param b1 the 2nd number can be any integer
     * @return c which is a1*b1
     */
    static int multiplyNumbers(int a1, int b1){
        int c=0;
        if (a1==0 || b1==0) {             // 1. if a is 0 or b is 0 then
            c=0;                          //      1.1 set c = 0
            return c;                     //      1.2 end
        }
        if (b1> 0) {                      // 2. if b grater then 0 the
           c= multiplyPositiveB(a1,b1);   //      2.1 execute AL1 with input a and b
                                          //      2.2 set c to the result of AL1
        }                                 //
        else if (b1 < 0){                 // 3. if b less then 0 then
            c= multiplyPositiveB(a1,-b1); //      3.1 execute AL1 with input a and -b
            c = -c;                       //      3.2 set c to the negative of the result of AL1
        }
        return c;                         // 4. end
    }

    static boolean testMultiplyNumbers(){
        int a =0;
        int b =0;
        int answer= 0;
        int correctAnswer =0;

        // test case 1 a=0 b=0 correctAnswer=0
        a=0;
        b=0;
        correctAnswer =0;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 2 a=5 b=0 correctAnswer=0
        a=5;
        b=0;
        correctAnswer =0;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 3 a=0 b=3 correctAnswer=0
        a=0;
        b=3;
        correctAnswer =0;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 3 a=4 b=3 correctAnswer=0
        a=4;
        b=3;
        correctAnswer =12;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 4 a=-4 b=3 correctAnswer=0
        a=-4;
        b=3;
        correctAnswer =-12;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 5 a=-4 b=-6 correctAnswer=0
        a=-4;
        b=-6;
        correctAnswer =24;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        // test case 6 a=4 b=-5 correctResut=0
        a=4;
        b=-5;
        correctAnswer =-20;
        answer= multiplyNumbers(a,b);
        if (answer != correctAnswer){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a=500;
        int b=3453;
        int c= multiplyNumbers(a,b);
        System.out.println("The final result for: " + a +"*"+ b + " is "+ c);


        boolean testResult = testMultiplyNumbers();
        System.out.println("The test for testMultiplyNumbers: is "+ testResult);
    }



}
