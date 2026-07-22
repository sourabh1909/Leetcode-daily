
import java.util.Stack;

public class DailyTemp {

    public static int[] temp(int a[]){
        int n = a.length;
        Stack<Integer> s = new Stack<>();

        int ans[] = new int[n];

        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()] <= a[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = s.peek() - i;
            }

            s.push(i);
        }

        return ans;        
    }
    public static void main(String[] args) {
        int a[] = {73,74,75,71,69,72,76,73};

        temp(a);
    }
}
