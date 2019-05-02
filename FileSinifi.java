package asdfgh;
import java.io.*;

public class FileSinifi {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ceng00\\Desktop\\ornek.txt");
		try{
			FileOutputStream yaz = new FileOutputStream(f, true);
			String metin = "Süperdir.";
			byte veriler[] = metin.getBytes();
			yaz.write(veriler);
			yaz.close();
			FileInputStream oku = new FileInputStream(f);
			byte dizi[] = new byte[(int) f.length()];
			oku.read(dizi);
			String okunan = new String(dizi);
			System.out.println(okunan);
			oku.close();
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
