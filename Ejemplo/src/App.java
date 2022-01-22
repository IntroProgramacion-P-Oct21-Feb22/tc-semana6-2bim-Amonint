import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.math.NumberUtils;
public class App{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int a = 100;
        int b = 110;
        obtenerInt(a, b);
    }
    
    public static void obtenerInt(int a, int b){
        int[] c = new int [10];
        for (int i = 0; i< c.length; i++){
            c[i] = RandomUtils.nextInt(a , b);
        }
       for (int i = 0; i< c.length; i++){
           System.out.printf("%d ", c[i]);
       }
    }
    
}
