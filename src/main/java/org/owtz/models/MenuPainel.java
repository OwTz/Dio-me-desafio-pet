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
}
