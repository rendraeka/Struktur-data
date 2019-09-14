import java.util.Scanner;

public class BubbleSort{

public void bubbleSort(char larik2[])
{
     for (int i=0;i<larik2.length;i++)
     {
          for (int elemen=0;elemen<larik2.length-1;elemen++)
          {
               if (larik2[elemen]>larik2[elemen+1])
               tukar(larik2, elemen,elemen+1);
          }
     }
}

public void tukar(char larik3[], int satu, int dua)
{

     char temp;
     temp = larik3[satu];
     larik3[satu] = larik3[dua];
     larik3[dua] = temp;
}

public static void main(String args[]) {
     Scanner  masuk = new Scanner(System.in);
     BubbleSort lrk = new BubbleSort();
     char nilai[]= new char[5];
     System.out.println("Masukkan 5 buat data nilai");
     for (int i = 0; i < 5; i++)
     {
          System.out.print( (i + 1)+" : ");
          nilai[i]=masuk.next().charAt(0);
     }
     System.out.println("Data nilai yang dimasukkan");
     for (int i = 0; i < 5; i++)
          System.out.println(nilai[i]);
     System.out.println("Data hasil pengurutan    ");
     lrk.bubbleSort(nilai);
     for (int i = 0; i < 5; i++)
          System.out.println(nilai[i]);
}
}