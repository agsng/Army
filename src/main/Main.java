package main;

import java.util.*;

import static main.army.getArmyTypeNames;
import static main.calculate.calccc;

import static main.army.getArmyCount;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> LengaburuArmyCount = new ArrayList<>(Arrays.asList(100,50,10,5,8));
        int n = LengaburuArmyCount.size();

        ArrayList<Integer> falicorniaArmyCount =  getArmyCount(n);
        ArrayList<String> armyTypeNames = getArmyTypeNames();

        calccc(LengaburuArmyCount,falicorniaArmyCount,armyTypeNames,n);

    }
}
