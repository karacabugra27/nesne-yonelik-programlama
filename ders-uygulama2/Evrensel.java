public class Evrensel {
    String ad;
    int yas;

    public Evrensel(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public void bilgileriGoster() {
        System.out.println("Ad : " + ad);
        System.out.println("Yas : " + yas);

    }
}
