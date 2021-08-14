package fun.coding.sliver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char data;
    Node left, right;
    public Node(char data){
        this.data = data;
    }
}

class Tree {
    Node root;

    public void createNode(char data, char leftData, char rightData){
        if (root == null) { // 아무것도 없는 초기 상태
            root = new Node(data);

            // 좌우 값이 있는 경우에는 노드 생성
            if (leftData != '.') root.left = new Node(leftData);
            if (rightData != '.') root.right = new Node(rightData);
        } else { // 초기상태가 아니고 어디 들어갈지 탐색
            searchNode(root, data, leftData, rightData);
        }
    }

    public void searchNode(Node root, char data, char leftData, char rightData){
        if (root == null) { // 도착한 노드가 null이면 재귀 종료 - 찾을(삽입할) 노드 X
            return;
        } else if (root.data == data) { // 들어갈 위치를 찾았다면
            if (leftData != '.') root.left = new Node(leftData);
            if (rightData != '.') root.right = new Node(rightData);
        } else { // 아직 찾지 못했고, 탐색할 노드가 남아 있다면
            searchNode(root.left, data, leftData, rightData);
            searchNode(root.right, data, leftData, rightData);
        }
    }

    // 전위순회 : 루트 -> 좌 -> 우
    public void preOrder(Node root){
        System.out.print(root.data); //먼저 가운데 출력
        if(root.left!=null) preOrder(root.left); //그 다음 왼쪽
        if(root.right!=null) preOrder(root.right); //마지막 오른쪽
    }

    // 중위순회 : 좌 -> 루트 -> 우
    public void inOrder(Node root){
        if(root.left!=null) inOrder(root.left); //왼쪽 먼저
        System.out.print(root.data); //그 다음 중앙 출력
        if(root.right!=null) inOrder(root.right); //마지막으로 오른쪽
    }

    // 후위순회 : 좌 -> 우 -> 루트
    public void postOrder(Node root){
        if(root.left!=null) postOrder(root.left); //왼쪽 먼저
        if(root.right!=null) postOrder(root.right); //그 다음 오른쪽
        System.out.print(root.data);
    }

}

public class Main {

    public static void main(String[] args) throws IOException {

        // 알파벳 -> 노드, . -> 빈 노드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeCount = Integer.parseInt(br.readLine());
        Tree tree = new Tree();

        for (int i = 0; i < nodeCount; i++){
            char[] data = br.readLine().replace(" ", "").toCharArray();
            tree.createNode(data[0], data[1], data[2]);
        }

        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);

        br.close();
    }
}
