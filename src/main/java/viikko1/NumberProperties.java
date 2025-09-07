package viikko1;

public class NumberProperties {
    public static String describe(int n) {

        if (n == 0)
        {
            return "nolla";
        }
        
        if (n>0 && n%2 == 0)
        {
            return "positiivinen parillinen";
        }

        if (n >0 && n%2 != 0)
        {
            return "positiivinen pariton";
        }

        if (n<0 && n%2 == 0)
        {
            return "negatiivinen parillinen";
        }

        if (n<0 && n%2 != 0)
        {
            return "negatiivinen pariton";
        }
        return null;
    }
}
