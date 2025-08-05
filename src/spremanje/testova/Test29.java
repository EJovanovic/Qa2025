package spremanje.testova;
//28.Napisati fuknciju koja vraca double duzinu stranice kvadrata za prosledjenu double povrsinu kvadrata.
public class Test29 {
    public static double vratiDoubleDuzinuStranice(double povrsina){
        return Math.sqrt(povrsina);

    }
    public static void main(String[]args){
        double povrsina=433;
       double rezultat= vratiDoubleDuzinuStranice(povrsina);
        System.out.println("duzina je: "+ rezultat);
    }
}
