import java.util.Stack;
public class arrayToStack{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        System.out.println(stack);
    }
   
}