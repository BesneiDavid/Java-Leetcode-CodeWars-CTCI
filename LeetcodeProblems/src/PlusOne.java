public class PlusOne {
//    My first solution
//    Time complexity: O(n) we're traversing the whole digits array
//    Space complexity O(n+1) => O(n) we need an array of different length in the case of numbers like 99 for example.
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int plus=1;
        int[] newNumber = new int[n+1];

        for(int i=n-1;i>=0;i--){
            if(digits[i]==9 && plus==1 ){
                digits[i]=0;
                newNumber[i+1]=digits[i];
            }  else {
                digits[i]+=plus;
                newNumber[i+1]=digits[i];
                plus=0;
            }
        }

        if(plus==1){
            newNumber[0]=plus;
        }

        return newNumber[0] != 0 ? newNumber:digits;
    }

    public static void main(String[] args) {
        int[] arr={3,8,9};
         arr=plusOne(arr);

         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }

    }
}
