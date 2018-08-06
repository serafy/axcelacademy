/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axcel;

/**
 *
 * @author ahmedel-serafy
 */
public class RunClass {
    
    
    public static void main(String[] args){
         NameList m;
        m = new NameList();
        int[] ids = new int[] {10, 3, 8,7, 9, 1, 5};
        String[] names =  new String[] {"A10"," B3","M8","W 2", "BB 9", "SS 1", "AA 5"};
        for (int i = 0; i <ids.length ; i++) {
            m.addName(ids[i],names[i]);
        }


        int input = 10;
        String output = m.findName(input);
        output = (output==null)? "---- Not Found --" :output;
        System.out.println("The name for id: "+input+" is: " + output );

        String inputStrin = "m8";
        Integer outInt = m.findId(inputStrin);
        output = (outInt==null)?"---Not Found --":" "+outInt;
        System.out.println("The id for name : "+inputStrin+" is: " + output );
        
    }
    
}
