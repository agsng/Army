package main;

import java.util.*;
import java.io.*;

public class army {

    private static ArrayList<Integer> armytypes= new ArrayList<>();
    private static ArrayList<String> amytypenames = new ArrayList<>();
    private static String inputpath = "C:\\Users\\SG0307820\\Test2\\src\\main\\input.txt";
    private static String stringRead = "";


    public static void army(int n){

        Scanner input = null;
        try {
            input = new Scanner(new File(inputpath));
        }
        catch (FileNotFoundException s) {
            System.out.println("File does Not Exist Please Try Again: ");
        }

        int x =0;
        while (input.hasNext()) {
            stringRead = input.next();
            if(x==0){x++;}
            else
            {  //System.out.println(Integer.parseInt(stringRead.substring(0,3)));
                armytypes.add(Integer.parseInt(stringRead.substring(0,3)));
                amytypenames.add(stringRead.substring(3,5));
            }
        }
//        for(int i = 0; i < armytypes.size(); i++) {
//            System.out.println(armytypes.get(i));
//        }
    }

    public static  ArrayList<Integer> getArmyCount(int n)       //getter
    {    army(n);
        return armytypes;
    }
    public static ArrayList<String> getArmyTypeNames()
    {
        return amytypenames;
    }
}


