import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InfijoAPostfijoApp {

	public static void main(String[] args) {
    ArrayList<String> tokens = new ArrayList<String>();
    ArrayList<String> expFinal = new ArrayList<String>();
    ArrayList<String> lineas = new ArrayList<String>();
    ArrayList<Integer> resultados = new ArrayList<Integer>();
    InfijoAPostfijo exp = new InfijoAPostfijo();
    ArchivoSalida archivo = new ArchivoSalida();
		try {
			Scanner scanner = new Scanner(new File("exp_infijas.txt"));
			while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lineas.add(line);
        for(String i : lineas){
          StringTokenizer cadena = new StringTokenizer(i);
          while(cadena.hasMoreTokens()){
            tokens.add(cadena.nextToken());
          }
        }
        for(String j : exp.convertirPost(tokens)){
          expFinal.add(j);
        }
        resultados.add(exp.evaluar(exp.convertirPost(tokens)));
        tokens.clear();
      }     
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	  }
    archivo.crearArchivo(expFinal, resultados);

  }

}
