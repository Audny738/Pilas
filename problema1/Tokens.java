public class Tokens {
    private Tipos tipo;
    private String valor;

    public Tipos getTipos(){
        return tipo;
    }

    public void setTipo(Tipos tipo){
        this.tipo = tipo;
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String toString(){
      String output = null;
      switch(this){
            case OPERANDO: output ="OPERANDO"; break;
            case OPERADORBAJO: output ="OPERADORBAJO"; break;
            case OPERANDOMEDIO: output ="OPERANDOMEDIO"; break;
            case OPERADORALTO: output ="OPERADORALTO"; break;
            case PARENTESISABIERTO: output ="PARENTESISABIERTO"; break;
            case PARENTESISCERRADO: output ="PARENTESISCERRADO"; break;
            case PUNTOYCOMA: output ="PUNTOYCOMA"; break;
      return output;
    }
    enum Tipos{
        OPERANDO ("[0-9]+"),
        OPERADORBAJO ("[+|-]"),
        OPERANDOMEDIO ("[*|/]"),
        OPERADORALTO("[**]"),
        PARENTESISABIERTO("[(]"),
        PARENTESISCERRADO("[)]"),
        PUNTOYCOMA(";");

        public final String patron;
        Tipos(String s){
            this.patron = s;
        }
    }
    
}
