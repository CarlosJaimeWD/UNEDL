/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author charl
 */
public class examenDiagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{1,3,5,7},{4,7,9,7},{2,6,8,0},{2,4,5,2}};
        int cont = 0;
        int v = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int c = 0; c < matriz.length; c++) {
                
                
                System.out.println(matriz[cont][i]);
                //System.out.println(i + ", " + cont);
                if (v == 0) {
                    cont ++;
                    if (cont > 3) {
                        v = 1;
                        cont = 3;
                    }
                } else if (v == 1) {
                    cont --;
                    if (cont < 0) {
                        v = 0;
                        cont = 0;
                    }
                }
            }
        }
    }
    
    
    
}
