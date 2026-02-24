/**
 * A utility class for performing operations on a binary tree of Strings.
 */
public class QuickCheck {

  /**
   * Prints all strings longer than 7 characters in a tree.
   * The strings should be printed in pre-order.
   * Each qualifying string should appear on its own line.
   * 
   * If the node itself is null, the method should print nothing.
   * 
   * You can assume that there are no null Strings stored in the tree nodes.
   *
   * @param node the root node of the binary tree
   */
  public static void printLongerThan7(TreeNode<String> node) {
    // if node is null, return
    if (node == null ) return;
    // if the length of the node.value is greater than 7
    if (node.value.length() > 7) {
      // print the value of the current node
      System.out.println(node.value);
    }  
    // traverse down the left subtree
    printLongerThan7(node.left);
    // traverse down the right subtree
    printLongerThan7(node.right);
  }


  /**
   * Returns the sum of all nodes holding odd numbers.
   * 
   * If the node itself is null, return 0.
   * 
   * You can assume there are no null Integers held in the values.
   *
   * @param node the root node of the binary tree
   * @return the sum of all odd-valued nodes
   */
  public static int oddSum(TreeNode<Integer> node) {
    // if node is null, return 0;
    if (node == null) return 0;
    // variable to hold the current nodes values (0 if even)
    int current;
    // if node.value modulo 2 is not 0 (odd)
    if (node.value % 2 != 0) {
      // current equals node.value
      current = node.value;
    } else {
      // else current equals 0
      current = 0;
    }
    // traverse left subtree and save it
    int leftSum = oddSum(node.left);
    // traverse right subtree and save it
    int rightSum = oddSum(node.right);
    // return left sum + right sum + current 
    return leftSum + rightSum + current;
  }
}
