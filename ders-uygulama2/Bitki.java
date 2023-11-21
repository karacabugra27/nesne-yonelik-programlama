public class Bitki extends Canli {
    
    String yetistigiYer;

    public Bitki(String ad, int yas, String cins, String yetistigiYer) {
        super(ad, yas, cins);
        this.yetistigiYer = yetistigiYer;
    }

    @Override
    public void bilgileriGoster() {
        // TODO Auto-generated method stub
        super.bilgileriGoster();
    }

    @Override
    public void canliBilgileri() {
        // TODO Auto-generated method stub
        super.canliBilgileri();
    }

    public void bitkiBilgileri(){
        System.out.println("Bitkinin yetistigi yer : " + yetistigiYer);
    }
}
