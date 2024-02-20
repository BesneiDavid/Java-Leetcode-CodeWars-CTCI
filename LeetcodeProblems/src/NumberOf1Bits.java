public class NumberOf1Bits {
//    My solution adapted with chat gpt
//    O(32) time complexity 32 is the maximum nr o bits.
//    Space complexity O(1) we don't use extra memory
    public static int hammingWeight(int n) {
        int counter = 0;
        int isSet;
        while (n != 0) {
            isSet = n & 1;
            if (isSet == 1) {
                counter++;
            }
            n = n >>> 1; //we use this so the sign bit is not taking into consideration and moved to the right
//            otherwise if we use >> the signed bit will not be moved causing infinite cycle
        }
        return counter;
    }

//    Optimal solution
//    Time complexity Constant O(1)
//    Space complexity: O(1)
    public static int hammingWeight2(int n) {
        int counter = 0;
        while (n != 0) {
            n = n & (n-1);
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(7));
    }
}
