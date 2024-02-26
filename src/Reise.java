import java.util.Date;
//Die abstrakte Klasse Reise stellt die gemeinsamen Eigenschaften und Methoden aller Reisen dar
public abstract class Reise {
    protected double grundPreis; //Der Grundpreis der Reise
    private Date reiseBeginn; //Das Startdatum der Reise
    //Abstrakte Methoden,die in den Unterklassen implementiert werden müssen
    protected abstract int tageBestimmen();
    //Ermittelt die Anzahl der Tage bis zum Reisebeginn
    protected abstract double preisBerechnen();//Berechnet den Reisepreis

    @Override
    public String toString() {
        return "Reise{" +
                "grundPreis=" + grundPreis +
                ", reiseBeginn=" + reiseBeginn +
                '}';
    }

    //Konstruktor für eine Reise
    public Reise(Date reiseBeginn, double grundPreis) {
        this.reiseBeginn = reiseBeginn;
        this.grundPreis = grundPreis;
    }
//Getter und Setter
    public double getGrundPreis(){
        return grundPreis;
    }
    public void setGrundPreis(double grundPreis){
        this.grundPreis = grundPreis;
    }

    public Date getReiseBeginn() {
        return reiseBeginn;
    }
    public void setReiseBeginn(Date reiseBeginn) {
        this.reiseBeginn = reiseBeginn;
    }
}