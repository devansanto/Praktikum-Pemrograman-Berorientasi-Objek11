/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author asus1
 */
public class PraktikumPBO_11tugas {

    static class Pengarang {
        private final String namaPengarang;

        public Pengarang(String namaPengarang) {
            this.namaPengarang = namaPengarang;
        }

        public String getNamaPengarang() {
            return namaPengarang;
        }

        public void infoPengarang() {
            System.out.println("Nama Pengarang: " + namaPengarang);
        }
    }

    static class Buku {
        private final String judul;
        private final Pengarang pengarang;  

        public Buku(String judul, Pengarang pengarang) {
            this.judul = judul;
            this.pengarang = pengarang;
        }

        public String getJudul() {
            return judul;
        }

        public Pengarang getPengarang() {
            return pengarang;
        }

        public void infoBuku() {
            System.out.println("Judul Buku: " + judul);
            pengarang.infoPengarang();  
        }
    }

    static class Perpustakaan {
        private final Buku[] daftarBuku;
        private int jumlahBuku;

        public Perpustakaan(int kapasitas) {
            daftarBuku = new Buku[kapasitas];
            jumlahBuku = 0;
        }

        public void tambahBuku(Buku buku) {
            if (jumlahBuku < daftarBuku.length) {
                daftarBuku[jumlahBuku++] = buku;
            } else {
                System.out.println("Perpustakaan sudah penuh!");
            }
        }

        public void infoPerpustakaan() {
            System.out.println("Informasi Buku di Perpustakaan:");
            for (int i = 0; i < jumlahBuku; i++) {
                daftarBuku[i].infoBuku();
                System.out.println("----------");
            }
        }
    }

    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Rahasia");
        Pengarang pengarang2 = new Pengarang("Secret");

        Buku buku1 = new Buku("PBO", pengarang1);
        Buku buku2 = new Buku("OOP", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}