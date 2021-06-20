import java.util.ArrayList;

public class Cafe1 {

    String Nama;
    String Alamat;
    String NmrTlp;
    String JenisKelamin;
    String User;
    String Pass;
    String Email;
    String tgl;
   
    ArrayList<Cafe1> data = new ArrayList<Cafe1>();
    

    public Cafe1(String Nama,String JenisKelamin, String Alamat, String Email, String User, String Pass,String tgl) {
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.Email = Email;
        this.User = User;
        this.Pass = Pass;
        this.tgl = tgl;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;}
    
    public void setJK(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;}
    
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;}
    
    public void setEmail(String Email) {
        this.Email = Email;}
    
    public void setUser(String User) {
        this.User = User;}
    
    public void setPass(String Pass) {
        this.Pass = Pass;}
    
    public void setTgl(String tgl) {
        this.tgl = tgl;}
    
    
    public String getNama() {
        return Nama;}
    
    public String getJK() {
        return JenisKelamin;}
    
    public String getAlamat() {
        return Alamat;}
    
    public String getEmail() {
        return Email;}
    
    public String getUser() {
        return User;}
    
    public String getPass() {
        return Pass;}
    
    public String getTgl() {
        return tgl;}
    
    
    }

			
