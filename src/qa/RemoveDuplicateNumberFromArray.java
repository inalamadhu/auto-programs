package qa;

import java.util.Arrays;

public class RemoveDuplicateNumberFromArray {
    public static void main(String[] args) {
        int[] n = {45,22,54,45,84,5,23,64, 84};
        int[] r = new int[n.length];
        for(int i=0; i<n.length; i++){
            int c = 0;
            for(int j=0; j<n.length; j++){
                if(n[i] == n[j]){
                    ++c;
                }
            }
            if(c==1){
                r[i] = n[i];
            }
        }
        System.out.println(Arrays.toString(r));
    }

}
