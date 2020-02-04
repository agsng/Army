package main;

import java.util.ArrayList;

public class printResults {

    public static void  printmyResults(ArrayList<Integer> leb, boolean flag,ArrayList<String> armyTypeNames)
    {
        if(flag == false)
            System.out.println("LOSES ");
        else
            System.out.println("WINS ");

        for(int i=0;i<leb.size() ;i++)
        {
            System.out.print(leb.get(i)+armyTypeNames.get(i) +" ");
        }
    }
}
