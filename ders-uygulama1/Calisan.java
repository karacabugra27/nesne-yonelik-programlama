public class Calisan {
    String ad;
    int yas;
    String departman;

    public Calisan(String ad, int yas, String departman) {
        this.ad = ad;
        this.yas = yas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("Calistirma methodu cagirildi.");
    }

    public void bilgileriGoster(){
        System.out.println("Ad :" + ad );
        System.out.println("Yas :" + yas);
        System.out.println("Departman :" + departman);
    }
    
    
}
