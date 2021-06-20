import java.util.ArrayList;

public class Cafe2 {

    String input_item;
    double harga;
    double diskon;
    double bayar;
    double pembayaran;
    double kembalian;
    int jumlah;
    String menu;
    double total;
    

    ArrayList<Cafe2> dt = new ArrayList<Cafe2>();
    

    public Cafe2(String input_item,double harga, double diskon, double bayar,double pembayaran,double kembalian,int jumlah,String menu,double total) {
        this.input_item = input_item;
        this.harga = harga;
        this.diskon = diskon;
        this.bayar = bayar;
        this.pembayaran= pembayaran;
        this.kembalian = kembalian;
        this.jumlah= jumlah;
        this.menu = menu;
        this.total = total;
    }
    public void setInput_item(String input_item) {
        this.input_item = input_item;}
    
    public void setHarga(double harga) {
        this.harga = harga;}
    
    public void setDiskon(double diskon) {
        this.diskon = diskon;}
    
    public void setBayar(double bayar) {
        this.bayar = bayar;}
    
    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;}
    
    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;}
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;}
    
    public void setMenu(String menu) {
        this.menu = menu;}
    
    public void setTotal(double total) {
        this.total = total;}
    
    public String getInput_item() {
        return input_item;}
    
    public double getHarga() {
        return harga;}
    
    public double getDiskon() {
        return diskon;}
    
    public double getBayar() {
        return bayar;}
    
    public double getPembayaran() {
        return pembayaran;}
    
    public double getKembalian() {
        return kembalian;}
    
     public int getJumlah() {
        return jumlah;}
     
    public String getMenu() {
        return menu;}
    
     public double getTotal() {
        return total;}
    }

			
