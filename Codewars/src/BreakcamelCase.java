public class BreakcamelCase {
    public static String camelCase(String input) {
        StringBuilder finalInput= new StringBuilder(input);
        int j=0;
        for(int i=0;i<input.length();i++){
            if(!((int) input.charAt(i) >= 97 && (int)input.charAt(i) <=122)){
                finalInput.insert(i+j," ");
                j++;
            }
        }
        return finalInput.toString();
    }
    public static String camelCase2(String input) {
        String output="";
        for(char c :input.toCharArray()){
            output = Character.isUpperCase(c) ? output + " " + c : output + c;
        }
        return output;
    }


    public static void main(String[] args) {
        System.out.println(camelCase2("camelCasing"));
    }
}
