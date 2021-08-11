package coding.Section07.E09_Tree_말단_노드까지의_가장_짧은_경로.answer_dfs;

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
    public int DFS(int level, Node root){

        // 말단 노드이면
        if (root.left == null && root.right == null) return level;

        // 말단 노드가 아닌 경우
        return Math.min(DFS(level + 1, root.left), DFS(level + 1, root.right));
    }


    public static void main(String[] args){

        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
    }

}
