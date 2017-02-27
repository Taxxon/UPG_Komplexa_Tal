/**
 * Created by emka15 on 2017-02-27.
 */
public class Test {
    public static void main(String[] arg) {

        Komplex test = new Komplex(2,3);
        Komplex test2 = new Komplex(1,2);
        Komplex summa = test.add(test2);

        System.out.println(summa.toString());
    }
}