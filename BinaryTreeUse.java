package Binary;

import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInputBetter(Boolean isRoot, int parentData, Boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " : ");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int ans = numNodes(root.left) + numNodes(root.right);

        return 1 + ans;

    }
    // *************//

    public static BinaryTreeNode<Integer> TakeInputFor3(Boolean isRoot, int parentData, Boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = TakeInputFor3(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = TakeInputFor3(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printPreOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    public static void printPostOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data);

    }

    public static void printInOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);

    }

    // *************//
    public static int Largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = Largest(root.left);
        int largestRight = Largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

     public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }

    

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

        root.left = rootLeft;
        root.right = rootRight;

        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);

        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

        rootLeft.right = twoRight;
        rootRight.left = threeLeft;

        // BinaryTreeNode<Integer> root = takeTreeInput();
        // printTreeDetailed(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // printTreeDetailed(root);

        // printTree(root);

        // printTreeDetailed(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // printTreeDetailed(root);
        // System.out.println(" Num of nodes are : "+numNodes(root));

        // BinaryTreeNode<Integer> root = TakeInputFor3(true, 0, true);
        // printPreOrder(root);
        // printPostOrder(root);
        // printInOrder(root);

        //BinaryTreeNode<Integer> roor = takeTreeInputBetter(true, 0, true);
        //printTreeDetailed(roor);
       // System.out.println("Largest : " + Largest(roor));

        // BinaryTreeNode<Integer> roor = takeTreeInputBetter(true, 0, true);
       // printTreeDetailed(roor);
        //System.out.println("Height : " + height(roor));

    }
}
