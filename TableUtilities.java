 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 5 ; i++){
                    for (int x = 1; x <= 5 ; x++){
                        sb.append(String.format("%3d" , i * x));
                        sb.append(" |");
                    }
                    sb.append("\n");
                }

                return sb.toString();
            }

    public static String getLargeMultiplicationTable() {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 10 ; i++){
                    for (int x = 1; x <= 10 ; x++){
                        sb.append(String.format("%3d" , i * x));
                        sb.append(" |");
                    }
                    sb.append("\n");
                }

                return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= tableSize ; i++){
                    for (int x = 1; x <= tableSize ; x++){
                        sb.append(String.format("%3d" , i * x));
                        sb.append(" |");
                    }
                    sb.append("\n");
                }

                return sb.toString();
    }
}
