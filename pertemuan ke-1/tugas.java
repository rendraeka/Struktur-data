import java.util.Scanner;

public class tugas
{
    public static void main(String[] args)
    {
    int row,kolom;
    int tambah;
    String[][] data = new String[4][4];
    Scanner input = new Scanner(System.in);
    System.out.println("\nMasukan data");

    for (row = 0; row < 4; row++){
		System.out.println("\nTambah data 1 :");
		System.out.println("\nPrint  data 2 :");


    try {
    	tambah = input.nextInt();
    	}
    	catch (Exception e){
    		System.out.println("Ketik angka 1 atau 2 :");
    		break;
    		}

    	if (tambah  == 1){
    		System.out.println("\nMasukan  data tanpa Spasi");

    			System.out.print("Masukan NIM :");
    			data[row][0] = input.next();
    			System.out.print("Masukan NAMA:");
    			data[row][1] = input.next();
    			System.out.print("Masukan KMK :");
    			data[row][2] = input.next();
    			System.out.print("Masukan NILAI :");
    			data[row][3] = input.next();
    		}
    		else{
    			if (tambah == 2){
    				System.out.println("\nNim : NAMA : KMK : NILAI");
    				for (row = 0; row < 2; row++){
    				for(kolom = 0;kolom < 4; kolom++){
    					System.out.print(data [row][kolom]+" : ");
    					}
    					System.out.println(" ");
    					}
    						break;
    					}
    					else
    						break;
    					}
    				}
    			}
    		}

