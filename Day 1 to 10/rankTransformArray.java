import java.util.Arrays;
import java.util.HashMap;

public class rankTransformArray{
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        if(n ==0){
            return arr;
        }

        int dup[] = arr.clone();
        int c[] = new int[n];

        Arrays.sort(dup);
        int count = 1;
        c[0] =1;
        for(int i = 1;i<n;i++){
            if(dup[i] != dup[i-1]){
                count++;
            }
            c[i] = count;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(dup[i],c[i]);
        }

        for(int i =0;i<n;i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
