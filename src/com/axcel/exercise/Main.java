package com.axcel.exercise;

public class Main {

    public static void testLoops(){
        int a = 5;
        int j = 0;
        for (int i = 0; i < 5;i++) {
            a = a + (i*2);
            System.out.println("for: i = "+i+ " a= "+a);
            i=4;
        }
        j= 0;
        while ( j < 5) {
            a = a + (j*2);
            System.out.println("while: i = "+j+ " a= "+a);
            j++;
        }
        j=0;
        do {
            a = a + (j*2);
            System.out.println("do-while: i = "+j+ " a= "+a);
            j++;
        }while ( j < 5);

    }

    static void testCond(){

        int a = 10;
        int b = 7;
        int c = 2;

        if (a<b ){
            System.out.println("a<b");

        } else if (b<c){
            System.out.println("b<c");
        }else {
            System.out.println("defualt");
        }




    }
/*
    public static void main(String[] args) {
	// write your code here

        String msg = "this is runnign class Cube";
        System.out.println(msg) ;

        Cube cube1 = new Cube();
        Cube cube2 = new Cube();

        cube2.setSide(3);
        cube1.setSide(4);

        cube1.setSide(1.5);
        cube1.setSide(2.345);

        System.out.println("Cube 1 of side: "+cube1.getSide()+ " has a volume of: "+ cube1.getVolum());

        //testLoops();
        testCond();
    }
*/
    public static void main(String[] args) {


        String msg = "this is runnign class ColorCube";
        System.out.println(msg) ;

        MyShape cube1 = new Sh1(2,3,5);
        MyShape cube2 = new ColorCube(3);
        //ColorCube cube1 = new ColorCube(1);
        //Cube cube2 = new Cube(3);



        //cube2.setSide(3);

        //cube1.setSide(1.5);
        //cube2.setSide(2.345);

        System.out.println(
                " has a volume of: "+ cube1.getVolum() +
                " has a NAME of: "+cube1
                  );
        System.out.println("Cube 2 of side: "+
                " has a volume of: "+ cube2.getVolum()+
                " has a NAME of: "+cube2
                );

    }
}
