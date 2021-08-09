package Composite;

public class Element {
    private Object value;
    private Element next;

    public Element(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public int count(){
        if (next == null){
            return 1;
        }
        return 1 + count();
    }

    @Override
    public String toString() {
        return "Element{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
