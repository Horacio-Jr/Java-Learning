package State.Patern.Colors;

import State.Patern.Color;
import State.Patern.Node;

import java.util.List;

public class White extends Color {
    public void find(Node node, List<Node> list){
        node.setColor(new Grey(), list);
    }
}
