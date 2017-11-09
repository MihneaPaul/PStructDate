package Curs6_7;

import java.util.Arrays;

/**
 * Created by Mihnea on 08.11.2017.
 */
public class VectorDinamicSortat {
    private int[] elemente;
    private int cap;
    private int len;

    public VectorDinamicSortat(int capacitate) {
        this.cap = capacitate;
        this.len = 0;
        this.elemente = new int[capacitate];
    }

    public int getLungime(){
        return this.len;
    }

    public int getElemente(int i){
        if(i >= 0 && i < this.len){
            return this.elemente[i];
        }
        else return -1;
    }

    public void add(int element){
        // marim tabloul daca trebuie
        if(this.len == this.cap){
            this.cap *= 2;
            int[] tablouNou = new int[this.cap];
            for(int i=0; i< this.len;i++){
                tablouNou[i] = this.elemente[i];
            }
            this.elemente = tablouNou;
        }
        // add element
        int i = this.len;
        while (i > 0 && this.elemente[i-1] > element){
            this.elemente[i] = this.elemente[i-1];
            i--;
        }
        this.elemente[i] = element;
        this.len++;
    }

    public void delete(int element){
        int i = 0;
        while(i<this.len && this.elemente[i] < element){
            i++;
        }
        if(i<this.len && this.elemente[i] == element){
            for(int k=0;k<this.len;k++){
                this.elemente[k] = this.elemente[k+1];
            }
        }
        this.len --;
    }

    @Override
    public String toString() {
        return "VectorDinamicSortat{" +
                "elemente=" + Arrays.toString(elemente) +
                '}';
    }
}
