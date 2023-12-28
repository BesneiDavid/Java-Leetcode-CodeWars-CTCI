import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum =0;
        int prevValue =0;

        for(char c: s.toCharArray()){
            int currentValue = map.get(c);

            if(prevValue < currentValue){
                sum += currentValue - 2 * prevValue;
            } else {
                sum+=currentValue;
            }
            prevValue = currentValue;
        }

        return sum;
    }


    public static int romanToInt2(String s){
        int ans=0;int num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch (s.charAt(i)){
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'C': num=100; break;
                case 'D': num=500; break;
                case 'M': num=1000; break;
            }
            if(4*num < ans) ans -=num;
            else
                ans+=num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result = romanToInt2("MCMXCIV");
        System.out.println(result);
    }
}
