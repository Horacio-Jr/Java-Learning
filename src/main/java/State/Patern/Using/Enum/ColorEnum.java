package State.Patern.Using.Enum;

import java.util.List;

public enum ColorEnum {
    WHITE {
        public void find(NodeEnum node, List<NodeEnum> list) {
            node.setColor(GREY, list);
        }
    }, GREY {
        public void tookOn(NodeEnum node, List<NodeEnum> list) {
            for (NodeEnum adjNode : node.getAdjacent()) {
                adjNode.deepSearch(list);
                node.setColor(BLACK, list);
            }
        }
    }, BLACK {
        public void tookOn(NodeEnum node, List<NodeEnum> list) {
            list.add(node);
        }
    };

    void find(NodeEnum node, List<NodeEnum> list) {
    }

    void tookOn(NodeEnum node, List<NodeEnum> list) {
    }

}
