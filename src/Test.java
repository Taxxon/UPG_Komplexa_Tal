/**
 * Created by emka15 on 2017-02-27.
 */
public class Test {
    public static void main(String[] arg) {

        //test för metoden add som funkar
        Komplex test = new Komplex(2,3);
        Komplex test2 = new Komplex(1,2);
        Komplex summa = test.add(test2);

        System.out.println(summa.toString());

        //test för metoden multiply  som funkar
        Komplex test3 = new Komplex(2,3);
        Komplex test4 = new Komplex(1,2);
        Komplex summa2 = test.multiply(test2);

        System.out.println(summa2.toString());

        //test för metoden arg som funkar
        double vinkel = test.arg();

        System.out.println("Vinkeln är " + vinkel);

        //test för equals metoden som funkar
        Komplex test5 = new Komplex(2,6);
        Komplex test6 = new Komplex(2,6);

        boolean same = test.equals(test2);
        boolean same2 = test5.equals(test6);

        System.out.println(same);
        System.out.println(same2);
    }
}