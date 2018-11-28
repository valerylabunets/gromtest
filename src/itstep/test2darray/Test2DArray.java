
package itstep.test2darray;

/**
 *
 * @author java
 */
public class Test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int n =3;
        final int m = 4;
        int[][] arr2D;
        arr2D = new int[n][m];
        //arr2D[2][3]=5;
        //Example of initilisation 2Darray
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2D[i][j]=(i+1)*(j+1);
                
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j =0;j<m;j++) {
                System.out.print(arr2D[i][j] + "\t ");
            }
            System.out.println();
        }
        
    }
    
}
