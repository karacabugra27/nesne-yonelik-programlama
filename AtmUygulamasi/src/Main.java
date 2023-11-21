import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Musteri musteri1 = new Musteri();
		Musteri musteri2 = new Musteri();
		ATMApp atm = new ATMApp();

		System.out.println("İsminizi giriniz : ");
		String isim = scanner.nextLine();
		musteri1.setIsim(isim);

		System.out.println("Soyismini giriniz : ");
		String soyisim = scanner.nextLine();
		musteri1.setSoyisim(soyisim);

		System.out.println("Tcnizi giriniz : ");
		Long tc = scanner.nextLong();
		musteri1.setTc(tc);

		scanner.nextLine();
		System.out.println("Adresinizi giriniz : ");
		String adres = scanner.nextLine();
		musteri1.setAdres(adres);

		musteri1.setBakiye(10000);

		System.out.println("İsminizi giriniz : ");
		String isim2 = scanner.nextLine();
		musteri2.setIsim(isim2);

		System.out.println("Soyismini giriniz : ");
		String soyisim2 = scanner.nextLine();
		musteri2.setSoyisim(soyisim2);

		System.out.println("Tcnizi giriniz : ");
		Long tc2 = scanner.nextLong();
		musteri2.setTc(tc2);

		scanner.nextLine();
		System.out.println("Adresinizi giriniz : ");
		String adres2 = scanner.nextLine();
		musteri2.setAdres(adres2);

		musteri2.setBakiye(5000);

		int kontrol = 1;
		while (kontrol == 1) {
			System.out.println(
					"1: Musteri Bilgileri\n2: Musteri Bakiye\n3: Musteri Para Transfer\n4: Musteri Para Yatir\n5: Musteri Para Cek\n6: Cikis ");
			System.out.println("Bir islem seciniz.");
			int tus = scanner.nextInt();

			switch (tus) {
			case 1: {
				System.out.println("----------------------------------");
				atm.musteri(musteri1);
				System.out.println("----------------------------------");
				atm.musteri(musteri2);
				System.out.println("****************************************");
				break;
			}

			case 2: {
				System.out.println("----------------------------------");
				atm.bakiyeSorgula(musteri1);
				System.out.println("----------------------------------");
				atm.bakiyeSorgula(musteri2);
				System.out.println("****************************************");
				break;

			}

			case 3: {
				System.out.println("----------------------------------");
				atm.paraTransfer(musteri1, musteri2);
				System.out.println("****************************************");
				break;
			}
			
			case 4: {
				System.out.println("----------------------------------");
				atm.paraEkle(musteri1);
				System.out.println("****************************************");
				break;
			}
			
			case 5: {
				System.out.println("----------------------------------");
				atm.paraCek(musteri1);
				System.out.println("****************************************");
				break;
			}
			
			case 6: {
				System.out.println("EXİT");
				kontrol = 0;
				break;
			}
			
			default : {
				System.out.println("Hatali tuslama");
				return;
			}

			}

		}
	}

}
