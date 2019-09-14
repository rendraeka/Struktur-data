import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {
    public static void main(String[] args) {
        String str = "";
        ArrayList<String> senerai = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\n1. Tambah Data");
                System.out.println("2. Lihat Data");
                System.out.println("3. Delete Data");
                System.out.println("4. Exit");
                System.out.print("Masukan pilihan : ");
                int pilihan = scan.nextInt();

                switch (pilihan) {
                    case 1:
                        int jmlDt = 0;
                        System.out.print("Tambah data : ");
                        str = scan.next();
                        senerai.add(str);
                        jmlDt++;
                        break;
                    case 2:
                        System.out.println("\nIsi senerai sekarang : ");
                        System.out.println("Jumlah Element : " + senerai.size());
                        for (int i = 0; i < senerai.size(); i++) {
                            System.out.println("Index " + i + ". " + senerai.get(i));
                        }
                        System.out.println("");
                        break;
                    case 3:
                        int indeks;
                        try {
                        System.out.print("Masukan Index list yang akan di hapus: ");
                            indeks = scan.nextInt();
                            senerai.remove(indeks);
                            System.out.println(">remove data sukses<");
                        } catch (IndexOutOfBoundsException a) {
                            System.out.println("Indeks Array melebihi batas");
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih");
                        System.exit(0);

                    default:
                        System.out.println("Inputan Tidak tersedia \n");
                }} 
catch (Exception e) {
                System.err.println("Salah Input");
                System.exit(1);
            }   }   }}
