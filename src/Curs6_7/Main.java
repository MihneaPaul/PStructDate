package Curs6_7;

/**
 * Created by Mihnea on 08.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        VectorDinamicSortat vds = new VectorDinamicSortat(2);
        vds.add(4);
        vds.add(7);
        vds.add(2);
        vds.add(8);
        System.out.println(vds);

        vds.delete(4);
        vds.delete(5);
    }
}
