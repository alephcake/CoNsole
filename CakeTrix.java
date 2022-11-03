import java.util.*;
public class CakeTrix {
    public void caketrix_main(){
        String[] matrix_build = {"1", "0"};
        java.util.Random random = new java.util.Random();
        System.out.print("\u001B[32m");
        for (int matrixNumbers = 10; matrixNumbers > 0; matrixNumbers++) {
            int random_matrix = random.nextInt(matrix_build.length);
            System.out.print(matrix_build[random_matrix]);
        }
    }
}
