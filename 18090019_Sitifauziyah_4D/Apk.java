import java.util.*;

public class Apk {

    public static void main(String args[]) {
        Apk app = new Apk();
        Scanner sc = new Scanner(System.in);
        while (true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
            case 1:
                System.out.println("Formulir Tambah Data");
                app.addData();
                break;
            case 2:
                System.out.println("Formulir Ubah Data");
                app.ubahData();
                break;
            case 3:
                System.out.println("Formulir Hapus Data");
                app.hapusData();
                break;
            case 4:
                System.out.println("Tampilkan Sekuruh Data");
                app.listData();
                break;
            case 5:
                return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data ke-");
        int idx = sc.nextInt();
        // hapus data
        Proses.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ubah data ke-");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");
        System.out.print("NIM: ");
        String NIM = sc.nextLine();
        System.out.print("Nama: ");
        String Nama = sc.nextLine();
        System.out.print("Alamat: ");
        String Alamat = sc.nextLine();
        System.out.print("Agama: ");
        String Agama = sc.nextLine();
        // simpan perubahan
        Proses.editData(new Mhs(NIM, Nama, Alamat, Agama), idx - 1);
    }

    public void listData() {
        // tampilkan daftar data
        List<Mhs> result = Proses.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("data ke-" + (i + 1));
            System.out.println("  NIM : " + result.get(i).getNIM());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
            System.out.println("  Agama : " + result.get(i).getAgama());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM: ");
        String NIM = sc.nextLine();
        System.out.print("Nama: ");
        String Nama = sc.nextLine();
        System.out.print("Alamat: ");
        String Alamat = sc.nextLine();
        System.out.print("Agama: ");
        String Agama = sc.nextLine();
        // simpan data
        Proses.addData(new Mhs(NIM, Nama, Alamat, Agama));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("APLIKASI PEREKAMAN Mahasiswa");
        System.out.println("---------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}