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


    enum Tipos{
        OPERANDO ("[0-9]+"),
        OPERADORBAJO ("[+|-]"),
        OPERANDOMEDIO ("[*|/]"),
        OPERADORALTO("[**]"),
        PARENTESISABIERTO("[(]"),
        PARENTESISCERRADO("[)]"),
        PUNTOYCOMA("[;]");

        public final String patron;
        Tipos(String s){
            this.patron = s;
        }
    }
    
}
