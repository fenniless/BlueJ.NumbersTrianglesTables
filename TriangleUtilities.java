 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars ; i++){
            sb.append("*");
        }
        
        return sb.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numberOfRows ; i++){
            for (int x = 0; x < i ; x++){
            sb.append("*");
        }
           sb.append("\n");
        }
        
        return sb.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4 ; i++){
            for (int x = 0; x < i ; x++){
            sb.append("*");
        }
           sb.append("\n");
        }
        
        return sb.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9 ; i++){
            for (int x = 0; x < i ; x++){
            sb.append("*");
        }
           sb.append("\n");
        }
        
        return sb.toString();
    }
}
