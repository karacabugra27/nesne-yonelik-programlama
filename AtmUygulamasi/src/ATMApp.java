import java.util.Scanner;

public class ATMApp implements IAtmService {

	Scanner scanner = new Scanner(System.in);

	@Override
	public void musteri(Musteri musteri) {
		System.out.println("Musterinin ismi :" + musteri.isim);
		System.out.println("Musterinin soyismi : " + musteri.soyisim);
		System.out.println("Musterinin bakiyesi : " + musteri.getBakiye());
		System.out.println("Musterinin tc : " + musteri.getTc());
		System.out.println("Musterinin adresi : " + musteri.getAdres());
	}

	@Override
	public void bakiyeSorgula(Musteri musteri) {
		System.out.println("Bakiyeniz : " + musteri.getBakiye());
	}

	@Override
	public void paraTransfer(Musteri gonderen, Musteri alan) {
		
		System.out.println("Gonderilecek tutari giriniz");
		int tutar = scanner.nextInt();
		scanner.nextLine();
		if (gonderen.getBakiye() < tutar) {
			System.out.println("YETERSİZ BAKİYE");
		} else {
			gonderen.setBakiye(gonderen.getBakiye() - tutar);
			alan.setBakiye(alan.getBakiye() + tutar);
			System.out.println("Para transfer edildi...");
		}
	}

	@Override
	public void paraEkle(Musteri musteri) {
		System.out.println("Eklenecek tutari giriniz :");
		int tutar = scanner.nextInt();
		scanner.nextLine();
		musteri.setBakiye(musteri.getBakiye() - tutar);

	}

	@Override
	public void paraCek(Musteri musteri) {
		System.out.println("Cekilecek tutarı giriniz : ");
		int tutar = scanner.nextInt();
		scanner.nextLine();
		musteri.setBakiye(musteri.getBakiye() - tutar);
	}

}
