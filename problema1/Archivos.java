import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("expresiones.txt"));
			while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

				System.out.println(line);

        // Ciclo de iteración por caracter usando charAt()
        // nextLine.charAt(i) -> 2 + 3 ;);
        //StringTokenizer cadena = new StringTokenizer(line);
        //while(cadena.hasMoreTokens()){
          //tokens.add(cadena.nextToken());
        //}
      //}
      for (int i = 0; i < line.length() ; i++) {
        
        System.out.println("Char " + i + " is " + line.charAt(i));
        Tokens token = new Tokens(line.charAt(i));
        System.out.println(token);

      }


			}
      
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	  }
  }

}
