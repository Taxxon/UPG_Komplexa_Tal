/**
 * Created by Emil Käck on 2017-02-27.
 */
public class Komplex {

    double real;
    double imaginär;

    //metod som gör om double till komplex
    public Komplex (double re, double im) {
        this.real = re;
        this.imaginär = im;
    }

    // Plusar på två komplex
    public Komplex add(Komplex a){
        double newReal = this.real + a.real;
        double newImaginär = this.imaginär + a.imaginär;
        //double koplex = newImaginär + newReal;
        Komplex svar = new Komplex(newReal, newImaginär);
        return svar;
    }

    // multipliserar två komplex
    public Komplex multiply(Komplex a){
        double newReal = (this.real * a.real) - (this.imaginär * a.imaginär);
        double newImaginär = (this.imaginär * a.real) + (this.real * a.imaginär);
        Komplex svar = new Komplex(newReal, newImaginär);
        return svar;
    }

    // metod för att räkna ut vinkeln i radianer
    public double arg() {
       return (Math.atan2(this.imaginär, this.real));
    }

    //metod för att titta om två komplex är samma
    public boolean equals(Komplex a){
        if(this.real == a.real && this.imaginär == a.imaginär){
            return true;
        } else {
            return false;
        }

    }

    //Skriver ut ett tal som (Re(Z)+Im(Z)i)
    public String toString() {
        return real + " + " + imaginär + "i";
    }

}
