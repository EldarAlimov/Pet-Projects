import java.util.ArrayList;

public class ArrayListInt {
    private int[] A;

    private void setA(int[] input){this.A = input;}
    public ArrayListInt(){
        this.A = new int[0];
    }
    int size(){
        int s = this.A.length;
        return s;
    }
    int get(int index){
        int v = this.A[index];
        return v;
    }
    void set(int index, int value){
        this.A[index] = value;
    }
    void add(int value){
        int s = this.A.length;
        int[] A2 = new int[s+1];
        for (int i = 0; i < s; i++) {
            A2[i] = this.A[i];
        }
        A2[s] = value;
        setA(A2);
    }
    void add(int index, int value){
        int s = this.A.length;
        int[] A2 = new int[s+1];
        for (int i = 0; i < index; i++) {
            A2[i] = this.A[i];
        }
        A2[index] = value;
        for (int i = index+1; i < s+1; i++) {
            A2[i] = this.A[i-1];
        }
        setA(A2);
    }
    void remove(int index){
        int s = this.A.length;
        int[] A2 = new int[s-1];
        for (int i = 0; i < index; i++) {
            A2[i] = this.A[i];
        }
        for (int i = index; i < s-1; i++) {
            A2[i] = this.A[i+1];
        }
        setA(A2);
    }
    void printArray(){
        System.out.print("[");
        for (int i = 0; i < this.A.length-1; i++) {
            System.out.print(this.A[i]+", ");
        }
        System.out.println(this.A[this.A.length-1] + "]");
    }
}
