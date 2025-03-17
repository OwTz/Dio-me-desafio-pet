package org.owtz.models;

public enum OptionsMenu {
    ADICIONARPET("adicionar pet"),SHOWPET("mostrar pet"),REMOVERPET("RETIRAR PET"),ADDSHAMPOO("ADICIONAR SHAMPOO")
    ,ADDWATER("ADICIONAR ÁGUA A MÁQUINA"),SHAWPET("BANHAR PET"),GETWATERNIVEL("VER NÍVEL DE ÁGUA"),GETSHAMPOONIVEL("VER NÍVEL DE SHAMPOO");


    private final String value;

    OptionsMenu(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}


/*  case 0 -> System.out.println("valor selecionado foi 0, fechando..");
/// /                case 1 -> machine.setPet(adicionarPet());
/// /                case 2 -> System.out.println("exibindo Pet na máquina: " +machine.getPet().getName());
/// /                case 3 -> machine.retirarPet();
/// /                case 4 -> machine.addShampoo();
/// /                case 5 -> machine.addWhater();
/// /                case 6 -> machine.banharPet();
/// /                case 7 -> machine.getWhater();
/// /                case 8 -> machine.getShampoo();

*/