import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Çalýþanlar programýna hoþgeldiniz..");
		String islemler = "Ýþlemler..\n"
				+ "1.Yazýlýmcý Ýþlemleri\n"
				+"2.Yönetici iþlemleri\n"
				+"Çýkýþ için q ya basýnýz";
		System.out.println("**************************");
		System.out.println(islemler);
		System.out.println("**************************");
		
		while(true) {
		System.out.print("Ýþlem seçiniz: ");
		String islem = scan.nextLine();
		if(islem.equals("q")) {
			System.out.println("Programdan çýkýlýyor..");
			break;
		}
		else if(islem.equals("1")) {
			
			Yazilimci yazilimci= new Yazilimci("Ayþe","Yýlmaz",123,"java,c");
			String yazilimci_islem = "YAZILIMCI ISLEMLERI\n"
									+"1.Format at.\n"
									+ "2.Bilgileri göster\n "
									+"Çýkýþ için q ya basýnýz";
			System.out.println(yazilimci_islem);
			while(true) {
				System.out.println("Ýþlemi seçiniz: ");
				String y_islem = scan.nextLine();
				
				if(y_islem.equals("q")) {
					System.out.println("Yazýlýmcý iþlemlerinden çýkýlýyor..");
					break;
				}
				else if(y_islem.equals("1")) {
					System.out.println("Ýþletim sistemi: ");
					String isletim_sistemi= scan.nextLine();
					yazilimci.formatAt(isletim_sistemi);
				}
				else if(y_islem.equals("2")) {
					yazilimci.bilgileriGoster();
				}
				else {
					System.out.println("Geçersiz yazýlýmcý iþlemi.");
				}
			}
		}
		
		else if(islem.equals("2")) {
			Yonetici yonetici = new Yonetici("Ali","Veli",456,4);
			String yonetici_islem = "YONETICI ISLEMLERI\n"
					+"1.Zam yap.\n"
					+ "2.Bilgileri göster\n "
					+ "Çýkýþ için q ya basýnýz";
			System.out.println(yonetici_islem);
			while(true) {
				System.out.println("Ýþlem seçiniz: ");
				String yonetici_is = scan.nextLine();
				
				if(yonetici_is.equals("q")) {
					System.out.println("Yönetici iþlemlerinden çýkýlýyor..");
					break;
				}
				else if(yonetici_is.equals("1")) {
					System.out.print("Zam yapýlacak tutar: ");
					int tutar = scan.nextInt();
					scan.nextLine();
					yonetici.zamYap(tutar);
				}
				else if(yonetici_is.equals("2")) {
					yonetici.bilgileriGoster();
				}
				else {
					System.out.println("Geçersiz yonetici iþlemi.");
				}
				
			}
		}
		else {
			System.out.println("Geçersiz iþlem.");
		}
	}
}
}
