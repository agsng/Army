package main;

import java.io.FileWriter;
import java.util.Scanner;

public class falicornia_input {

    public static void falicorniainput() {


        System.out.println("Enter the Falicornia Army count");
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int e = sc.nextInt();
        int at = sc.nextInt();
        int sg = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("C:\\Users\\SG0307820\\Test2\\src\\main\\input.txt");
            fw.write("FALICORNIA_ATTACK " +
                    String.format("%03d", h) + "HO " +
                    String.format("%03d", e) + "EL " +
                    String.format("%03d", at) + "AT " +
                    String.format("%03d", sg) + "SG");
            fw.close();
        } catch (Exception ee) {
            System.out.println(ee);
        }


    }
}
