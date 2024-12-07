public class App {
    public static void main(String[] args) throws Exception {
        Pizza calabresa = PizzaFactory.getInstance(false);
        Pizza chocolate = PizzaFactory.getInstance(true);

        System.out.println(calabresa);
        System.out.println(chocolate);
    }
}
