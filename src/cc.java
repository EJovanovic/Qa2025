public class cc {
    public static int prebrojBrojPonavljanja(int[]niz){
        int brojPonavljanje=0;
        for(int i=0;i<niz.length;i++){
            if(niz[i]==brojPonavljanje){
                brojPonavljanje++;
            }
        }
    }

}
