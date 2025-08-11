package scjp.generics.example5.task16;

public class App {
    public static void main(String[] args) {
        TreeNode<String> tree = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        tree.addChild(child1);
        tree.addChild(child2);

        System.out.println(tree.getData());
        for (TreeNode<?> child : tree.getChildren()) {
            System.out.println(child.getData());
        }
    }
}
