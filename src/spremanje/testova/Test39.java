package spremanje.testova;
//prvi najmanji i drugi najmanji
public class Test39 {
    public static int [] ispisiPrviIdrugiNajmanji(int[]niz){
        int prviNajmanji= Integer.MAX_VALUE;
        int drugiNajmanji= Integer.MIN_VALUE;
       if(niz.length<2){
           return new int[]{-1-1};

        }
       for(int i=0;i< niz.length;i++){
           if(niz[i]<prviNajmanji) {
               drugiNajmanji=prviNajmanji;
               prviNajmanji = niz[i];

           }else if(niz[i]<drugiNajmanji && niz[i]!=prviNajmanji){
               drugiNajmanji=niz[i];

           }

       }
       return new int[]{prviNajmanji,drugiNajmanji};
    }


}
