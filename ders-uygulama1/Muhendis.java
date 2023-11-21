public class Muhendis extends Calisan {
    String uzmanlikAlani;

    public Muhendis(String ad, int yas, String departman, String uzmanlikAlani) {
        super(ad, yas, departman);
        this.uzmanlikAlani = uzmanlikAlani;
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

    public void problemCoz(){
        System.out.println("Problem cozuldu.");
    }
}
