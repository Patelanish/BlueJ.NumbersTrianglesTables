public class NumberUtilities {

    public static String getRange(int stop) 
    { 
        StringBuilder outcome = new StringBuilder();
        for (int i=0; i < stop; i++) {
            outcome.append(i);
        }
        return outcome.toString();
    }


    public static String getRange(int start, int stop) 
    { 
        StringBuilder outcome = new StringBuilder();
        for (int i=start; i < stop; i++) {
            outcome.append(i);
        }
        return outcome.toString();
    }


    public static String getRange(int start, int stop, int step) 
    {
        StringBuilder outcome = new StringBuilder();
        for (int i= start; i < stop;i = i + step) {
            outcome.append(i);
        }
        return outcome.toString();  
    }
    
    
    public static String getEvenNumbers(int start, int stop) 
    {
        StringBuilder outcome = new StringBuilder();
        for (int i = start; i < stop; i ++) {
            if (i % 2 == 0) { 
            outcome.append(i);
        }
        
    }   return outcome.toString();
}

    public static String getExponentiations(int start, int stop, int exponent)
    {
        StringBuilder outcome = new StringBuilder();
        for (int i = start; i <= stop; i++) {
            outcome.append((int)Math.pow(i, exponent));
        }
       return outcome.toString();
    }

}

