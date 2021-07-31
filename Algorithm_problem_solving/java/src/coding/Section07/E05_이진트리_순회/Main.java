package coding.Section07.E05_이진트리_순회;

class Node {
    int data;
    Node left, right;

    public Node(int value){
        data = value;
        left = right = null;
    }
}

public class Main {
    Node root;

    public void searchPrefix(Node root) {
        if (root == null) return; // 말단 노드
        else {
            System.out.print(root.data + " "); // prefix
            searchPrefix(root.left);
            searchPrefix(root.right);
        }
    }

    public void searchInfix(Node root) {
        if (root == null) return;
        else {
            searchInfix(root.left);
            System.out.print(root.data + " "); // infix
            searchInfix(root.right);
        }
    }

    public void searchPostfix(Node root) {
        if (root == null) return;
        else {
            searchPostfix(root.left);
            searchPostfix(root.right);
            System.out.print(root.data + " "); // postifx
        }
    }

    public static void main(String[] args) {

        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("전위 : ");
        tree.searchPrefix(tree.root);
        System.out.println();

        System.out.print("중위 : ");
        tree.searchInfix(tree.root);
        System.out.println();

        System.out.print("후위 : ");
        tree.searchPostfix(tree.root);
    }
}
