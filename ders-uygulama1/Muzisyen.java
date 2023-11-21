public class Muzisyen extends Calisan {
    String enstruman;

    public Muzisyen(String ad, int yas, String departman, String enstruman) {
        super(ad, yas, departman);
        this.enstruman = enstruman;
    }

    @Override
    public void calis() {
        super.calis();
    }

    @Override
    public void bilgileriGoster() {
        // TODO Auto-generated method stub
        super.bilgileriGoster();
    }

    public void calisiyorMu(){
        System.out.println("Aktif calisiyor");
    }
}
