package Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Mihnea on 15.10.2017.
 */
public class Lab2_Exercitiul3ALternative {

    static void outputMatrix(int[][] matrix){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mihnea\\Desktop\\matrix.txt"));
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(j == matrix[i].length-1){
                        bw.write(matrix[i][j]);
                    } else {
                        bw.write(matrix[i][j] + ", ");
                    }
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        outputMatrix(
                new int[][]{{3,7,11,1,9},{6,4,12,4,17},{40,3,12,18,2},
                        {5,6,2,21,11},{9,21,3,4,1,}});

    }
}
