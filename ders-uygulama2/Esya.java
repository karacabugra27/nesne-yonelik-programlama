public class Esya extends Cansiz {
    String kullanimAlani;

    public Esya(String ad, int yas, String malzeme, String kullanimAlani) {
        super(ad, yas, malzeme);
        this.kullanimAlani = kullanimAlani;
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

    public void esyaBilgileri(){
        System.out.println("Esyanin kullanim alani : " + kullanimAlani);
    }
}
