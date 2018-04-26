package ProgDynamique;

import java.util.ArrayList;

public class ProgDynamique {

    int c [] = {1,2,5,10,20,50,100,200};

    /*public void init(int rendre){
        tab = new int[rendre];

        for (int i = 0 ; i < tab.length ; i++){
            tab[i] = -1;
        }

        for(int i : c){
            tab[i]=i;
        }
    }*/

    public void progDynamique(int rendre){
        ArrayList<Integer> tab[] = new ArrayList[rendre];

        for (int i = 0 ; i < tab.length ; i++){
            tab[i] = new ArrayList<>();
        }

        for(int i : c){
            tab[i].add(i);
        }

        for(int i = 0 ; i < tab.length ; i++ ){
            if(tab[i].isEmpty()){

            }
        }
    }
}
