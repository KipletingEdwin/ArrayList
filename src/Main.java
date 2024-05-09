import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ArrayList     =       a resizable array
        //                      Elements can be added and removed after compilation phase
        //                      store reference data types


        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
//        food.clear();

        food.set(0, "sushi");
        food.remove(2);

        for (int i = 0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}