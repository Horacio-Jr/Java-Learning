package State.Patern.Colors;

import State.Patern.Color;
import State.Patern.Node;

import java.util.List;

public class Grey extends Color {
    public void tookOn(Node node, List<Node> list) {
        for (Node adjNode: node.getAdjacent()) {
                adjNode.deepSearch(list);
                node.setColor(new Black(), list);
        }
    }
}
