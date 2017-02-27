/**
 * Created by Emil Käck on 2017-02-27.
 */
public class Komplex {

    double real;
    double imaginär;

    public Komplex (double re, double im) {
        this.real = re;
        this.imaginär = im;
    }

    public Komplex add(Komplex a){
        double newReal = this.real + a.real;
        double newImaginär = this.imaginär + a.imaginär;
        //double koplex = newImaginär + newReal;
        Komplex svar = new Komplex(newReal, newImaginär);
        return svar;
    }

    public Komplex multiply(Komplex a){
        double newReal = (this.real * a.real) - (this.imaginär * a.imaginär);
        double newImaginär = (this.imaginär * a.real) + (this.real * a.imaginär);
        Komplex svar = new Komplex(newReal, newImaginär);
        return svar;
    }

    public double arg() {
       return (Math.atan2(this.imaginär, this.real));
    }



    public String toString() {
        return real + " + " + imaginär + "i";
    }



}
