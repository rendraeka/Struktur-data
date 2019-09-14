class Simpul
{	public
int	data;
Simpul	kiri;
Simpul	kanan;
public
//-----------  konstruktor ----------
Simpul(int d)
{	data = d;
}
//-----------  fungsi untuk mencetak 'simpul' ------------
void cetakSimpul()
{	System.out.print(data);
}
}
class Pohon
{	public
Simpul akar;
public
//-----------  konstruktor -------------
Pohon()
{	akar  = null;
}
boolean isEmpty()
{
return akar == null;
}

//---------  fungsi untuk menambah isi pohon ---------
Simpul tambah(Simpul P, int dd)
{	if( P==null )				//jika pohon kosong
{	Simpul baru = new Simpul(dd);
baru.kiri = null;
baru.kanan = null;
P = baru;
return P;
}
else
{	if (dd < P.data)
{	P.kiri = tambah(P.kiri, dd);
return P;
}
else
{	P.kanan = tambah(P.kanan, dd);
return P;
}
}
}

void preOrder(Simpul P)
{	if(P != null)
{	System.out.print(P.data + "  ");
preOrder(P.kiri);
preOrder(P.kanan);
}
}

void inOrder(Simpul P)
{	if(P != null)
{	inOrder(P.kiri);
System.out.print(P.data + " _ ");
inOrder(P.kanan);
}
}

void postOrder(Simpul P)
{	if(P != null)
{	postOrder(P.kiri);
postOrder(P.kanan);
System.out.print(P.data + " _ ");
}
}
}

class ApliPohon
{
public static void main(String[] args)
{
Pohon P1 = new Pohon();

P1.akar = P1.tambah(P1.akar, 50);
P1.akar = P1.tambah(P1.akar, 60);
P1.akar = P1.tambah(P1.akar, 30);
P1.akar = P1.tambah(P1.akar, 40);
P1.akar = P1.tambah(P1.akar, 70);
P1.akar = P1.tambah(P1.akar, 55);
P1.akar = P1.tambah(P1.akar, 53);
P1.akar = P1.tambah(P1.akar, 57);
P1.akar = P1.tambah(P1.akar, 51);
P1.akar = P1.tambah(P1.akar, 54);
P1.akar = P1.tambah(P1.akar, 20);
P1.akar = P1.tambah(P1.akar, 10);
P1.akar = P1.tambah(P1.akar, 90);


System.out.print("Cetak pre order :");
P1.preOrder(P1.akar);
System.out.println("");

System.out.print("Cetak in order :");
P1.inOrder(P1.akar);
System.out.println("");

System.out.print("Cetak post order :");
P1.postOrder(P1.akar);
System.out.println("");
}
}
