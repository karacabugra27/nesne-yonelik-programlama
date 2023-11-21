public class Main {

    public static void main(String[] args) {
        
        Muzisyen muzisyen = new Muzisyen("Bugra", 22, "Yazilim", "Elektrogitar");
        muzisyen.bilgileriGoster();
        muzisyen.calisiyorMu();
        muzisyen.calis();

        System.out.println("-----------------------------------------------------");
        Muhendis muhendis = new Muhendis("Ahmet", 24, "Bilgisayar", "Java");
        muhendis.bilgileriGoster();
        muhendis.calis();
        muhendis.problemCoz();

    }
}