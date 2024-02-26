import java.util.Date;
//Die Klassse PremiuReise repräsentiert eine Premiumreise
public class PremiumReise extends Reise{
    public PremiumReise(Date reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis); //Aufruf des Konstruktors der Oberklasse Reise
    }

    @Override
    protected int tageBestimmen() {
        return 0;
    }

    @Override
    protected double preisBerechnen() {
        return 0;
    }
}
