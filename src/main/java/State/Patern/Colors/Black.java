package State.Patern.Colors;

import State.Patern.Color;
import State.Patern.Node;

import java.util.List;

public class Black extends Color {
    public void tookOn(Node node, List<Node> list) {
        list.add(node);
    }
}
