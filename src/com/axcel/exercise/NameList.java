package com.axcel.exercise;

public class NameList {
    int[] ids;
    String[] names;

    String findName(int num){
        for(int i =ids.length-1 ; i>-1 ;i--) {
            if(ids[i]== num){
                //System.out.println("The name for id: "+num+" is: " + names[i]);
                return names[i];
            }
        }

        //System.out.println("No Name found for id: "+num);
        return "-- NOT Found --";
    }

    public static void main(String[] args) {

        NameList m;
        m = new NameList();
        m.ids = new int[] {10, 3, 8,2, 9, 1, 5};
        m.names =  new String[] {"A10"," B3","M8","W 2", "BB 9", "SS 1", "AA 5"};;

        int input = 100;
        String output = m.findName(input);
        System.out.println("The name for id: "+input+" is: " + output);

    }
}
