public class Cansiz extends Evrensel {
    String malzeme;

    public Cansiz(String ad, int yas, String malzeme) {
        super(ad, yas);
        this.malzeme = malzeme;
    }

    public void cansizBilgileri(){
        System.out.println("Malzeme türü : " + malzeme);
    }
}
