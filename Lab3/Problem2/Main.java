interface Testable {
    void display(); 
}


class Test implements Testable {
    public void display() { 
        System.out.println("Display method in Test class");
    }
}


abstract class AbsTest implements Testable {
    
}


public class Main {
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.display();
    }
}