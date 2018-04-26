package essais_successifs;

import java.util.ArrayList;

public class EssaisSuccessifs {

    int rendre = 58;
    ArrayList<Integer> solution = new ArrayList<>();
    ArrayList<Integer> test = new ArrayList<>();


    public void solopt(int i){
        int x;

        int c [] = {1,2,5,10,20,50,100,200};                            //CALCULER Si

        for(int j = 0; j < c.length ; j++){                             //xi PARCOURANT Si
            x = c[j];

            int somme = 0;

            if(!test.isEmpty()) {
                for(int k = 0 ; k < test.size() ; k++){
                    somme+=test.get(k);
                }
            }

            if(somme + x <= rendre){                                    //SATISFAISANT(xi)
                test.add(x);

                if(somme + x == rendre){                                //SOLTROUVEE
                    if(solution.isEmpty()){
                        for(int k = 0 ; k < test.size() ; k++){
                            solution.add(test.get(k));
                        }
                    }

                    else if(test.size() < solution.size()){                  //MEILLEURE

                        solution.clear();

                        for(int k = 0 ; k < test.size() ; k++){
                            solution.add(test.get(k));
                        }
                    }
                }

                else {
                    if(true){                                           //ENCOREPOSSIBLE
                        if(solution.isEmpty() || i+1 <= solution.size()) {
                            solopt(i + 1);
                        }
                    }
                }

                test.remove(test.size()-1);
            }
        }
    }

    public static void main(String[] args){
        EssaisSuccessifs e = new EssaisSuccessifs();

        e.solopt(1);

        for(int i = 0;i<e.solution.size();i++){
            System.out.println(e.solution.get(i));
        }
    }
}


