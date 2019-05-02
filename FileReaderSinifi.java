package asdfgh;
import java.io.*;

public class FileReaderSinifi {

	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\ceng00\\Desktop\\ornek.txt");
		char veriler[] = new char[(int) f.length()]; //Dosyadan Okunan Verilerin tutuldu�u Char Dizisi
		if(!f.exists()){ //Dosyan�n olup olmad��n� kontrol ediyor
			try{
				f.createNewFile();  //Dosya Yoksa Olu�turuyor
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
		try{
			FileWriter f3 = new FileWriter(f, true); //Dosyay� yazma i�in a��yor.
			f3.write(" Harikad�r."); //Dosyaya sondan ekleyerek yaz�yor.
			f3.close(); //Dosyay� kapatt�.
			FileReader f2 = new FileReader(f);  //Ayn� Dosyay� Okumak i�in a��yor.
			f2.read(veriler);  //Dosyadaki verileri char []veriler dizisine at�yor.
			String okunan =  new String(veriler); //char []veriler dizinini Stringe �eviriy
			System.out.println(okunan); //Ekrana okunan veriyi bas�yor.
			f2.close(); //Dosyay� kapat�yor.
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}

}
