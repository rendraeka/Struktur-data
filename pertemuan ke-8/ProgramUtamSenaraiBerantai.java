class Simpul {
  public
   String data;
   Simpul kanan;
  public
  //---------- konstruktor ---------
  Simpul (String d)
  {data = d;
  }

  //---------------- fungsi mencetak simpul --------------
  void cetakSimpul()
  { System.out.print(data);
  }
  }

  class Senarai
  { private
            Simpul awal;
            Simpul akhir;

    public
    //------------- konstruktor --------------
   Senarai()
   {   awal = null;
     akhir = null;
}
    //-------------- fungsi untuk menambah diawal senarai -------------
    void tambahAwal(String dd)
    {  System.out.println ("menambah depan "+ dd + " dilakukan ....");
       Simpul baru= new Simpul (dd);
       if(awal==null)
       akhir=baru;
       baru.kanan=awal;
       awal=baru;
       }

       //
       void tambahAkhir(String dd)
       {  System.out.println ("menambah belakang "+dd+" dilakukan ....");
              Simpul baru= new Simpul (dd);
              if(awal==null)
              akhir=baru;
              else
              akhir.kanan=baru;
              baru.kanan=null;
              akhir=baru;
              }

             //-------------- fungsi untuk menambah ditengah -------------
       Boolean tambahTengah(String kunci , String dd)
       {  System.out.println ("menambah tengah "+dd+" dilakukan ....");
       Simpul bantu=awal;
       while (bantu.data !=kunci)
       {      bantu = bantu.kanan;
             if (bantu==null)
             { System.out.println("---> Nambah "+dd+" Gagal,karena data " + kunci + " tidak ditemukan ");
                  return false ;
                  }
                  }
                  Simpul baru =new Simpul(dd);
                  if (bantu==akhir)
                  {  baru.kanan=null;
                  akhir.kanan=baru;
                  akhir=baru;
                  }
                  else
                  { baru.kanan=bantu.kanan;
                  bantu.kanan=baru;
                  }
                  return true;
                  }

                  //-------------- fungsi untuk menghapus sebuah simpul di awal senarai -------------
                  Simpul hapusAwal()
                  {  System.out.println ("menghapus di awal senarai dilakukan ....");
                  Simpul hapus = awal;
                  if (awal.kanan==null)
                      akhir=akhir.kanan;
                      awal=awal.kanan;
                      return hapus;
                      }

                  //-------------- fungsi untuk menghapus sebuah simpul di
                  Simpul hapusAkhir()
		                    {  System.out.println ("menghapus di akhir senarai dilakukan ....");
		                    Simpul bantu = awal;
		                    while (bantu.kanan !=akhir)
		                        bantu=bantu.kanan;
		                        Simpul hapus = akhir ;
		                        akhir=bantu;
		                        akhir.kanan=null;
		                        return hapus;
                      }

                  //-------------- fungsi untuk menghapus simpul berdasarkan kata kunci
                  Simpul hapusPilih(String kunci)
                  {  System.out.println ("menghapus simpul dangan kunci dilakukan ....");
                  Simpul bantu = awal;
                  if (bantu.data ==kunci)
                  { awal =awal.kanan;
                  return bantu;
                  }
                  else
                  { while (bantu.kanan.data==kunci)
                   { bantu= bantu.kanan;
                   if(bantu==null)
                   {return null;
                   }
                  }
                if (bantu.kanan==akhir)
                { Simpul hapus = akhir;
                 akhir = bantu;
                 akhir.kanan=null;
                 return hapus;
                 }
                 else
                 { Simpul hapus=bantu.kanan;
                 bantu.kanan=hapus.kanan;
                 return hapus;
                 }
                 }
                 }

                 //--------fungsi mencetak maju
                 void cetakMaju()
                 {System.out.print("Mencetak maju:");
                 Simpul bantu = awal;
                 while (bantu!=null)
                 {
                     bantu.cetakSimpul();
                     bantu=bantu.kanan;
                     System.out.print(",");
                     }
                     System.out.println("");
                     }
                     }

 class ProgramUtamSenaraiBerantai{
  public static void main(String args[]){
  Senarai mahasiswa=new Senarai();
  mahasiswa.tambahAwal("Agung");
  mahasiswa.tambahAwal("Beni");
  mahasiswa.tambahAwal("Cecep");

  mahasiswa.tambahAkhir("Eko");
  mahasiswa.tambahAkhir("Feri");
  mahasiswa.tambahAkhir("Gunawan");
  mahasiswa.tambahAkhir("Hasan");

  mahasiswa.tambahTengah("Cecep","Dedy");
  mahasiswa.tambahTengah("Parmin","Deni");
  System.out.println("");

  mahasiswa.cetakMaju();
  System.out.println("");

  mahasiswa.hapusAwal();
  mahasiswa.hapusAkhir();
  mahasiswa.cetakMaju();
  System.out.println("");

  mahasiswa.hapusPilih("Dedy");
  mahasiswa.cetakMaju();
  System.out.println("");
  }
 }