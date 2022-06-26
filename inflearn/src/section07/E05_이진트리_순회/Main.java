package section07.E05_이진트리_순회;

import java.io.*;

class Node{
    Node leftNode, rightNode;
    int data;

    public Node(int value) {
        data = value;
        leftNode = rightNode = null;
    }
}

public class Main {
    public void prefixDfs(Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        prefixDfs(root.leftNode);
        prefixDfs(root.rightNode);
    }

    public void infixDfs(Node root) {
        if (root == null){
            return;
        }
        infixDfs(root.leftNode);
        System.out.print(root.data + " ");
        infixDfs(root.rightNode);
    }

    public void postfixDfs(Node root){
        if (root == null){
            return;
        }
        postfixDfs(root.leftNode);
        postfixDfs(root.rightNode);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();

        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);

        System.out.print("전위 : ");
        T.prefixDfs(root);

        System.out.print("\n중위 : " );
        T.infixDfs(root);

        System.out.print("\n후위 : ");
        T.postfixDfs(root);
    }
}
