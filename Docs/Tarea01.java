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
public class Tarea01 {
    public static void main (String args[]) {
        int array[][] = {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
        int arrayResultado[][] = new int[4][4];
        //int arrayOld[][] = {{-9,-9,-9,8,7,1},{0,-9,0,7,8,7},{-9,-9,-9,3,-3,1},{5,-3,0,2,0,-1},{6,8,2,1,-3,0},{7,3,-1,4,4,3}};

        int acumulador = 0;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                acumulador = 0;
                acumulador = array[y][x] + array[y][x+1] + array[y][x+2] + array[y+1][x+1] + array[y+2][x] + array[y+2][x+1] + array[y+2][x+2];
                arrayResultado[y][x] = acumulador;
                System.out.print(arrayResultado[y][x] + ", ");
            }
            System.out.println("");
        }
        
    }
}
