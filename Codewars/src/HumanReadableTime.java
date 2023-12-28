public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String finalHours = seconds/3600 < 10 ? "0"+seconds/3600: ""+seconds/3600;
        String finalMinutes = (seconds/60)%60 < 10 ? "0"+(seconds/60)%60: ""+(seconds/60)%60;
        String finalSeconds= seconds%60 < 10 ? "0"+seconds%60:""+seconds%60;


        return String.valueOf(finalHours+":"+finalMinutes+":"+finalSeconds);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(40));
    }
}
