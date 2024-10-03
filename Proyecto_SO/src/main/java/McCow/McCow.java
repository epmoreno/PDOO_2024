/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package McCow;

/**
 *
 * @author enrique
 */
public class McCow {
    public static void main(String[] args) {
        int n=0;
        int [][] m = new int [3][3];
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = n+1;
                n++;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
