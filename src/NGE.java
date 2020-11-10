import java.util.ArrayList;
import java.util.Stack;
/*
In this, we find the nearest largest element to right and left. In nearest greater to right we traverse to the end of
the loop and check if their is largest element in the right or not if it is not present then we store -1 after "i" move
to the second last element and we push the last element in the stack if the a[i] if less than the present element in
the stack that is stack.peek()  then we store stack peek value in the output array and if the element at ith position
if greater than peek value in the stack then we pop till then we we get empty stack or peek value is greater than a[i]
then after we print the output array.
this algo takes O(n) time complexity.



 */

public class NGE {
    public static void Nearest(int[] arr ,int[] outputArray, int n) {
        int j = n-1;
        Stack<Integer> stack = new Stack<> ();
        for (int i = n-1; i >=0 ; i--) {
            if(stack.size () == 0){
                outputArray[j--] = -1;


            }
            else if(stack.size ()>0 && stack.peek () > arr[i]){
                outputArray[j--] = stack.peek ();
            }
            else if(stack.size () > 0 && stack.peek () < arr[i]){
                while (stack.size () > 0 && stack.peek () <= arr[i]){
                    stack.pop ();
                }
                if (stack.size () == 0)
                    outputArray[j--]  = -1;
                else
                    outputArray[j--] = stack.peek ();

            }
            stack.push ( arr[i] );

        }
    }
}
