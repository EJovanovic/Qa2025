package vezbanjakodkuce1;
// Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
public class KucaVezbanje45 {
    public static void DaLiJeSumaVecaOdProizvoda(int[]x) {
        int suma = 0;
        int proizvod = 1;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
            proizvod *= x[i];
        }
            if (suma > proizvod) {//uslov ide nakon for petlje, moras zatvoriti for petlju
                System.out.println("Suma je veca od proizvoda");
            } else {
                System.out.println("Proizvod je veci od sume");

            }
        }




        public static void main(String[]args){
        int[]niz={1,5,2,6,8};
        DaLiJeSumaVecaOdProizvoda(niz);
    }

}
