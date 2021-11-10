import java.util.Scanner;
class Node{
    int data;
    Node right;
    Node left;
}
public class TreeDfs{
    static Node insertion(){
        Node newNode = new Node(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int userInput = sc.nextInt();
        if(userInput==-1){
            return null;
        }
        newNode.data = userInput;
        System.out.println("Enter Left of "+newNode.data);
        newNode.left=insertion();
        System.out.println("Enter Right of "+newNode.data);
        newNode.right=insertion();
        return newNode;
    }

    static void preOrder(Node root){
        System.out.print(root.data);
        if(root.left==null || root.right==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root.left==null || root.right==null){
            System.out.print(root.data);
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root.left==null || root.right==null){
            System.out.print(root.data);
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    public static void main(String[] args) {
        Node root=insertion();
        System.out.println();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}