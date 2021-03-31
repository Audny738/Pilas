import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Archivos {
    
    BufferedReader bufferedReader = new BufferedReader(new FileReader("exp_infijas.txt"));
    String line = bufferedReader.readLine();
    System.out.println(line);
            
        

}