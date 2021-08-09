package State.Patern;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");

        a.addAdj(b);
        b.addAdj(c);
        c.addAdj(d);
        d.addAdj(b);
        a.addAdj(e);
        e.addAdj(f);
        f.addAdj(c);
        f.addAdj(g);
        f.addAdj(h);
        a.addAdj(h);

        System.out.println(a.getAdjacent());

        /**
        List<Node> list = new ArrayList<>();
        a.deepSearch(list);
        for (Node node: list){
            System.out.println(node);
        }
         */
    }
}
