
public class Yumurta {

	
	 int yumurta_sayisi = 0;
	 Yumurta sepeteKoy(){
		 yumurta_sayisi++;
		 return this;
	 }
	 
	 	
	public static void main(String[] args) {
		Yumurta y = new Yumurta();
		System.out.println(y.sepeteKoy().sepeteKoy().sepeteKoy().yumurta_sayisi);
		System.out.println(y.yumurta_sayisi);

	}

}
