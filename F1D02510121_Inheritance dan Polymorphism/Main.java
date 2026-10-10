public class Main {
    public static void main(String[] args) {
        System.out.println("=== Eksplorasi Inheritance dan Polymorphism ===");

        System.out.println("\n--Objek Bentuk--");
        Bentuk bentukUmum = new Bentuk("Hitam");
        bentukUmum.printInfo();
        
        System.out.println("\n--Objek BujurSangkar--");
        BujurSangkar kotak = new BujurSangkar(5.0, "Merah");
        kotak.printInfo(); 
        System.out.println("Sisi bujursangkar: " + kotak.getSisi());
        System.out.println("\n--Objek Lingkaran--");
        Lingkaran bulat = new Lingkaran(7.0, "Biru");
        bulat.printInfo(); 
        System.out.println("Radius lingkaran: " + bulat.getRadius());
        
        System.out.println("\n--Objek Silinder--");
        Silinder tabung = new Silinder(10.0, 7.0, "Kuning");
        tabung.printInfo(); 
        System.out.println("Jari-jari tabung: " + tabung.getRadius());
        System.out.println("Tinggi tabung: " + tabung.getTinggi());
        System.out.println("Volume tabung: " + tabung.hitungVolume());
        
        System.out.println("\n--Eksplorasi Setter Method--");
        tabung.setWarna("Hijau");
        tabung.setTinggi(15.0);
        System.out.println("Setelah diubah:");
        tabung.printInfo();
    }
}