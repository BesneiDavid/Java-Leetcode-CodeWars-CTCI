import java.util.HashSet;

public class HappyNumber {
//    This is a dumb af solution im not even gonna bother
    public static boolean isHappy(int n) {
        while(true){
            n=sumOfSquares(n);
            if(n==145){
                return false;
            }

            if(n==1){
                return true;
            }
        }
    }

//    Real solution
//    Time complexity: O(n*c) n - number of digits in a number c - number of the contained numbers in the visit set
//    Space complexity O(c) c - number of elements in the visit set.
    public static boolean isHappy2(int n) {
        if(n==1 || n==-1){
            return true;
        }
        HashSet<Integer> visit = new HashSet<>();

        while(!visit.contains(n)){
            visit.add(n);

            n = sumOfSquares(n);

            if(n==1){
                return true;
            }
        }

        return false;
    }


    public static int sumOfSquares(int n){
        int sum=0;

        while(n >0){
            sum += Math.pow(n%10,2);
            n=n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy2(2));
    }
}
