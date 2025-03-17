package org.owtz.models;

public class Machine {

    private int whater,shampoo;

    private Pet pet;

    public Machine(){
        this.setWhater(30);
        this.setShampoo(10);


    }

    public void banharPet(){
        if (this.pet.isBanho() || this.getWhater() <= 0 || this.getShampoo() <= 0){
            System.out.println("o pet não pode tomar banho");
        }
        else{
            this.getPet().setBanho(true);
            System.out.println("o pet: " +this.getPet().getName()+ " foi banhado com sucesso!");
        }
    }

    public void adicionarPet(Pet pet){
        if(!this.getPet().equals(null)){
            System.out.println("o pet não pode ser adicionado");
            return;
        }
        this.setPet(pet);
    }

    public void retirarPet(){
        if(!this.getPet().isBanho() || this.getPet()==null){
            System.out.println("o pet não tomou banho!");
        }
        else {
            this.pet=null;
        }
    }

    public void addWhater(){
        if (this.getWhater() >=30){
            System.out.println("água está na capacidade máxima");
            return;
        }
        this.setWhater(this.getWhater()+10);
    }
    public void addShampoo(){
        if (this.getShampoo() >=30){
            System.out.println("água está na capacidade máxima");
            return;
        }
        this.setWhater(this.getShampoo()+10);
    }

    public int getWhater() {
        return whater;
    }

    public void setWhater(int whater) {
        this.whater = whater;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
