package viikko1;

public class TimesTable {

    public static String table(int n) {
        String result= "";

        for (int i = 1; i <= 10; i ++){
            result+= n + " x " + i + " = " + (n*i) + "\n";
        }
        
        return result; 
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
