public class Persegi extends BangunDatar {
    protected Double sisi;
    Persegi(Double sisi){
        super.setName("Persegi");
        this.sisi = sisi;
        this.hitungLuas();
        this.hitungKeliling();
    }
    public void hitungLuas() {
        super.luas  = this.sisi * this.sisi;
    }
    public void hitungKeliling() {
        super.keliling  = 4 * this.sisi;
    }

}
