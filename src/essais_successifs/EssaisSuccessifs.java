package essais_successifs;

import java.util.ArrayList;

public class EssaisSuccessifs {

    int rendre = 190;
    ArrayList<Integer> test = new ArrayList<>();

    ArrayList<Integer> solution = new ArrayList<>();

    public void solopt(int i){
        int x;
        ArrayList<Integer> c = new ArrayList<>();
        int somme = 0;

        c.add(1);
        c.add(2);
        c.add(5);
        c.add(10);
        c.add(20);
        c.add(50);
        c.add(100);
        c.add(200);

        for (int j = 0; j < c.size() ; j++){
            x = c.get(j);

            if(!test.isEmpty()){
                for (int k = 0; k <test.size(); k++){
                    somme+=test.get(k);
                }
            }else{
                somme = 0;
            }

            if(somme + x <= rendre){
                test.add(x);

                somme+=x;

                if(somme == rendre){

                    System.out.println(somme);
                    if(solution.isEmpty()){
                        solution = test;
                    }

                    else {
                        if(test.size() < solution.size()){
                            solution = test;
                        }
                    }
                }

                else{
                    System.out.println(somme);
                    solopt(i+1);
                }

            }

            //TODO : DEFAIRE(xi) test.remove(x);

        }
    }


    public static void main (String[] args){


       EssaisSuccessifs e = new EssaisSuccessifs();

       e.solopt(1);

        for(int i = 0; i<e.solution.size();i++){
           System.out.println(e.solution.get(i));
        }
    }


}


