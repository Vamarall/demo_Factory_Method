
//Classe utilitaria para criar pizzas
public class PizzaFactory {

    private PizzaFactory(){
    }
    
    public static Pizza getInstance(boolean sweet){
        return sweet ? new PizzaChocolate() : new PizzaCalabresa();
    }
}
