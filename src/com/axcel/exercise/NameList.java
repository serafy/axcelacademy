package com.axcel.exercise;

import java.util.Enumeration;
import java.util.Hashtable;



public class NameList {

    /**
     * Inner Calss to store the record of Name and ID
     */
    private class NameId {
        int id;
        String name;

        public NameId(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    private Hashtable<Integer,NameId>  nameIdTable;

    NameList(){
        nameIdTable = new Hashtable<Integer,NameId> ();
    }

    /**
     * Add a new recored to the store
     * @param id the id of the person
     * @param name name
     */
    void addName(int id,String name){
        nameIdTable.put(new Integer(id),new NameId (id,name));
    }

    /**
     * Find the name for a givin ID
     * @param id
     * @return
     */
    String findName(int id){

        if (nameIdTable.containsKey(new Integer(id))) {
            NameId ni = nameIdTable.get(new Integer(id));
            return ni.name;
        }
        return null;
    }

    Integer findId(String name){
        Enumeration<NameId> en = nameIdTable.elements();
        while(en.hasMoreElements()){
            NameId ni = en.nextElement();
            if(name.equalsIgnoreCase(ni.name)){
                return ni.id;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        NameList m;
        m = new NameList();
        int[] ids = new int[] {10, 3, 8,7, 9, 1, 5};
        String[] names =  new String[] {"A10"," B3","M8","W 2", "BB 9", "SS 1", "AA 5"};
        for (int i = 0; i <ids.length ; i++) {
            m.addName(ids[i],names[i]);
        }


        int input = 3;
        String output = m.findName(input);
        output = (output==null)? "---- Not Found --" :output;
        System.out.println("The name for id: "+input+" is: " + output );

        String inputStrin = "BB 9 h";
        Integer outInt = m.findId(inputStrin);
        output = (outInt==null)?"---Not Found --":" "+outInt;
        System.out.println("The id for name : "+inputStrin+" is: " + output );


    }


}
