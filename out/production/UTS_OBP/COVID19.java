import java.util.Scanner;

public class COVID19

{

    public static void main(String[] args)

    {

        Scanner in = new Scanner(System.in);

        System.out.println("================================================================================");
        System.out.println("LAPORAN KASUS MINGGUAN COVID-19 DI INDONESIA");
        System.out.println("================================================================================");

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-1   : ");
        int pos1 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-2   : ");
        int pos2 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-3   : ");
        int pos3 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-4   : ");
        int pos4 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-5   : ");
        int pos5 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-6   : ");
        int pos6 = in.nextInt();

        System.out.print("Masukkan Penambahan Kasus Positif Hari Ke-7   : ");
        int pos7 = in.nextInt();

        Positif pos = new Positif(pos1, pos2, pos3, pos4, pos5, pos6, pos7);

        System.out.println("================================================================================");
        System.out.println("Jumlah Penambahan Kasus Positif per 7 Hari    : " + pos.jumlahPositif());
        System.out.println("Rata2 Penambahan Kasus Positif per 7 Hari     : " + pos.rata2Positif());
        System.out.println("================================================================================");

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-1   : ");
        int men1 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-2   : ");
        int men2 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-3   : ");
        int men3 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-4   : ");
        int men4 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-5   : ");
        int men5 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-6   : ");
        int men6 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Meninggal Dunia Hari Ke-7   : ");
        int men7 = in.nextInt();

        Meninggal men = new Meninggal(men1, men2, men3, men4, men5, men6, men7);

        System.out.println("================================================================================");
        System.out.println("Jumlah Penambahan Orang Meninggal Dunia per 7 Hari    : " + men.jumlahMeninggal());
        System.out.println("Rata2 Penambahan Orang Meninggal Dunia per 7 Hari     : " + men.rata2Meninggal());
        System.out.println("================================================================================");

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-1   : ");
        int sem1 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-2   : ");
        int sem2 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-3   : ");
        int sem3 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-4   : ");
        int sem4 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-5   : ");
        int sem5 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-6   : ");
        int sem6 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Sembuh Hari Ke-7   : ");
        int sem7 = in.nextInt();

        Sembuh sem = new Sembuh(sem1, sem2, sem3, sem4, sem5, sem6, sem7);

        System.out.println("================================================================================");
        System.out.println("Jumlah Penambahan Orang Sembuh per 7 Hari    : " + sem.jumlahSembuh());
        System.out.println("Rata2 Penambahan Orang Sembuh per 7 Hari     : " + sem.rata2Sembuh());
        System.out.println("================================================================================");

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-1   : ");
        int tes1 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-2   : ");
        int tes2 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-3   : ");
        int tes3 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-4   : ");
        int tes4 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-5   : ");
        int tes5 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-6   : ");
        int tes6 = in.nextInt();

        System.out.print("Masukkan Penambahan Orang Dites Hari Ke-7   : ");
        int tes7 = in.nextInt();

        Tes tes = new Tes(tes1, tes2, tes3, tes4, tes5, tes6, tes7);

        System.out.println("================================================================================");
        System.out.println("Jumlah Penambahan Orang Dites per 7 Hari    : " + tes.jumlahTes());
        System.out.println("Rata2 Penambahan Orang Dites per 7 Hari     : " + tes.rata2Tes());
        System.out.println("================================================================================");

    }

}