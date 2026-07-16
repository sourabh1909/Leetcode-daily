public class secLargeInString {
    public int secondHighest(String s) {
        int n = s.length();
        int largest = -1;
        int secLar = -1;

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);

            // Character.isDigit(ch) is used to check the digit in string
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                
                if(largest < digit){
                    secLar = largest;
                    largest = digit;
                }
                else if(secLar < digit && digit < largest){
                    secLar = digit;
                }
            }
        }

        return secLar;
    }
}