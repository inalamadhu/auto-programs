package qa;

import java.util.Arrays;

public class DeletedNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,4,9};
        Arrays.sort(arr);

        int n = arr[arr.length-1];

        n = n * ((n+1)/2);
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }

        int d = n - sum;
        System.out.println(d);

    }
}
