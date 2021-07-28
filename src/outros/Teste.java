package outros;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) {
		
		float myFloat = 1/2;

		String formattedString = String.format("%.02f", myFloat);
		System.out.println(formattedString);
		
		try{
			PrintWriter pw = new PrintWriter("dados/teste.txt");
			
			String a = "123";
			pw.append(a);
			pw.append("456");
			pw.write("aee");
			
			pw.flush();
			pw.close();
		} catch(FileNotFoundException e){
			System.out.println("A pasta para gravação de contas não existe");
		}

	}

}
