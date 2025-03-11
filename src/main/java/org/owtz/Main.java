package org.owtz;

import java.util.Optional;
import java.util.Scanner;
public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Começando o programa... ");
        int value = 0;

        do {
            System.out.println("escolha uma das opções para comerçarmos \n ");
            value = painelOption();
            System.out.println("a opc foi: " + value);
            switch (value){
                case 1 -> System.out.println("valor selecionado foi 1");
                case 0 -> System.out.println("valor selecionado foi 0, fechando..");
            }

        } while (value != 0);
    }


    public static int painelOption() {

        String panel = " ----- Menu -----";
        try {
           int _value = sc.nextInt();
            return _value;
        } catch (Exception e) {
            System.out.println("this value not found " + e + "try again");
            painelOption();
        }
        return 0;
    }

}
