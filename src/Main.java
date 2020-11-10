import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Enter");
        Scanner sc = new Scanner ( System.in );
        int size  = sc.nextInt ();
        int[] arr  = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt ();
        }
        int n = arr.length;
        int[] outputArray = new int[size];
        NGE.Nearest ( arr,outputArray,n );
        Collections.reverse ( List.of ( outputArray ) );
        System.out.println (Arrays.toString (outputArray));
    }
}
