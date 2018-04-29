import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�al��anlar program�na ho�geldiniz..");
		String islemler = "��lemler..\n"
				+ "1.Yaz�l�mc� ��lemleri\n"
				+"2.Y�netici i�lemleri\n"
				+"��k�� i�in q ya bas�n�z";
		System.out.println("**************************");
		System.out.println(islemler);
		System.out.println("**************************");
		
		while(true) {
		System.out.print("��lem se�iniz: ");
		String islem = scan.nextLine();
		if(islem.equals("q")) {
			System.out.println("Programdan ��k�l�yor..");
			break;
		}
		else if(islem.equals("1")) {
			
			Yazilimci yazilimci= new Yazilimci("Ay�e","Y�lmaz",123,"java,c");
			String yazilimci_islem = "YAZILIMCI ISLEMLERI\n"
									+"1.Format at.\n"
									+ "2.Bilgileri g�ster\n "
									+"��k�� i�in q ya bas�n�z";
			System.out.println(yazilimci_islem);
			while(true) {
				System.out.println("��lemi se�iniz: ");
				String y_islem = scan.nextLine();
				
				if(y_islem.equals("q")) {
					System.out.println("Yaz�l�mc� i�lemlerinden ��k�l�yor..");
					break;
				}
				else if(y_islem.equals("1")) {
					System.out.println("��letim sistemi: ");
					String isletim_sistemi= scan.nextLine();
					yazilimci.formatAt(isletim_sistemi);
				}
				else if(y_islem.equals("2")) {
					yazilimci.bilgileriGoster();
				}
				else {
					System.out.println("Ge�ersiz yaz�l�mc� i�lemi.");
				}
			}
		}
		
		else if(islem.equals("2")) {
			Yonetici yonetici = new Yonetici("Ali","Veli",456,4);
			String yonetici_islem = "YONETICI ISLEMLERI\n"
					+"1.Zam yap.\n"
					+ "2.Bilgileri g�ster\n "
					+ "��k�� i�in q ya bas�n�z";
			System.out.println(yonetici_islem);
			while(true) {
				System.out.println("��lem se�iniz: ");
				String yonetici_is = scan.nextLine();
				
				if(yonetici_is.equals("q")) {
					System.out.println("Y�netici i�lemlerinden ��k�l�yor..");
					break;
				}
				else if(yonetici_is.equals("1")) {
					System.out.print("Zam yap�lacak tutar: ");
					int tutar = scan.nextInt();
					scan.nextLine();
					yonetici.zamYap(tutar);
				}
				else if(yonetici_is.equals("2")) {
					yonetici.bilgileriGoster();
				}
				else {
					System.out.println("Ge�ersiz yonetici i�lemi.");
				}
				
			}
		}
		else {
			System.out.println("Ge�ersiz i�lem.");
		}
	}
}
}
