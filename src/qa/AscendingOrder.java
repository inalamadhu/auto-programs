package qa;

import java.util.Arrays;

public class AscendingOrder {

    public static void main(String[] args) {
        int[] n = {43,423,84,62,41,95,2,22};
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(n));
    }

}
