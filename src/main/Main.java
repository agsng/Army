package main;


import java.util.Scanner;

import static main.falicornia_input.falicorniainput;
import  static main.army.getEachArmyCount;

    public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Army Types are there??");
        int n = 4;//sc.nextInt();
        falicorniainput();     // input the Falicornia army count

//        int [] LengaburuArmyCount = new int[n];
//        for(int i=0;i<n;i++)
//            LengaburuArmyCount[i]=sc.nextInt();
           /* here we know the lengaburuarmy count so initializing the array*/
        int [] LengaburuArmyCount = new int[]{100,50,10,5};
        int [] falicorniaArmyCount = new int[n];

        for(int j=0;j<4;j++)
        falicorniaArmyCount[j] = getEachArmyCount(j,n);
//        for(int j=0;j<4;j++)
//            System.out.print(falicorniaArmyCount[j]+" ");


    }
}
