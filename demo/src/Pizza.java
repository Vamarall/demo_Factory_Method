
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected List<Ingredientes> Ingredientes = new ArrayList<>();

    protected Pizza(){
    }
    
        public  List<Ingredientes> getIngredientes(){
            return Ingredientes;
        }


        @Override
        public String toString() {
            return "Pizza: " + Ingredientes;
        }

            

    }
