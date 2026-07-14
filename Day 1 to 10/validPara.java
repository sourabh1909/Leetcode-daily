import java.util.Stack;

public class validPara {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        int n = s.length();

        if(n == 1){
            return false;
        }

        for(int i = 0;i<n;i++){
            if((s.charAt(i) == '{') || 
                (s.charAt(i) == '(') ||
                (s.charAt(i) == '[')){
                    ss.push(s.charAt(i));
            }
            else{
                if(ss.isEmpty()){
                    return false;
                }
                if((ss.peek() == '{' && s.charAt(i) == '}') ||
                    (ss.peek() == '[' && s.charAt(i) == ']')||
                    (ss.peek() == '(' && s.charAt(i) == ')')){
                        ss.pop();
                }
                else{
                    return false;
                }
            }
        } 

        if(!ss.isEmpty()){
            return false;
        }

        return true;
    }
}