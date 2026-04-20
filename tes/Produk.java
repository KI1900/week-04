package tes;   
   
public class Produk {
        private String nama;
        protected double harga;
        public int stok;

        public Produk(String nama, double harga, int stok) {
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }

        public double getHarga() {
            return harga;
        }
        public int getStok() {
            return stok;
        }
        public String getNama() {
            return nama;
        }
        public void setStok(int stok) {
            this.stok = stok;
        }
        public void setHarga(double harga) {
            this.harga = harga;
        }


        public void tampilkanInfo() {
            System.out.println("Nama Produk: " + nama);
            System.out.println("Harga: " + harga);
            System.out.println("Stok: " + stok);
            System.out.println("-----------------------------");

        }
}
