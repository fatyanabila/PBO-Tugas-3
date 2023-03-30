import java.util.Scanner;

public class Penjualan{
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah)
    {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian()
    {
        float total = harga * jumlah;
        return total;
    }

    public String getBonus()
    {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 && jumlah > 5)
        {
            return "Setrika";
        }
        else if (totalPembelian >= 100000 && jumlah > 3)
        {
            return "Payung";
        }
        else if (totalPembelian >= 50000 || jumlah > 2)
        {
            return "Ballpoint";
        }
        else
        {
            return "Tidak Ada";
        }
    }

    public void cetkNota()
    {
        System.out.println("NOTA");
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+nama);
        System.out.println("Harga Barang : "+harga);
        System.out.println("Jumlah Barang : "+jumlah);
        System.out.println("Total Pembelian : "+getTotalPembelian());
        System.out.println("Bonus : "+getBonus());
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String ulang = "Y";

        while(ulang.equals("Y"))
        {
            Penjualan penjulan = new Penjualan();

            System.out.println();
            System.out.println("Masukkan Kode Barang : ");
            String kode = input.nextLine();

            System.out.println("Masukkan Nama Barang : ");
            String nama = input.nextLine();

            System.out.println("Masukkan Harga Barang : ");
            float harga = input.nextFloat();

            System.out.println("Masukkan Jumlah Barang : ");
            int jumlah = input.nextInt();

            input.nextLine();

            Penjualan.setData(String kode, String nama, float harga, int jumlah);
            Penjualan.cetakNota();

            System.out.print("Input data lagi [Y/T]? ");
            ulang = input.nextLine();
        }
        input.close();
    }
}