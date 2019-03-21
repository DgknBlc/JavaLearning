package proje;

public class Calis{
	public static void main(String[] args){
		Yamuk foo = new Yamuk();
		foo.bilgi(12, 6, 3);
		System.out.println(foo.isimGetir()+ " Alaný : " + foo.alanHesap());
		
	}
}

abstract class Sekil {
	private String isim;
	public void isimBelirle(String a){
		isim = a;
	}
	String isimGetir(){
		return isim;
	}
	abstract double alanHesap();
}

class Ucgen extends Sekil{
	double taban;
	double yukseklik;
	void bilgi(double taban, double yukseklik){
		this.taban = taban;
		this.yukseklik = yukseklik;
		this.isimBelirle("Üçgen");
	}
	double alanHesap() {
		return taban*yukseklik;
	}
	
}
class Yamuk extends Sekil{
	double alt;
	double ust;
	double h;
	void bilgi(double alt, double ust, double h){
		this.alt = alt;
		this.ust = ust;
		this.h = h;
		this.isimBelirle("Yamuk");
	}
	double alanHesap() {
		return (alt+ust)/2*h;
	}
	
}
class Daire extends Sekil{
	double yaricap;
	final double pi = 3.14;
	void bilgi(double yaricap){
		this.yaricap = yaricap;
		this.isimBelirle("Daire");
	}
	double alanHesap() {
		return pi*yaricap*yaricap;
	}
}

