package coding.Section07.E09_Tree_말단_노드까지의_가장_짧은_경로.pratice_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class Main {
    Node root;
    public int solution(Node root){

        // DFS로 깊게 들어갈 필요가 없으니 BFS로 일단 해결해보자.
        // Queue<Node>를 LinkedList<>()로 set
        // 해당 Node에 left와 right가 null이면 level 출력
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()){
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++){
                Node currentNode = queue.poll();

                if (currentNode.left == null && currentNode.right == null) return level;
                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            level++;
        }

        return level;
    }

    public static void main(String[] args){

        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        System.out.println(tree.solution(tree.root));
    }
}
