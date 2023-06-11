package qa;

import java.util.Arrays;

public class MoveZeorToLast {

    public static void main(String[] args) {
        int[] arr = {9,5,1,41,1,6,8,1,47,1,1,1,41,54};
        int[] res = new int[arr.length];
        int c=arr.length-1;
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(k<=c) {
                if (arr[i] == 1) {
                    res[c--] = arr[i];
                }else{
                    res[k++] = arr[i];

                }
            }
        }
        System.out.println(Arrays.toString(res));
    }

}
