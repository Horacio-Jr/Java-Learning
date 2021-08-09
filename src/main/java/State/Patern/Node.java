package State.Patern;

import State.Patern.Colors.White;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

    private Set<Node> adjacent = new HashSet<>();
    private Color color;
    private String name;

    public Node(String name) {
        this.name = name;
        color = new White();
    }

    public void deepSearch(List<Node> list){
        color.find(this, list);
    }

    public Set<Node> getAdjacent() {
        return adjacent;
    }

    public void addAdj(Node adj){
        adjacent.add(adj);
    }

    public void setColor(Color color, List<Node> list) {
        this.color = color;
        color.tookOn(this, list);
    }

    public String toString(){
        return name;
    }
}
