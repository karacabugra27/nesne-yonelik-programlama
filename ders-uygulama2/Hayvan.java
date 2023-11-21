public class Hayvan extends Canli {
    int bacakSayisi;

    public Hayvan(String ad, int yas, String cins, int bacakSayisi) {
        super(ad, yas, cins);
        this.bacakSayisi = bacakSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
    }

    @Override
    public void canliBilgileri() {
        // TODO Auto-generated method stub
        super.canliBilgileri();
    }

    public void hayvanBilgileri() {
        System.out.println("Hayvanin bacak sayisi : " + bacakSayisi);
    }

}
