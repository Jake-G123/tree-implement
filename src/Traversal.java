public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);
    // <-- root
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);
    //     root -->
    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);


    TreeNode<String> stringRoot = new TreeNode<>("Hello");
    // <-- stringRoot
    stringRoot.left = new TreeNode<>("world");
    stringRoot.left.left = new TreeNode<>("test");
    stringRoot.left.right = new TreeNode<>("1234");
    //     stringroot -->
    stringRoot.right = new TreeNode<>("abcd");
    stringRoot.right.left = new TreeNode<>("node");
    stringRoot.right.right = new TreeNode<>("another node");
    stringRoot.right.right.right = new TreeNode<>("another another node");

    System.out.print("\nPre Order:  ");
    preOrder(root);
    System.out.print("\nPost Order: ");
    postOrder(root);
    System.out.print("\nIn Order:   ");
    inOrder(root);

    System.out.print("\nPre Order:  ");
    preOrder(stringRoot);
    System.out.print("\nPost Order: ");
    postOrder(stringRoot);
    System.out.print("\nIn Order:   ");
    inOrder(stringRoot);

    System.out.print("\nPrint Greater:  ");
    printGreater(root, 7);

    System.out.print("\nPrint node count:  ");
    System.out.print(countNodes(root));
  }

  // Print a tree rooted at the given node in pre-order
  public static void preOrder(TreeNode<?> node) { // can't use ? in body
    if (node == null) return;
    System.out.print(" ["+ node.value +"]");
    preOrder(node.left);
    preOrder(node.right);
  }

  // Print a tree rooted at the given node in post-order
  public static <T> void postOrder(TreeNode<T> node) { // can use T in body
    if (node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(" ["+ node.value +"]");

    //List<T> myList = new ArrayList<>();
    //myList.add(node.value);
  }

  // Print a tree rooted at the given node in order
  public static <E> void inOrder(TreeNode<E> node) {
    if (node == null) return;
    postOrder(node.left);
    System.out.print(" ["+ node.value +"]");
    postOrder(node.right);
  }

  // Print a tree rooted at the given node in pre-order where node values > threshold value
  public static void printGreater(TreeNode<Integer> node, int threshold) {
    if (node == null) return;
    if (node.value > threshold) System.out.print(" ["+ node.value +"]");
    printGreater(node.left, threshold);
    printGreater(node.right, threshold);
  }

  public static int countNodes(TreeNode<?> node) {
    return countNodes(node, 0);
  }

  private static int countNodes(TreeNode<?> node, int count) {
    if (node == null) return count;
    count++;
    count = countNodes(node.left, count);
    count = countNodes(node.right, count);
    return count;
  }
}
