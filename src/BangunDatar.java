public class BangunDatar {
    protected double luas, keliling;
    protected String nama;
    public void setName(String nama) {
        this.nama = nama;
    }
    public void getInfo () {
        System.out.println("================================================= " + this.nama + " =================================================" );
        System.out.println("Nama bangun datar: "+ nama);
        System.out.println("Luas: "+ luas);
        System.out.println("Keliling: "+ keliling);
        System.out.println();
    }
}