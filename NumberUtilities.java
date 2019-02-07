


public class NumberUtilities {

    public static String getRange(int stop) {
        
        String n = "";
        for(int i = 0; i < stop; i++){
            
            n += i; 
        }
        
        return n;
    }

    public static String getRange(int start, int stop) {
        
        String n = "";
        for(int i = start ; i < stop ; i++){
            
            n += i;
            
            
            
        }
        
        return n;
    }


    public static String getRange(int start, int stop, int step) {
        
        String n = "";
        for(int i = start ; i < stop ; i += step){
            
            n += i;
            
            
            
        }
        
        return n;
    }

    public static String getEvenNumbers(int start, int stop) {
        
        String n = "";
        for(int i = start ; i < stop ; i++){
            if(i % 2==0){
            n += i;}
        }
        
        return n;
    }


    public static String getOddNumbers(int start, int stop) {
        String n = "";
        for(int i = start; i < stop; i++){
            if(i%2 != 0){
            
            n+=i;}
        }
        return n;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        int x = 0;
        String n = "";
        for(int i = start ; i <= stop; i++){
            x = (int)Math.pow(i,exponent);
            n += x; 
            
            
            
        }
        
        return n;
    }
}
