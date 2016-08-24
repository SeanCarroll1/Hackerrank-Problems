import java.util.*;
public class Quicksort1Partition {

    static void partition(int[] ar) {
        int p = ar[0];
        List <Integer> smaller = new ArrayList();
        List <Integer> bigger = new ArrayList();

        for(int j = 1; j<ar.length;j++){
            if(ar[j] <= p){
                smaller.add(ar[j]);
            }else{
                bigger.add(ar[j]);
            }
        }
        for(int j = 0; j< smaller.size();j++){
            ar[j] = (Integer)smaller.toArray()[j];
        }
        ar[smaller.size()] = p;
        for(int j = 0; j < bigger.size();j++){
            ar[smaller.size()+j+1] = (Integer)bigger.toArray()[j];
        }
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

     
       
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}