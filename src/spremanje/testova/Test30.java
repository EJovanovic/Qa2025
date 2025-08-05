package spremanje.testova;
//29.Napisati fuknciju koja vraca double duzinu poluprecnika kruga za prosledjenu double povrsinu kruga.
public class Test30 {
    public static double izracunajPoluPrecnik(double povrsina){
        double pi=Math.PI;
        double poluprecnik= Math.sqrt(povrsina/pi);
        return poluprecnik;

    }
    public static void main(String[]args){
        double povrsina=17.77;
        double poluprecnik= izracunajPoluPrecnik(povrsina);

    }
}
