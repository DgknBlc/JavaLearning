
public class Dikdortgen {
	private double boy, en;
	Dikdortgen(){
		en = 0;
		boy = 0;
	}
	Dikdortgen(double sayi, double sayi2){
		en = sayi;
		boy = sayi2;
	}
	public void setKenar(double en, double boy){
		this.en = en;
		this.boy = boy;
	}
	public double getBoy(){
		return boy;
	}
	public double getEn(){
		return en;
	}
	public double dikdortgenAlani(){
		return this.en * this.boy;
	}
}
