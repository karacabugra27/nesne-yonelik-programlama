public class Araba extends Cansiz {
    String marka;

    public Araba(String ad, int yas, String malzeme, String marka) {
        super(ad, yas, malzeme);
        this.marka = marka;
    }

    @Override
    public void bilgileriGoster() {
        // TODO Auto-generated method stub
        super.bilgileriGoster();
    }

    @Override
    public void cansizBilgileri() {
        // TODO Auto-generated method stub
        super.cansizBilgileri();
    }

    public void arabaBilgileri(){
        System.out.println("Arabanin markasi : " + marka);
    }

    
}
