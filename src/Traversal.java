
public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    // <-- root
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);
    //     root -->
    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    System.out.print("\nPre Order:  ");
    preOrder(root);
    System.out.print("\nPost Order: ");
    postOrder(root);
    System.out.print("\nIn Order:   ");
    inOrder(root);
  }

  // Print a tree rooted at the given node in pre-order
  public static void preOrder(TreeNode node) {
    // if null return
    if (node == null) return;
    // print value
    System.out.print("["+ node.value +"]");
    // traverse left
    preOrder(node.left);
    // traverse right
    preOrder(node.right);
  }

  // Print a tree rooted at the given node in post-order
  public static void postOrder(TreeNode node) {
    // if null return
    if (node == null) return;
    // traverse left
    postOrder(node.left);
    // traverse right
    postOrder(node.right);
    // print value
    System.out.print("["+ node.value +"]");
  }

  // Print a tree rooted at the given node in order
  public static void inOrder(TreeNode node) {
    // if null return
    if (node == null) return;
    // traverse left
    postOrder(node.left);
    // print value
    System.out.print("["+ node.value +"]");
    // traverse right
    postOrder(node.right);
  }
}
