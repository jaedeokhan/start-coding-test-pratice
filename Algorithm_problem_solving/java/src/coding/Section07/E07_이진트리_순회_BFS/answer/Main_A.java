package coding.Section07.E07_이진트리_순회_BFS.answer;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Main_A {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()){
            int length = queue.size();
            System.out.print(level + " : ");

            for (int i = 0; i < length; i++){
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Main_A tree = new Main_A();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.BFS(tree.root);
    }
}
