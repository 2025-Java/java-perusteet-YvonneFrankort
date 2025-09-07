package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        if (a > c) {
            a = a + c;
            c = a - c;
            a = a - c;
        }

        if (b > c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }

        return a + ","+ b + "," + c;
    }
}
