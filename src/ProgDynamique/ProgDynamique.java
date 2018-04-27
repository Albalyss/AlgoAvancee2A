package ProgDynamique;

import java.util.ArrayList;

public class ProgDynamique {

    int c [] = {1,2,5,10,20,50,100,200};


    public void progDynamique(int rendre){
        int n = c.length;

        int tab[][] = new int[n][rendre+1];             //Tableau contenant indiquant le nombre de piece à rendre, par ex : tab[6][190] = 1 signifie qu'il faudra 1 piece de c[6] = 100 si on doit rendre 190

        for(int i = 0 ; i < rendre+1 ; i++){            //On initialise le tableau en mettant en remplissant la 1ère ligne
            if(i%c[0]==0){                              //Si le montant i est un multiple de la valeur de la pièce c0
                tab[0][i] = i/c[0];                     //Alors tab[0][i] recoit le quotient dans la division euclidienne de i par c[0]
            }
        }

        for(int i = 1 ; i < n ; i ++){                              //On remplit ensuite toutes les autres lignes
            for(int j = 0 ; j < rendre+1 ; j++){                    //Pour chaque montant inférieur ou égal au montant que l'on veut rendre
                tab[i][j] = tab[i-1][j];

                if(c[i] <= j){
                    if(tab[i][j - c[i]] + 1 < tab[i][j]){
                        tab[i][j] = tab[i][j-c[i]]+1;
                    }
                }
            }
        }

        int solution[] = new int[n];
        int i = n-1;
        int j = rendre;

        while(j!=0){
            if(j >= c[i]){
                if(tab[i][j-c[i]]+1==tab[i][j]){
                    solution[i]+=1;
                    j -= c[i];
                }
            }

            else{
                i = i - 1;
            }
        }

        ArrayList<Integer> monnaie = new ArrayList<>();

        for(int k = 0 ; k < n ; k ++){
            for (int l = 0 ; l < solution[k] ; l++){
                monnaie.add(c[k]);
            }
        }

        for(int k = 0 ; k < monnaie.size() ; k++){
            System.out.println(monnaie.get(k));
        }
    }

    public static void main(String[] args){
        ProgDynamique p = new ProgDynamique();

        p.progDynamique(190);
    }
}
