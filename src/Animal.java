class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says : wee wee");


    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: woos woos");

    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myP = new pig();
        Animal myD = new Dog();

        myAnimal.animalSound();
        myD.animalSound();
        myP.animalSound();
    }
}