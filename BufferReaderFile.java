package asdfgh;
import java.io.*;

public class BufferReaderFile {
	public static void main(String[] args){
		try{
			File f = new File("C:\\Users\\ceng00\\Desktop\\ornek.txt");
			FileReader oku =new FileReader(f);
			BufferedReader br = new BufferedReader(oku);
			String satir = br.readLine();
			while(satir != null){
				System.out.println(satir);
				satir = br.readLine();
			}
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
