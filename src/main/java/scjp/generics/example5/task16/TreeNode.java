package scjp.generics.example5.task16;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();

    public TreeNode(T data) {
        this.data = data;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public T getData() {
        return data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }
}

