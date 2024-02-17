public class OneAway {

    public static boolean oneAway(String s,String d){
        int counterDifferences=0;
        if(Math.abs(s.length()-d.length())==1){
            return true;
        }
        else if(s.length()==d.length()){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)!=d.charAt(i)){
                    counterDifferences++;
                }
            }
        }
    return counterDifferences <= 1;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("abcd","dcba"));
    }
}
