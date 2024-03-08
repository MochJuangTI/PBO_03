public class PersegiPanjang extends BangunDatar {
    protected Double panjang;
    protected Double lebar;
    PersegiPanjang(Double panjang, Double lebar){
        super.setName("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungLuas() {
        super.luas  = this.panjang + this.lebar;
    }
    public void hitungKeliling() {
        super.keliling  = 2 * (this.panjang + this.lebar);
    }
}
