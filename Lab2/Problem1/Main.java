/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
   
    void makeVoice() {
        System.out.println("Cow says: ");
    }
}

class Dog extends Animal {
   
    void makeVoice() {
        System.out.println("Dog says: ");
    }
}

class Pig extends Animal {
    
    void makeVoice() {
        System.out.println("Pig says: ");
    }
}

class Goat extends Animal {
    
    void makeVoice() {
        System.out.println("Goat says: ");
    }
}

class Lion extends Animal {
    
    void makeVoice() {
        System.out.println("Lion says: ");
    }
}

class Voice {
     Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}