package base;   
   
public class Produk {
        private String nama;
        String Kategori;
        protected double harga;
        public int stok;

        public Produk(String nama, String Kategori, double harga, int stok) {
            this.nama = nama;
            this.Kategori = Kategori;
            this.harga = harga;
            this.stok = stok;
        }


        public void tampilkanInfo() {
            System.out.println("Nama Produk: " + nama);
            System.out.println("Kategori: " + Kategori);
            System.out.println("Harga: " + harga);
            System.out.println("Stok: " + stok);
            System.out.println("-----------------------------");

        }
}
