import java.util.Scanner;
public class QueueLinear{
int pointerIndeks=0;//untuk memberikan indeks pada array data
String data[];// digunakan untuk menampung data yg dimasukkan
static Scanner input=new Scanner(System.in);//static untuk metode inputan
public QueueLinear(int batas){//konstruktor dg parameter batas
data=new String[batas];//mengisi panjang slot array data
}
public void enqueue(){//digunakan untuk mengisi data
if(pointerIndeks<data.length){
System.out.print("Masukan Data Antrian : ");
           String antrian = input.next();
data[pointerIndeks]=antrian;//antrian disimpan di data di index velua pointer
pointerIndeks++;
}else{
System.out.println("Maaf Antrian Penuh");
}}
public String dequeue(){//untuk memanggil data keluar
String tmp=data[0];
for(int i=0;i<data.length-1;i++){
data[i]=data[i+1];//menggeser data ke kiri
}
pointerIndeks--;//mengurangi
       if(pointerIndeks>=0){
          data[pointerIndeks]=null;
          return "Pemanggilan Antrian "+tmp;
}else{
          return "Maaf data kosong";
       }
}
    public static void main(String[] args){
      System.out.print("Masukkan Batas Antrian : ");
      int batas = input.nextInt();
      QueueLinear li=new QueueLinear(batas);
      while(true){
       System.out.print("meenu :" + "\n1. EnQueue" + "\n2. Dequeue" + "\n3. exit" + "\npilih : ");
       int pilih=input.nextInt();
       if(pilih==1){
          li.enqueue();
       }else if(pilih==2){
          System.out.println(li.dequeue());
       }else{
          System.out.println("Exit........");
          System.exit(0);
       }      }   } }