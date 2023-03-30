import java.util.Scanner;

public class Waktu{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int hh, jj, mm, total;

        System.out.print("1 hari : ");
        hh = in.nextInt();

        System.out.print("1 jam : ");
        jj = in.nextInt();

        System.out.print("1 menit : ");
        mm = in.nextInt();

        total = hh*86400 + jj*3600 + mm*60;
        System.out.println("\n total detik = "+total);
    }
}