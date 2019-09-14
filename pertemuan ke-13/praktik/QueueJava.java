import java.io.*;
import java.util.*;
public class QueueJava{
    String str;
    int num;
    public static void main(String[] args){
            QueueJava q = new QueueJava();
    }

    public QueueJava(){
        try{
             LinkedList<Integer> list = new LinkedList<Integer>();
             BufferedReader bf = new BufferedReader(
                     new InputStreamReader(System.in));
             
             System.out.print("Banyak Data : ");
             str = bf.readLine();
             if((num = Integer.parseInt(str)) == 0){
                System.out.println("Anda menekan angka nol.");
                System.exit(0);
            }
            
            else{
            
            for(int i = 0; i < num; i++){
                System.out.print("Masukan Elemen "+i+" : ");
                str = bf.readLine();
                int n = Integer.parseInt(str);
                list.add(n);
            }
            }
            System.out.println("\nElement Pertama   : "
                    + list.removeFirst());
            System.out.println("Element Terakhir  : "
                    + list.removeLast());
            System.out.println("Element Tengah    : ");
              while(!list.isEmpty()){
                 System.out.print(list.remove() + " ");
              }
              System.out.println("");
            }
            catch(Exception e){
             System.out.println(e.getMessage()
                     + " adalah String.");
             System.exit(0);
            }
        }
}

