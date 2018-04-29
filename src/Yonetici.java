public class Yonetici extends Calisanlar{
	private int sorumlu_kisi_sayisi;
	
	public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Y�neticinin sorumlu oldu�u ki�i say�s�: " + sorumlu_kisi_sayisi);
	}
	public void zamYap(int zam_miktari) {
		System.out.println(getAd() + "�al��anlara " + zam_miktari + "kadar zam yap�yor..");
	}
	
	
	
}
