package qa;

import java.util.Arrays;

public class SortEvenNumbers {

    public static void main(String[] args) {
        int[] arr = {5,45,54,24,7,67,29};
        int k = arr.length-1;
        int[] res = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(j<=k) {
                if (arr[i] % 2 == 0) {
                    res[j++] = arr[i];
                } else {
                    res[k--] = arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(res));

    }

}
