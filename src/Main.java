import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    private static int Max = 9;
    private static int Min = 2;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Set<Example> examples = new HashSet<>();
        while (examples.size() < 15) {
            int number1 = (int) (Math.random() * ((Max - Min) + 1)) + Min;
            int number2 = (int) (Math.random() * ((Max - Min) + 1)) + Min;
            Example example = new Example(number1, number2);
            examples.add(example);
        }
        Iterator<Example> i = examples.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
       HashMap<Integer,Pasport> pasports = new HashMap<>();
       Pasport pasport1= new Pasport("Ivan","Ivanov","a",1992);
       Pasport pasport2= new Pasport("Pavel","Petrov","q",1990);
       Pasport pasport3= new Pasport("Andrey","e","y",1999);
       pasports.put(pasport1.getPasportId(),pasport1);
       pasports.put(pasport2.getPasportId(),pasport2);
       pasports.put(pasport3.getPasportId(),pasport3);

        System.out.println(pasports.get(pasport2.getPasportId()));
    }

}