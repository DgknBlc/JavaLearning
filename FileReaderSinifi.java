package asdfgh;
import java.io.*;

public class FileReaderSinifi {

	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\ceng00\\Desktop\\ornek.txt");
		char veriler[] = new char[(int) f.length()]; //Dosyadan Okunan Verilerin tutulduðu Char Dizisi
		if(!f.exists()){ //Dosyanýn olup olmadðýný kontrol ediyor
			try{
				f.createNewFile();  //Dosya Yoksa Oluþturuyor
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
		try{
			FileWriter f3 = new FileWriter(f, true); //Dosyayý yazma için açýyor.
			f3.write(" Harikadýr."); //Dosyaya sondan ekleyerek yazýyor.
			f3.close(); //Dosyayý kapattý.
			FileReader f2 = new FileReader(f);  //Ayný Dosyayý Okumak için açýyor.
			f2.read(veriler);  //Dosyadaki verileri char []veriler dizisine atýyor.
			String okunan =  new String(veriler); //char []veriler dizinini Stringe çeviriy
			System.out.println(okunan); //Ekrana okunan veriyi basýyor.
			f2.close(); //Dosyayý kapatýyor.
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}

}
