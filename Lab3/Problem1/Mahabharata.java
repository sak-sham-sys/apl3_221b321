/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    abstract void fight(); // All Bharatvanshis were fighters
}


class Pandav extends Bharatvanshi {
    void fight() {
        System.out.println("I am a Pandav, and I am a great fighter.");
    }

    void obey() {
        System.out.println("I am obedient.");
    }

    void kind() {
        System.out.println("I am kind.");
    }
}


class Arjun extends Pandav {
    void display() {
        System.out.println("I am Arjun, a skilled fighter, obedient, and kind.");
    }
}


class Bheem extends Pandav {
    void kind() {
        System.out.println("I am less kind, but still obedient.");
    }

    void display() {
        System.out.println("I am Bheem, a powerful warrior but less kind.");
    }
}


class Kaurav extends Bharatvanshi {
    void fight() {
        System.out.println("I am a Kaurav, and I am a great fighter.");
    }

    void obey() {
        System.out.println("I disobey rules.");
    }

    void kind() {
        System.out.println("I am cruel.");
    }
}


class Vikarn extends Kaurav {
    void obey() {
        System.out.println("I am obedient.");
    }

    void kind() {
        System.out.println("I am kind.");
    }

    void display() {
        System.out.println("I am Vikarn, a noble Kaurav.");
    }
}


public class Mahabharata {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

      
        arjun.display();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println();

        bheem.display();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println();

        System.out.println("Duryodhan's characteristics:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println();

        vikarn.display();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}

