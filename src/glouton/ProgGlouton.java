package glouton;

import java.util.ArrayList;


public class ProgGlouton {

        static ArrayList<Integer> res = new ArrayList<Integer>();

        public static void  resGlouton (int aRendre, int[] piecedispo ) {
            //On suppose que le tableau piece dispo est trié par ordr décroissant, sinon il faut ajouter une méthode tri
            int l = piecedispo.length;
            for( int i = 0; i< l; i++) {
                while (aRendre - piecedispo[i] >=0 ){
                    res.add(piecedispo[i]);
                    aRendre = aRendre - piecedispo[i];
                }
            }
        }

        public static void main (String[] args){
            int aRendre = 31;
            int[] piecedispo = {200, 100, 50, 20, 10, 5, 2, 1};
            resGlouton(aRendre, piecedispo);
            System.out.println(res);
        }

}


