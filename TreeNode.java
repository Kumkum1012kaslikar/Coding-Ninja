package Tree;

import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;
    public TreeNode<Integer> left;
    public TreeNode<Integer> right;

    public TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }

}
