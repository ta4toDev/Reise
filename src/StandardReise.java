import java.util.Date;
//Die Klasse StandardReise repräsentiert eine Standardreise
public class StandardReise extends Reise{
    //konstruktor für eine Standardreise
    public StandardReise(Date reiseBeginn, double grundPreis) {
        super(reiseBeginn, grundPreis);//Aufruf des Konstruktors der Oberklasse Reise
    }
    //Implementierung der abstrakten Methode tageBestimmen für Standardreise
    protected int tageBestimmen(){
        return 42;//Hier wird Anzahl der Tage bis zum Reisebeginn für eine Standardreise berechnet
    }
    protected double preisBerechnen(){
        return 0;
    }
}
