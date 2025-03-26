/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

interface Quack {
    void quack();
}

class RubberDuck implements Swim, Quack {
    public void swim() {
        System.out.println("Rubber Duck swims");
    }

    public void quack() {
        System.out.println("Rubber Duck squeaks");
    }
}

class WoodenDuck implements Swim {
    public void swim() {
        System.out.println("Wooden Duck swims");
    }
}

class RedHeadDuck implements Swim, Fly, Quack {
    public void swim() {
        System.out.println("RedHead Duck swims");
    }

    public void fly() {
        System.out.println("RedHead Duck flies");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks");
    }
}

class LakeDuck implements Swim, Fly, Quack {
    public void swim() {
        System.out.println("Lake Duck swims");
    }

    public void fly() {
        System.out.println("Lake Duck flies");
    }

    public void quack() {
        System.out.println("Lake Duck quacks");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rd = new RubberDuck();
        WoodenDuck wd = new WoodenDuck();
        RedHeadDuck rhd = new RedHeadDuck();
        LakeDuck ld = new LakeDuck();

        rd.swim();
        rd.quack();

        wd.swim();

        rhd.swim();
        rhd.fly();
        rhd.quack();

        ld.swim();
        ld.fly();
        ld.quack();
    }
}