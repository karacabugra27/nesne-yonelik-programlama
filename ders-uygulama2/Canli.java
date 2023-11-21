public class Canli extends Evrensel {
    String cins;

    public Canli(String ad, int yas, String cins) {
        super(ad, yas);
        this.cins = cins;
    }

    public void canliBilgileri(){
        System.out.println("Canlinin cinsi :" + cins);
    }

}
