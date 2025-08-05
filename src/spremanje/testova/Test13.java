package spremanje.testova;
//9. Napisati funkciju koja vraca najveci element niza.
public class Test13 {
    public static int vracaNajveciBroj(int[]niz){
        int max=niz[0];//inicijalizujem max vrednost kao element u nizu na indeksu nula,dakle prvi element u nizu
        for(int i=1;i< niz.length;i++) {//idem kroz petlju od drugog elementa jer je prvi vec max
            if (niz[i] > max) {//ako nadjem da je neki element veci od tog max
                max=niz[i];//onda tom max dodeljujem vrednost tog elementa, nemoj ovde da pogresis pa da zamenis

            }
        }
            return max;//mora return jer smo stavili gore int
        }
        public static void main(String[]args){
        int[]niz={1,25,8,9,4,5};
        int vrednost=vracaNajveciBroj(niz);//stavljam pre ispisa int vrednost
            System.out.println("najveci element je" + vrednost);//ispisujem najveci
    }

}
/** inicijalizujem max na nulti indeks niza
for petlja od prvog do poslednjeg u nizu ako je trenutni element tog niza veci od max koji smo incijalizovali
 ti onda tom maksimumu dodeli vrednost tog niza i ispisi
 mora imati return max
 **/