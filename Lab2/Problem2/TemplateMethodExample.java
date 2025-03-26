/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Voice2 {
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    protected abstract void prepareVoice();
    protected abstract void hear();
}

class DogVoice extends Voice2 {
    @Override
    protected void prepareVoice() {
        System.out.println("Dog is taking a deep breath...");
    }

    @Override
    protected void hear() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class CatVoice extends Voice2 {
    @Override
    protected void prepareVoice() {
        System.out.println("Cat is clearing its throat...");
    }

    @Override
    protected void hear() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class TemplateMethodExample {
    public static void main(String[] args) {
        Voice2 dog = new DogVoice();
        dog.templateMethod();

        System.out.println();

        Voice2 cat = new CatVoice();
        cat.templateMethod();
    }
}