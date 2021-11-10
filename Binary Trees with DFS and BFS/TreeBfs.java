import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class Node{
    int data;
    Node right;
    Node left;
}
public class TreeBfs{
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
    static void BfsTraverse(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            root=q.remove();
            System.out.print(root.data+" ");
            if(root.left!=null){
                q.add(root.left);
            }
            if(root.right!=null){
                q.add(root.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root=insertion();
        BfsTraverse(root);
    }
}
  
