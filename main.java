
import base.Produk;

public class main {
    public static void main(String[] args) {
        Produk P = new Produk("Indomie Goreng", 3500, 100, "Makanan");
    
        System.out.println(P.stok);
        // System.out.println(P.harga);
        // System.out.println(P.Kategori);
        // System.out.println(P.nama);

        P.tampilkanInfo();
    }
}