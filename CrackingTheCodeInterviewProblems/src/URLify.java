import java.sql.Time;

public class URLify {

public static String urlify(char[] str, int trueLength) {
    StringBuilder stringBuilder = new StringBuilder();

    int startIndex= 0;
    while(startIndex<trueLength && str[startIndex]==' '){
        startIndex++;
    }

    int endIndex = str.length-1;
    while (endIndex >=0 && str[endIndex]==' '){
        endIndex--;
    }

    for(int i = startIndex; i<=endIndex;i++){
        if(str[i] ==' '){
            stringBuilder.append("20%");
        } else {
            stringBuilder.append(str[i]);
        }
    }

    return stringBuilder.toString();
}


    public static void main(String[] args) {
        char[] str = "  Mr John Smith     ".toCharArray();
        int trueLength = 13;
        System.out.println(urlify(str,trueLength));
    }
}
