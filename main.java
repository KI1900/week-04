
import tes.Produk;

public class main {
    public static void main(String[] args) {
        Produk P = new Produk("Indomie Goreng", 3500, 100);
    
        System.out.println("Tampilkan Harga: " + P.getHarga());
        System.out.println("Tampilkan Stok: " + P.getStok());
        System.out.println("Tampilkan Nama: " + P.getNama());
        P.setHarga(1000);
        P.setStok(150);
        System.out.println(P.getHarga());
        System.out.println(P.getStok());
        System.out.println(P.getNama());
    }
}