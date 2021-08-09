package State.Patern.Using.Enum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeEnum {

    private final Set<NodeEnum> adjacent = new HashSet<>();
    private final String name;
    private ColorEnum colorEnum;

    public NodeEnum(String name) {
        this.name = name;
        colorEnum = ColorEnum.WHITE;
    }

    public void deepSearch(List<NodeEnum> list) {
        colorEnum.find(this, list);
    }

    public Set<NodeEnum> getAdjacent() {
        return adjacent;
    }

    public void addAdj(NodeEnum adj) {
        adjacent.add(adj);
    }

    public void setColor(ColorEnum colorEnum, List<NodeEnum> list) {
        this.colorEnum = colorEnum;
        colorEnum.tookOn(this, list);
    }

    public String toString() {
        return name;
    }
}
