package Composite;

public class Main {
    public static void main(String[] args) {

        Element first = new Element("First");
        Element second = new Element("Second");
        Element third = new Element("Third");
        first.setNext(second);
        second.setNext(third);

        System.out.println(first);
        System.out.println(second.count());
    }
}
