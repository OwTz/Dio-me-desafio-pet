package org.owtz;

import org.owtz.models.Machine;
import org.owtz.models.MenuPainel;
import org.owtz.models.Pet;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
public class Main {
    static final Scanner sc = new Scanner(System.in);

    static final Machine machine = new Machine();

    public static void main(String[] args) {
        System.out.println("Começando o programa... ");
        int value = 0;

        do {
            System.out.println("escolha uma das opções para comerçarmos \n ");
            value = painelOption();
            System.out.println("a opc foi: " + value);
            switch (value){

                case 0 -> System.out.println("valor selecionado foi 0, fechando..");
                case 1 -> machine.setPet(adicionarPet());
                case 2 -> System.out.println("exibindo Pet na máquina: " +machine.getPet().getName());
                case 3 -> machine.retirarPet();
                case 4 -> machine.addShampoo();
                case 5 -> machine.addWhater();
                case 6 -> machine.banharPet();
                case 7 -> machine.getWhater();
                case 8 -> machine.getShampoo();



            }

        } while (value != 0);
    }


    public static int painelOption() {

        String panel = " ----- Menu -----";
        try {
            System.out.println("0 -> fechar programa ");
            optionMenu();
           int _value = sc.nextInt();
            return _value;
        } catch (Exception e) {
            System.out.println("this value not found " + e + "try again");
            painelOption();
        }
        return 0;
    }

    public static void optionMenu(){
        MenuPainel opc;
        ArrayList<Integer> opcs = new ArrayList<Integer>();
        for(var i : MenuPainel.values()){
            opcs.add(i.getValue());
        }

        for(Integer o: opcs){
            System.out.println("\n " +o+ " -> referente: "+ MenuPainel.values().getClass().getName() );
        }


    }
    public static Pet adicionarPet(){
        System.out.println("adicionando Pet á Máquina. \n Digite o nome do Pet:");
        String name = sc.next();

        var pet = new Pet(name);
        return pet;
    }
}
