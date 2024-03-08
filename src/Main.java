public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(10.0);
        persegi.getInfo();

        PersegiPanjang persegiPanjang = new PersegiPanjang(10.0, 17.0);
        persegiPanjang.getInfo();

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(17.0, 9.0);
        segitigaSamaKaki.getInfo();

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(16.0, 10.0);
        segitigaSamaSisi.getInfo();

        SegitigaSiku segitigaSiku = new SegitigaSiku(14.0, 11.0);
        segitigaSiku.getInfo();

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(19.0, 11.0);
        segitigaSembarang.getInfo();

    }
}