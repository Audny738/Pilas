import java.util.ArrayList;
import java.util.Stack;

public class InfijoAPostfijo {
    Stack<String> pila = new Stack<String>();
    Stack<String> pilaResultados = new Stack<String>();
    public ArrayList<String> convertirPost(ArrayList<String> expresion){
        ArrayList<String> expSalida = new ArrayList<>();
        for(String token : expresion){

            if(InfijoAPostfijo.isNumeric(token)){
                expSalida.add(token);
            }
            if(token.equals("(")){
                pila.push(token);
            }
            if(token.equals(")")){
                if(pila.isEmpty()){
                    System.out.println("ERROR: Numero de parentesis no coinciden");
                }else{
                    while (!(pila.isEmpty())) {
                        if (pila.peek().equals("(")) {
                            pila.pop();
                            break;
                        }else{
                            expSalida.add(pila.pop());
                        }
                    }
                }
            }
            if (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")||token.equals("**")) {
                if(pila.isEmpty()){
                    pila.push(token);
                }else{
                    while (!(pila.isEmpty())) {
                        if(pila.peek().equals("(")){
                            pila.push(token);
                            break;
                        }else{
                            if(prioridad(token) > prioridad(pila.peek())){
                                pila.push(token);
                                break;
                            }else if(prioridad(token) <= prioridad(pila.peek())){
                                expSalida.add(pila.pop());
                                pila.push(token);
                                break;
                            }
                        }

                        
                    }
                }
            }
            if(token.equals(";")){
                if(!(pila.isEmpty() && pila.peek().equals("("))){
                    System.out.println("ERROR: Parentesis no cerrado");
                }else{
                    while(!(pila.isEmpty())){
                        expSalida.add(pila.pop());
                    }
                }
                
            }
        }
        
        return expSalida;
    }

    public int evaluar(ArrayList<String> expPost){
        int resultado = 0;
        for(String i : expPost){
            if(InfijoAPostfijo.isNumeric(i)){
                pilaResultados.push(i);
            }else{
                int oper2 = Integer.parseInt(pilaResultados.pop());
                int oper1 = Integer.parseInt(pilaResultados.pop());
                switch (i) {
                    case "+":
                        resultado = oper1 + oper2;
                        pilaResultados.push(String.valueOf(resultado));
                        break;
                
                    case "-":
                        resultado = oper1 - oper2;
                        pilaResultados.push(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = oper1 * oper2;
                        pilaResultados.push(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = oper1 / oper2;
                        pilaResultados.push(String.valueOf(resultado));
                        break;
                    case "**":
                        resultado = oper1 ^ oper2;
                        pilaResultados.push(String.valueOf(resultado));
                        break;
                        
                }
            }
        }
        return resultado;
    }

    private static boolean isNumeric(String cadena){
        try {
          Integer.parseInt(cadena);
          return true;
        } catch (NumberFormatException nfe){
          return false;
        }
    }

    public int prioridad(String operando){
        int prioridad;
        switch (operando) {
            case "+":
                prioridad = 1;
                break;
            case "-":
                prioridad = 1;
                break;
            case "*":
                prioridad = 2;
                break;
            case "/":
                prioridad = 2;
                break;
            case "**":
                prioridad = 3;
                break;
            default:
                prioridad = 0;
                break;
        }
        return prioridad;
    }

}
