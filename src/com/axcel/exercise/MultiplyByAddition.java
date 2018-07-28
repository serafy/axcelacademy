package com.axcel.exercise;


/**
 *
 * 
 * @author Ahmed EL-Serafy
 */
public class MultiplyByAddition {

    static int multiplyPositiveB(int a2, int b2){
        int c=0;
        c=c+a2;
        for(int i=0 ; i< b2-1; i++) {
            c=c+a2;
            //System.out.println("multNumbersPostivB: this is itration " +i + " the value of c = "+ c);
        }
        return c;
    }

    static int multiplyNumbers(int a1, int b1){
        int c=0;
        if (a1==0 || b1==0) {
            c=0;
            return c;
        }
        if (b1>= 0)
        {
           c= multiplyPositiveB(a1,b1);
        }
        else
        {
            c= multiplyPositiveB(a1,-b1);
            c = -c;
        }
        return c;
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
