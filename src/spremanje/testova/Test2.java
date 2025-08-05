package spremanje.testova;
//Napisati funkciju naizmenicniParNepar(int[] niz) koja proverava da li se u nizu parni i neparni brojevi smenjuju.
public class Test2 {
    public static boolean naizmenicniParNepar(int[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {//prvo ide prolazak kroz petlju, mora niz.length-1 jer tad prestajemo sa proveravanjem
            if ((niz[i] % 2 == 0 && niz[i + 1] % 2 == 0) || (niz[i] % 2 != 0 && niz[i + 1] % 2 != 0)) {
                return false;//svaki element niza da li je paran i da li je svaki sledeci paran, pa onda da li su tu i neparni
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] niz = {2, 7, 8, 4, 5};
        System.out.println(naizmenicniParNepar(niz));
    }
}
