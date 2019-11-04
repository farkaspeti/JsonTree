import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    
    private List<Node<T>> children = new ArrayList<>();
    
    private Node<T> parent;
    
    private T data;
    
    public Node(T data) {
        this.data = data;
    }
    
    public List<Node<T>> getChildren() {
        return children;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    private void setParent(Node<T> parent) {
        this.parent = parent;
    }
    
    public Node<T> getParent() {
        return parent;
    }
}
