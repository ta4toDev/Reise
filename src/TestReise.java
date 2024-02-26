import java.util.Date;

public class TestReise {

    public static void main(String[] args) {
        Reise eins = new StandardReise(new Date(2024,03,01), 999.99);
        Reise zwei = new PremiumReise(new Date(2024,03,15), 999.99);

        System.out.println(eins);
        System.out.println(zwei);

    }
}
