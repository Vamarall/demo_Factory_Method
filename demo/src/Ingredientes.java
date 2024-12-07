
public class Ingredientes {

    private String nome;


    public Ingredientes(String nome){
        this.nome = nome;
    }


    @Override
    public String toString() {
        return " [nome=" + nome + "]";
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
