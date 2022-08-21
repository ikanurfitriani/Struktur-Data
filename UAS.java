import java.util.Scanner;
class formatBiodata {
	//bagian deklarasi struktur record ----------------------------------
	int kode;
	String barang;
}
class UAS {
	public static int N=0;
	public static int hitungNilaiHash(int nilaiAwal) {
		int hasil;
		hasil = nilaiAwal % 23;
		return (hasil);
	}

	public static void ngentriData(formatBiodata biodataMahasiswa[]) {
		N = 25;
		int NH;
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		//bagian menentukan banyaknya data yang akan dientri --------------
		System.out.print("Berapa data yang akan dientri ? : ");
		int banyakEntri = masukan.nextInt();
		//bagian entri data baru -----------------------------------------------
		formatBiodata biodataMahasiswaBaru;
		for (int i=0; i<=banyakEntri-1; i++) {
			//bagian entri data baru ke penyimpan sementara --------------------
			biodataMahasiswaBaru = new formatBiodata();
			System.out.print("Silakan masukkan kode : ");
			biodataMahasiswaBaru.kode = masukan.nextInt();
			System.out.print("Silakan masukkan barang : ");
			biodataMahasiswaBaru.barang = masukan.next();
			//bagian memindahkan data baru ke larik sesuai nilai Hashing -----
			NH = hitungNilaiHash(biodataMahasiswaBaru.kode);
			System.out.println ("Biodata " + biodataMahasiswaBaru.barang + " akan ditempatkan pada larik ke : " + NH);
			biodataMahasiswa[NH] = biodataMahasiswaBaru;
		}
	}

	public static void berhentiSebentar() {
		System.out.println ("");
		System.out.println ("Tekan tombol ENTER untuk melanjutkan...");
		Scanner masukan = new Scanner(System.in);
		int bacaTombol;
		do {
			bacaTombol=0;
			try {
				bacaTombol = System.in.read();
			} catch(java.io.IOException e) {
			}
		}
		while (bacaTombol != 13); //tombol 13 adalah tombol enter
	}
	public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
		//bagian menampilkan isi struktur Larik --------------------------
		System.out.println("-------------------------------------------------------");
		System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
		System.out.println("-------------------------------------------------------");
		for (int i=0; i<=N-1; i++) {
			System.out.print (i + " ");
			System.out.print (biodataMahasiswa[i].barang + "\t ");
			if (i % 100 == 0)
			berhentiSebentar();
		}
		System.out.println("-------------------------------------------------------");
	}
	public static void main(String[] args) {
		//bagian deklarasi record berbasis LARIK -----------------------
		formatBiodata biodataMahasiswa[] = new formatBiodata[25];
			for (int i=0; i<=24; i++)
		biodataMahasiswa[i] = new formatBiodata();
		//pemanggilan fungsi-fungsi---------------------------
		ngentriData(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	}
}