import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ArchivoSalida {
    public void crearArchivo(ArrayList<String> expresion, ArrayList<Integer> resultado){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("exp_postfijas.txt", true), "utf-8"));
            bufferedWriter.write("Exp: ");
            for(int j : resultado){
                for(String i : expresion){
                    bufferedWriter.write( i + ";");
                }
                bufferedWriter.write("Eval:" + j + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
