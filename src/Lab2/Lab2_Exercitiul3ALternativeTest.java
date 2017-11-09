package Lab2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihnea on 15.10.2017.
 */
class Lab2_Exercitiul3ALternativeTest {
    @org.junit.jupiter.api.Test
    void outputMatrix() throws IOException {
        String fileName = "C:\\Users\\Mihnea\\Desktop\\matrix.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        try{
            String line;
            while((line = br.readLine()) != null){
//                assert
            }
        }finally {
            br.close();
        }
    }

}