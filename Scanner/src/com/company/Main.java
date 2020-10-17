package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite um nome");
        Scanner scannertest = new Scanner(System.in);  //System.in read command line
        String insertedString = scannertest.nextLine();
        scannertest.close();

        System.out.println("Word is:  "+insertedString);

    }
}
