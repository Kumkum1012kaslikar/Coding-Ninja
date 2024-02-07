package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LL13 {
    private static final boolean Integer = false;

    public static Node<Integer> CreateLinkedList() {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);

        n1.next = (Node<java.lang.Integer>) n2;
        n2.next = n3;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;

    }

    public static Node<Integer> CreatedLinkedList() {
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(7);
        Node<Integer> n4 = new Node<>(9);
        Node<Integer> n5 = new Node<>(15);

        n1.next = (Node<java.lang.Integer>) n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;

    }

    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }

    }

    public static int length(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void PrintITNode(Node<Integer> head, int i) {
        int position = 0;
        Node<Integer> temp = head;
        while (temp != null && position < i) {
            temp = temp.next;
            position++;

        }
        if (temp != null) {
            System.out.println(temp.data);
        }

    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }

            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> nib = new Node<Integer>(elem);
        if (pos == 0) {

            nib.next = head;
            head = nib;
            return nib;
        } else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nib.next = prev.next;
                prev.next = nib;
            }
            return head;
        }

    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        int count = 0;
        Node<Integer> currhead = head;
        while (currhead != null && count < (pos - 1)) {
            currhead = currhead.next;
            count++;
        }
        if (currhead == null || currhead.next == null) {

            return head;
        }
        currhead.next = currhead.next.next;
        return head;

    }

    public static int findNode(Node<Integer> head, int elem) {

        if (head == null) {
            return -1;
        }

        int count = 0;
        while (head != null) {
            if (head.data.equals(elem)) {
                return count;
            }
            head = head.next;
            count++;
        }
        return -1;
    }

    public static Node<Integer> append(Node<Integer> header, int val) {
        if (header == null) {
            return header;
        }
        if (val == 0) {
            return header;
        }
        Node<Integer> fast = header;
        Node<Integer> slow = header;
        Node<Integer> initialized = header;
        for (int i = 0; i < val; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = initialized;
        header = temp;
        return header;
    }

    public static Node<Integer> duplicateDeleteNode(Node<Integer> head) {

        if (head == null) {
            return head;
        }

        Node<Integer> current = head;
        while (current.next != null) {
            if (current.data.equals(current.next.data)) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static Node<Integer> reverseNode(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallhead = reverseNode(head.next);
        Node<Integer> reverseTail = head.next;
        reverseTail.next = head;
        head.next = null;
        return smallhead;
    }

    public static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, elem, pos - 1);
            return head;

        }
    }

    public static Node<Integer> deleteR(Node<Integer> head, int pos) {
        if (pos == 0) {
            return head.next;
        } else {
            Node<Integer> smallhead = deleteR(head.next, pos - 1);
            head.next = smallhead;

        }
        return head;
    }

    public static void midPoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return;
        }
        Node<Integer> fast = head.next;
        Node<Integer> slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        System.out.println(slow.data);

    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;

            }
        }
        if (t1 != null) {
            tail.next = t1;

        } else {
            tail.next = t2;
        }
        return head;
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }
        if (evenHead != null) {
            evenTail.next = null;
        }
        return oddHead;
    }

    public static Node<Integer> deleteNthNodes(Node<Integer> head, int m, int n) {
        if (head == null || m == 0) {
            return null;
        }
        if (n == 0) {
            return head;
        }

        Node<Integer> nodeHead = head;
        Node<Integer> nodeTail = null;

        while (nodeHead != null) {
            int take = 0;
            int skip = 0;
            while (take < m && nodeHead != null) {
                if (nodeTail == null) {
                    nodeTail = nodeHead;
                } else {
                    nodeTail.next = nodeHead;
                    nodeTail = nodeHead;
                }
                nodeHead = nodeHead.next;
                take++;
            }
            while (skip < n && nodeHead != null) {
                nodeHead = nodeHead.next;
                skip++;
            }
        }

        if (nodeTail != null) {
            nodeTail.next = null;
        }
        return head;
    }

    public static Node<Integer> swap2Nodes(Node<Integer> head, int i, int j) {

        if (i == j) {
            return head;
        }
        Node<Integer> cn = head, prev = null;

        Node<Integer> fn = null, sn = null, fnp = null, snp = null;
        int pos = 0;
        while (cn != null) {
            if (pos == i) {
                fnp = prev;
                fn = cn;
            } else if (pos == j) {
                snp = prev;
                sn = cn;
            }
            prev = cn;
            cn = cn.next;
            pos += 1;

        }
        if (fnp != null) {
            fnp.next = sn;

        } else {
            head = sn;
        }
        if (snp != null) {
            snp.next = fn;
        } else {
            head = fn;
        }
        Node<Integer> cfn = sn.next;
        sn.next = fn.next;
        fn.next = cfn;
        return head;

    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (k == 0) {
            return head;
        }
        Node<Integer> h1 = null, t1 = null;
        Node<Integer> cn = head;
        int count = 0;
        while (cn != null && count < k) {
            t1 = cn.next;
            cn.next = h1;
            h1 = cn;
            cn = t1;
            count++;
        }
        if (t1 != null) {
            head.next = kReverse(t1, k);
        }
        return h1;
    }

    public static void print(Node<Integer> head) {
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
        // System.out.println(head.next.next.next.next.next.data);
        // System.out.println(head.next.next.next.next.next.next.data);
        // System.out.println(head.next.next.next.next.next.next.next.data);

    }

    public static void main(String[] args) {
        /*
         * Node<Integer> n1 = new Node<>(10);
         * System.out.println(n1);
         * System.out.println(n1.data);
         * System.out.println(n1.next);
         */
        Node<Integer> head = CreateLinkedList();
        Node<Integer> headed = CreatedLinkedList();
        /* FOR INCREMENT */
        // increment(head);

        /* FOR LENGTH */
        // System.out.println(length(head));

        /* FOR PrintITNode */
        // PrintITNode(head,3);

        /* FOR TAKE INPUT */
        // Node<Integer> hea = takeInput();

        /* FOR INSERT */
        // head = insert(head, 80, 0);

        /* FOR DELETE NODE */
        // Node<Integer> header = deleteNode(head, 3);
        // print(header);

        /* FOR FIND NODE */
        // findNode(head,30);
        // System.out.println(findNode(head,30));

        /* FOR APPEND */
        // Node<Integer> header = append(head,1);
        // print(header);

        /* FOR DUPLICATE DELETE */

        // Node<Integer> heads = duplicateDeleteNode(head);
        // print(heads);

        /* FOR REVERSE */
        // head = reverseNode(head);
        // print(head);

        /* FOR PALINDROME */
        // palindrome(head);

        /* For insert recursively */
        // head = deleteR(head, 4);
        // print(head);

        /* FOR MID POINT */
        // midPoint(head);

        /* FOR MERGE 2 SORTED LL */
        // head = merge(head, headed);
        // print(head);

        /* FOR EVEN AFTER ODD */
        // head = evenAfterOdd(head);
        // print(head);

        /* FOR M N DELETION */
        // head = deleteNthNodes(head, 2, 3);
        // print(head);

        /* FOR SWAPING 2 NODE */
        // head = swap2Nodes(head, 1, 3);
        // print(head);
        /* FOR K REVERSE */
        head = kReverse(head, 2);
        print(head);
    }
}
