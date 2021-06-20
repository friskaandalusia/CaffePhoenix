
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TubesALP {

    private String Nama;
    private String Alamat;
    private String NmrTlp;
    private String JenisKelamin;
    private String User;
    private String Pass;
    private String Email;
    private String tgl;

    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    
    ArrayList<TubesALP> fr = new ArrayList<>();
    ArrayList<Cafe1> data = new ArrayList<Cafe1>();
    ArrayList<Cafe2> dt = new ArrayList<Cafe2>();
    
    Scanner input = new Scanner(System.in);
    
    private String input_item;
    private double harga;
    private double diskon;
    private double bayar;
    private double pembayaran;
    private double kembalian;
    private int jumlah;
    private String menu;
    private double total;
    
    public void Register() {
        System.out.println("-------------------------------------- ");
        System.out.println(">>>  Silahkan Isi Data Diri Anda   <<<");
        System.out.println("-------------------------------------- ");
        try {
            
            System.out.print("Nama  Pelanggan :");
            this.Nama = inp.readLine();
            System.out.print("Tgl Pemesanan (Tgl/Bulan/Tahun):");
            this.tgl = inp.readLine();
            System.out.print("Alamat Pelanggan :");
            this.Alamat = inp.readLine();
            do{
                
            System.out.print("Nomor Telepon :");
            this.NmrTlp = inp.readLine();
            if (!NmrTlp.matches ("[0-9]+")){
                System.out.println("");
                System.out.println("============================================");
                System.out.println("     Data Harus Diisi Menggunakan Nomor!");
                System.out.println("============================================");
                System.out.println("");
            }
        }while (!NmrTlp.matches ("[0-9]+"));
            do{
            System.out.print("Jenis Kelamin : ");
            this.JenisKelamin = inp.readLine();
            if (!JenisKelamin.matches ("[a-zA-Z]+")){
                System.out.println("");
                System.out.println("============================================");
                System.out.println("     Penulisan harus menggunakan Huruf!");
                System.out.println("============================================");
                System.out.println("");
            }
        }while (!JenisKelamin.matches ("[a-zA-Z]+"));
            
            System.out.print("Username :");
            this.User = inp.readLine();
            System.out.print("Password :");
            this.Pass = inp.readLine();
            System.out.print("Email : ");
            this.Email = inp.readLine();
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("|             Akun Anda Sudah Tersimpan        |");
            System.out.println("|         Silahkan tekan Enter untuk Login     |");
            System.out.println("------------------------------------------------");
            
        } catch (IOException e) {
            System.out.println(" Error " + e);
        }data.add(new Cafe1(Nama,JenisKelamin,Alamat, Email, User, Pass,tgl));
        System.out.println("");
        System.out.println("Terimakasih Sudah Mengisi data diri");
        System.out.println("Selanjutnya permintaan Anda akan diproses");
        MenuUtama();
        DataPlngn(this.Nama, this.Alamat, this.NmrTlp, this.JenisKelamin, this.User, this.Pass, this.Email,this.tgl);
    }

    public void DataPlngn(String Nama, String Alamat, String NmrTlp, String JenisKelamin, String User, String Pass, String Email,String tgl) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NmrTlp = NmrTlp;
        this.JenisKelamin = JenisKelamin;
        this.User = User;
        this.Pass = Pass;
        this.Email = Email;
        this.tgl = tgl;
    }

    public void TampilanDataDiri() {
        System.out.println("---------------------------------------------");
        System.out.println("        Berikut Rekapan Data Pembeli         ");
        System.out.println("---------------------------------------------");
        System.out.println("        Nama          :" + this.Nama);
        System.out.println("        Tgl Pemesanan :" + this.tgl);
        System.out.println("        Alamat        :" + this.Alamat);
        System.out.println("        Nomor Telepon :" + this.NmrTlp);
        System.out.println("        Jenis Kelamin :" + this.JenisKelamin);
        System.out.println("        Ussername     :" + this.User);
        System.out.println("        Password      :" + this.Pass);
        System.out.println("        Email         :" + this.Email);
        System.out.println("---------------------------------------------");
        System.out.println("     Data Anda Sudah Terdaftar Oleh Admin    ");
        System.out.println("   Silahkan ke Menu Login untuk melanjutkan  ");
        System.out.println("---------------------------------------------");
        Login();
    }

    public void MenuUtama() {
        System.out.println("|--------------------------------------|");
        System.out.println("|><><><><><><>Caffe Phoenix><><><><><><|");
        System.out.println("|--------------------------------------|");
        System.out.println("| 1. Register                          |");
        System.out.println("| 2. Tampilan Data Diri                |");
        System.out.println("| 3. Login                             |");
        System.out.println("| 4. Log Out                           |");
        System.out.println("|--------------------------------------|");
        System.out.println("");
        System.out.print("Masukan Menu yang diinginkan : ");
        String pilihan = input.next();

        switch (pilihan) {

            case "1":
                Register();
                DaftarMenu();
                break;
                
            case "2":
                TampilanDataDiri();
                DaftarMenu();
                break;
                
            case "3":
                Login();
                break;

            case "4":
                System.out.println("--------------------------------------------------------------------- ");
                System.out.println("                ^^^Account Anda sudah ter-Log Out^^^        	  ");
                System.out.println("             Terimakasih sudah memesan di CAFFE PHOENIX               ");
                System.out.println("--------------------------------------------------------------------- ");
                System.out.println("\nNama Kelompok 6 : ");
                System.out.println("                1. Friska Andalusia        : 6701183048               ");
                System.out.println("                2. Gandi Setyo Raharjo     : 6701180094               ");
                System.out.println("                3. Alfiya Zain Putri       : 6701183089               ");
        
                MenuUtama();
            default:
                System.out.println("__________________________________________________________");
                System.out.println("Maaf, kode yang anda masukkan salah. Silahkan coba Kembali");
                System.out.println("__________________________________________________________");
        }       MenuUtama();
    }

    public void Login(){
        try{
        System.out.println("_______________________________________");
        System.out.println("       Login Akun ke Cafe Phoenix      ");
        System.out.println("_______________________________________");
        
            System.out.print("1. Username :");
            this.User = inp.readLine();
            System.out.print("2. Password :");
            this.Pass = inp.readLine();
            System.out.println("--------------------------------------");
            System.out.println("             Login Berhasil ^-^       ");
            System.out.println("   Ingat Username dan password Anda ");
            System.out.println("=Agar Tidak Salah saat Login kembali=");
            System.out.println("--------------------------------------");
            
            for (int i = 0; i < data.size(); i++) {
                if (User.equalsIgnoreCase(data.get(i).getUser()) && Pass.equals(data.get(i).getPass())) {
                    DaftarMenu();
                } else {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Maaf username and password tidak cocok \nSilahkan ulangi Kembali");
                    System.out.println("----------------------------------------------------------------");
                }   Login();                 
            }
        }catch (IOException e) {
            System.out.println(" Error " + e);
        }DaftarMenu();
    }
    
    public void Menu() {
        System.out.println(" ____________________________________________ ");
        System.out.println("|_-_-_-_-_-_-_-_- Caffe Phoenix _-_-_-_-_-_-_|");
        System.out.println("|____________________________________________|");
        System.out.println("|                    Daftar Menu             |");
        System.out.println("|      Makanan & Minuman       |     Harga   |");
        System.out.println("| 1. Makaroni Scothel          | Rp. 45.000  |");
        System.out.println("| 2. Steak Tenderloin          | Rp. 52.000  |");
        System.out.println("| 3. Nasi Bakar India          | Rp. 68.000  |");
        System.out.println("| 4. Javabica                  | Rp. 58.000  |");
        System.out.println("| 5. Expresso                  | Rp. 52.000  |");
        System.out.println("| 6. Mocha Praline cream       | Rp. 54.000  |");
        System.out.println("|____________________________________________|");

    }

    public void DaftarMenu() {
        System.out.println("------------------------------------");
        System.out.println(">>>>         Caffe Phoenix      <<<<");
        System.out.println("------------------------------------");
        System.out.println("== 1. Daftar Menu              | P |");
        System.out.println("== 2. Daftar Pesanan           | H |");
        System.out.println("== 3. Batalkan Pesanan         | O |");
        System.out.println("== 4. Struk Pembelian          | E |");
        System.out.println("== 5. Daftar Diskon            | N |");
        System.out.println("== 6. Exit                     | I |");
        System.out.println("-------------------------------| X |");
        System.out.println("====================================");
        System.out.println("Pilih Menu ? (1/2/3/4)");
        String menu = input.next();
        switch (menu) {

            case "1":
                Menu();
                DaftarMenu();
                break;

            case "2":
                Hitung();
                DaftarMenu();
                break;

            case "3":
                Konfirmasi();
                MenuUtama();
                break;

            case "4":
                Lihat();
                lanjut();
                break;

            case "5":
                diskon();
                DaftarMenu();
                break;
                
            case "6":
                Exit();
                MenuUtama();
                break;
                
            default:
                System.out.println(" Nomor yang  Anda Masukkan Salah ");
                System.out.println(" Silahkan tekan Enter untuk ke menu Utama:");
                DaftarMenu();

        }
    }
    public void diskon(){
        System.out.println("========================Diskon Up to 50%============================");
        System.out.println("Pembelian item > Rp.50.000,- mendapatkan potongan harga sebesar 10% ");
        System.out.println("Pembelian item > Rp.200.000,- mendapatkan potongan harga sebesar 30% ");
        System.out.println("Pembelian item > Rp.500.000,- mendapatkan potongan harga sebesar 50% ");
        System.out.println("================Ayo tunggu apa lagi, Let's try it !=================");
        
}
    public void TampilanDataPesanan() {
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("    Berikut Daftar Pesanan yang Anda Beli    ");
        System.out.println("=============================================");
        System.out.println("        Nama          :" + this.Nama);
        System.out.println("---------------------------------------------");
        System.out.println("        Menu          :" + this.menu);
        System.out.println("---------------------------------------------");
        System.out.println("       Banyak Pesanan :" + this.jumlah        );
        System.out.println("---------------------------------------------");
        System.out.println("       Total           :" + this.total        );
        System.out.println("=============================================");
        lanjut();
        
    }

    public void Hitung() {
        
        for (String a = "Y"; a.equals("Y") || a.equals("y");) {
            int harga=0;
            int harga_item[] = {45000, 52000, 68000, 58000, 52000, 54000};
            String menu;
            double diskon;
            double bayar;
            int pembayaran;
            int total = 0;
            
            Menu();
  
            System.out.print("Masukkan Banyak Pesanan : ");
            this.jumlah = input.nextInt();
        
            System.out.println("_________________________________________________");
            System.out.print("Masukkan Nomor Pesanan : ");
            input_item = input.next();
                switch (input_item){
                    
                    case "1":
                            this.menu = " Makaroni Scothel ";
                            this.harga = harga + harga_item[0] * this.jumlah;
                            this.total = harga_item[0] * this.jumlah;
                            System.out.println("================================================================================");
                            System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + " |  Rp. " + this.total);
                            System.out.println("================================================================================");
                            break;
                    case "2":
                        this.menu = "Steak Tenderloin ";
                        this.harga = harga + harga_item[1] * this.jumlah;
                        this.total = harga_item[1] * this.jumlah;
                        System.out.println("===================================================================================");
                        System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + "    |  Rp. " + this.total);
                        System.out.println("===================================================================================");
                        break;
                    case "3" :
                        this.menu = " Nasi Bakar India ";
                        this.harga = harga + harga_item[2] * this.jumlah;
                        this.total = harga_item[2] * this.jumlah;
                        System.out.println("==================================================================================");
                        System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + "   |  Rp. " + this.total);
                        System.out.println("==================================================================================");
                        break;
                    case "4":
                        this.menu = " Javabica ";
                        this.harga = harga + harga_item[3] * this.jumlah;
                        this.total = harga_item[3] * this.jumlah;
                        System.out.println("==================================================================================");
                        System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + "   |  Rp. " + this.total);
                        System.out.println("==================================================================================");
                        break;
                    case "5":
                        this.menu = " Expresso";
                        this.harga = harga + harga_item[4] * this.jumlah;
                        this.total = harga_item[4] * this.jumlah;
                        System.out.println("==================================================================================");
                        System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + "   |  Rp. " + this.total);
                        System.out.println("==================================================================================");
                        break;
                    case "6":
                        this.menu = " Mocha Praline Cream";
                        this.harga = harga + harga_item[5] * this.jumlah;
                        this.total = harga_item[5] * this.jumlah;
                        System.out.println("==================================================================================");
                        System.out.println("Menu Pesanan Anda : " + this.menu + "  x" + this.jumlah + "   |  Rp. " + this.total);
                        System.out.println("==================================================================================");
                        break;
                    default:
                        System.out.println("=========================================");
                        System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
                        System.out.println("=========================================");
                }
        
            if (this.harga >= 500000) {
                this.diskon = this.harga * 0.5;
            } else if (this.harga >= 200000) {
                this.diskon = this.harga * 0.3;
            } else if (this.harga >= 50000) {
                this.diskon = this.harga * 0.1;
            } else {
                this.diskon = 0;
            }

            this.bayar = this.harga - this.diskon;
            System.out.println("");
            System.out.println("________________________________________________");
            System.out.println("Daftar Pesanan Anda adalah   :" +  this.menu );
            System.out.println("Pembayaran sebesar           :  Rp." + this.harga);
            System.out.println("Anda mendapat diskon sebesar :  Rp." + this.diskon);
            System.out.println("Total yang harus anda bayar  :  Rp." + this.bayar);
            System.out.println("________________________________________________");
            System.out.print  ("Jumlah uang yang diberikan   :  RP.");
            this.pembayaran = input.nextInt();
            this.kembalian = this.pembayaran - this.bayar;

            System.out.println("Kembalian Anda Sebesar       :  Rp." + this.kembalian);
           
            System.out.println("Apakah anda mau memesan lagi? Y/T");
            String yatidak = input.next();
            switch (yatidak) {
                case "Y":
                case "y":
                case "Ya":
                case "ya":
                case "YA":
                    Hitung();
                    break;
                case "T":
                case "t":
                case "Tidak":
                case "tidak":
                case "TIDAK":
                    Konfirmasi();
                    Lihat();
                    Exit();
                    DaftarMenu();
                    break;

            default:
                System.out.println("Pilihan yang Anda masukkan salah, silahkan coba lagi");
            }
        }
    }
    public void Lihat(){
            System.out.println("------------------------------------------------");
            System.out.println("            ^^ Struk Pesanan Anda^^             ");
            System.out.println("          Welcome to Caffe Phoenix ^_^          ");
            System.out.println("  jl.Sukapura No.128,@TelkomUniversity, Bandung ");
            System.out.println("              No.Tlp : 08217546516              ");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("Nama              :" + this.Nama);
            System.out.println("Tanggal Pemesanan :" + this.tgl);
            System.out.println("________________________________________________");
            System.out.println("");
            System.out.println("Total Pesanan Anda adalah    :"  + this.jumlah);
            System.out.println("Menu Pesanan Anda adalah     : " + this.menu + "x" + this.jumlah + "|  Rp. " + this.total);
            System.out.println("Pembayaran sebesar           :  Rp." + this.harga);
            System.out.println("Anda mendapat diskon sebesar :  Rp." + this.diskon);
            System.out.println("Total yang harus anda bayar  :  Rp." + this.bayar);
            System.out.println("________________________________________________");
            System.out.println("Kembalian Anda Sebesar       :  Rp." + this.kembalian);
          
    }
    public void lanjut() {
        System.out.print("Apakah Anda Ingin Melanjutkan? (Y/T)");
        String lanjut = input.next();
        switch (lanjut) {
            case "Y":
            case "y":
            case "Ya":
            case "ya":
                TampilanDataPesanan();
                Konfirmasi();
                break;

            case "T":
            case "Tidak":
            case "t":
            case "tidak":
                System.out.println("^-^Terimakasih sudah Mengunjungi Caffe Phoenix^-^");
                System.out.println("_________________________________________________");
                break;
            default:
                System.out.println("__________________________________________________________");
                System.out.println("Maaf, kode yang anda masukkan salah. Silahkan coba Kembali");
                System.out.println("__________________________________________________________");

        }
    }
    public void Konfirmasi(){
       
        System.out.println("Apakah Anda yakin dengan pesanan Anda? (Y/T)");
        String yakin = input.next();
        
            switch (yakin){
                case"y":
                case "Y":
                case "ya":
                case "YA":
                case "yoi":
                case "Yes":
                case "YES":
                    TampilanDataPesanan();
                    Lihat();
                    lanjut();
                    break;
                case "t":
                case "T":
                case "Tidak":
                case "TIDAK":
                case "NO":
                case "No":
                    System.out.println("Menu yang Anda Pesan Sudah dibatalkan");
                    break;
                default :
                    System.out.println("Inputan yang Anda masukkan tidak valid");
                    System.out.println("        Silahkan coba kembali          ");
                    Konfirmasi();
                    break;
            }
        Exit();
    }
    
    public void Exit() {
        System.out.println("");
        System.out.println("Terimakasih Sudah Memesan di Caffe Kami :)");
        System.out.println("=========================================");
        System.out.println(">>>>       Have A Nice Day           <<<<");
        System.out.println("=========================================");
                        
    }
    public static void main(String[] args) {
        TubesALP ta = new TubesALP();
        ta.MenuUtama();
    }
}
