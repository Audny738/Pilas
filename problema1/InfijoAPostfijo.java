import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfijoAPostfijo {
    Stack pila = new Stack<Tokens>();
    Tokens token = new Tokens();
    
    public ArrayList<Tokens> convertirPost(ArrayList<Tokens> expresion){
        ArrayList<Tokens> expSalida = new ArrayList<>();

        for(Tokens token : expresion){
            if(token.getTipos() == Tokens.Tipos.OPERANDO){
                expSalida.add(token);
            }
            if(token.getTipos() == Tokens.Tipos.OPERADORALTO ){
                pila.push(token);
            }
            if(token.getTipos() == Tokens.Tipos.OPERANDOMEDIO){
                pila.push(token);
            }
            if(token.getTipos() == Tokens.Tipos.OPERADORBAJO){
                pila.push(token);
            }
            if(token.getTipos() == Tokens.Tipos.PARENTESISABIERTO){
                pila.push(token);
            }
            if(token.getTipos() == Tokens.Tipos.PARENTESISCERRADO){
                while (!pila.empty()) {
                    if(pila.peek() != Tokens.Tipos.PARENTESISABIERTO){
                        expSalida.add(pila.pop());
                    }else{

                    }
                }
            }

        }




        return expSalida;



    }
}
