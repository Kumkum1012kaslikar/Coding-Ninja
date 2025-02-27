package Tree;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class TreeUse {
    // public static TreeNode<Integer> takeInput(Scanner sc) {
    public static TreeNode<Integer> takeInput() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter next node data");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter no. of Children for " + n);
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++) {
            // TreeNode<Integer> child = takeInput(sc);
            TreeNode<Integer> child = takeInput();
            root.children.add(child);

        }
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("enter no. of children of " + frontNode.data);
                int numChildren = s.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);

                }
            } catch (QueueEmptyException e) {
                // should not come
                return null;
            }
        }
        return root;
    }

    public static int numNodes(TreeNode<Integer> root) {

        System.out.println("No. of nodes : ");
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));

        }
        return count;
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largest(root.children.get(i));
            if (childLargest > ans) {
                ans = childLargest;
            }
        }
        return ans;
    }

    public static int height(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        int maxChildHeight = 0;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = height(child);
            if (childHeight > maxChildHeight) {
                maxChildHeight = childHeight;
            }
        }

        return 1 + maxChildHeight;
    }

    public static void printKth(TreeNode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printKth(root.children.get(i), k - 1);
        }
    }

    public static int leafNode(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        if (root.children.isEmpty()) {
            return 1;
        }
        int leafCount = 0;
        for (TreeNode<Integer> child : root.children) {
            leafCount += leafNode(child);
        }
        return leafCount;

    }

    public static void postOrder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        for (TreeNode<Integer> child : root.children) {
            postOrder(child);

        }
        System.out.println(root.data);
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TreeNode<Integer> root = takeInput();
        // TreeNode<Integer> root = takeInput(sc);
        TreeNode<Integer> root = takeInputLevelWise();
        // System.out.println(numNodes(root));
        // System.out.println(largest(root));
        // int treeHeight = height(root);
        // System.out.println("Height of the tree: " + treeHeight);
        // printKth(root,2);
        // int leafNodeCount = leafNode(root);
        // System.out.println("Number of leaf nodes: " + leafNodeCount);
        postOrder(root);

        // print(root);
        /*
         * TreeNode<Integer> root = new TreeNode<Integer>(4);
         * TreeNode<Integer> node1 = new TreeNode<Integer>(2);
         * TreeNode<Integer> node2 = new TreeNode<Integer>(3);
         * TreeNode<Integer> node3 = new TreeNode<Integer>(5);
         * TreeNode<Integer> node4 = new TreeNode<Integer>(6);
         * root.children.add(node1);
         * root.children.add(node2);
         * root.children.add(node3);
         * node2.children.add(node4);
         * System.out.println(root);
         */

    }
}
