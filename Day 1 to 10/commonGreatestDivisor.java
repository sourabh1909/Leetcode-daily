import java.util.*;

public class commonGreatestDivisor{
    public static int gcd(int a[]){
        int n = a.length;
        int ans = 0;

        Arrays.sort(a);
        int start = a[0];
        int end = a[n-1];

        for(int i = 1;i<=start;i++){
            if((start % i == 0)&& (end % i ==0)){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n[]= {2,5,4,8,9,10};

        int ans = gcd(n);
        System.out.println(ans);
    }
}