import java.util.Scanner;
public class QuickSort{
	public void quickSort(float A[], int L, int R){
		int i,j;
		float p;
		p=A[(L+R)/2];
		i=L;
		j=R;
		while(i<=j)
		{
			while(A[i]<p) i++;
			while(A[j]>p) j--;
			if (i<=j)
			{
				tukar(A,i,j);
				i++;
				j--;
			}
		}
		if (L<j) quickSort(A,L,j);
		if (i<R) quickSort(A,i,R);
	}

	public void tukar(float larik3[], int satu, int dua){
		float temp;
		temp=larik3[satu];
		larik3[satu]=larik3[dua];
		larik3[dua]=temp;
	}

	public static void main(String args[]){
		Scanner masuk = new Scanner(System.in);
		QuickSort lrk = new QuickSort();
		float nilai[] = new float[10];
		System.out.println("Masukan 10 buat data nilai");
		for(int i=0; i<10; i++)
		{
			System.out.print((i+1)+" : ");
			nilai[i]=masuk.nextFloat();
		}
		System.out.println("Data nilai yang dimasukan");
		for(int i=0; i<10; i++)
		System.out.println(nilai[i]);
		System.out.println("Data hasil pengurutan ");
		lrk.quickSort(nilai, 0, nilai.length-1);
		for(int i=0; i<10; i++)
		System.out.println(nilai[i]);
	}
}