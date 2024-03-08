public class SegitigaSiku extends Segitiga {
    SegitigaSiku(Double alas, Double tinggi) {
        super.setName("Segitiga Siku Siku");
        this.sisi3 = this.getSisiMiring(alas, tinggi);
        super.setProperty(alas, tinggi, super.sisi3);
        super.hitungLuas();
        super.hitungKeliling();
    }

    double getSisiMiring(Double alas, Double tinggi) {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
}
