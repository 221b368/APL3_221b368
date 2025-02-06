public class Test implements Testable{
    public void display(){
        System.out.println("Display...");
    }
}
//If Test doen'nt define the mehtod display
//Test.java:1: error: Test is not abstract and does not override abstract method display() in Testable
//public class Test implements Testable{