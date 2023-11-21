public class Main {

    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Ayi", 12, "Boz", 4);
        hayvan.bilgileriGoster();
        hayvan.canliBilgileri();
        hayvan.hayvanBilgileri();
        System.out.println("--------------------------");
        
        Araba araba = new Araba("Araba", 12, "Plastik", "Reno");
        araba.arabaBilgileri();
        araba.bilgileriGoster();
        araba.cansizBilgileri();

    }

}