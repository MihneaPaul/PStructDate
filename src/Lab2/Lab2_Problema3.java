package Lab2;

import java.util.ArrayList;

/**
 * Created by Mihnea on 15.10.2017.
 */
public class Lab2_Problema3 {

    public static ArrayList<Integer> nbOfHoles (int rows, int columns){
        ArrayList<Integer> list = new ArrayList<>();
        int [][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = (int)(Math.random()*50);
                System.out.println(matrix[i][j]);
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i != 0 || i != matrix.length-1 && j!=0 || j != matrix[i].length-1){
                    if(matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i][j-1]
                        && matrix[i][j] > matrix[i+1][j] && matrix [i][j] > matrix[i][j+1])
                        list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        nbOfHoles(4,5);
    }
}
