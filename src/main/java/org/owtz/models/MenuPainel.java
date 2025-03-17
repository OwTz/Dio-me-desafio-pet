package org.owtz.models;

public enum MenuPainel {
    ADD_PET(2), REMOVE_PET(3), ADD_WATER(4), ADD_SHAMPOO(5);

    private final int value;

    MenuPainel(int i) {
        value = i;
    }
    public int getValue(){
        return this.value;
    }

    public String getValueName(){
        switch (this.value) {
            case 1 -> {return "adicionar Pet";}
            case 2  -> { return "show pet in machine"; }
            case 3 -> { return  "remove pet"; }
            case 4 -> { return  "add shampoo"; }
            case 5 -> { return  "add water"; }
            case 6 -> { return  "Banhar pet"; }
            case 7 -> { return  "Ver nível de água"; }
            case 8 -> { return  "Ver nível de Shampoo"; }
        }
        return "Not Found";
    }
}


//*  case 0 -> System.out.println("valor selecionado foi 0, fechando..");
//                case 1 -> machine.setPet(adicionarPet());
//                case 2 -> System.out.println("exibindo Pet na máquina: " +machine.getPet().getName());
//                case 3 -> machine.retirarPet();
//                case 4 -> machine.addShampoo();
//                case 5 -> machine.addWhater();
//                case 6 -> machine.banharPet();
//                case 7 -> machine.getWhater();
//                case 8 -> machine.getShampoo();
