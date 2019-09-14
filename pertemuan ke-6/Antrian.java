class Antrian
{
	private int ukuran;
	private long[] antrian;
	private int depan;
	private int belakang;
	private int jumItem;

	public Antrian(int s)
	{
		ukuran = s;
		antrian = new long[ukuran];
		depan = 0;
		belakang = -1;
		jumItem = 0;
	}

	public void masuk(long j)
	{
		if(!isFull())
		{
			antrian[++belakang] = j;
			jumItem++;
		}
	}

	public long keluar()
	{
		long temp = antrian[0];
		for (int i=0;i<jumItem;i++)
			antrian[i]=antrian[i+1];
		jumItem--;
		belakang--;

		return temp;
		}

	public long peekDepan()
	{
		return antrian[depan];
		}

	public boolean isEmpty()
	{
		return (jumItem==0);
	}

	public boolean isFull()
	{
		return (belakang==ukuran-1);
	}

	public int ukuran()
	{
		return jumItem;
	}
	public void lihat()
	{
		for (int i=0; i<jumItem;i++)
			System.out.print(antrian[i]+" ");
		System.out.println(" ");
		}
	}

class ApliAntrian
{
	public static void main(String[] args)

	{
		Antrian antrian = new Antrian(10);
		antrian.masuk(13);
		antrian.lihat();
		antrian.masuk(32);
		antrian.lihat();
		antrian.masuk(45);
		antrian.lihat();
		antrian.masuk(67);
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.masuk(43);
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.masuk(56);
		antrian.lihat();
		antrian.masuk(76);
		antrian.lihat();
		antrian.masuk(85);
		antrian.lihat();
		antrian.masuk(92);
		antrian.lihat();
		while( !antrian.isEmpty() )
		{
			long n = antrian.keluar();
			System.out.print(n);
			System.out.print(" ");
			}
		System.out.println(" ");
	}
}