package Es1;

import PackExceptions.OverPositionException;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            int pos;
            do {
                int [] las =new int [5];
                for (int i = 0; i < las.length; i++) {
                    Random random=new Random();
                    las[i]= random.nextInt(10)+1;
                    System.out.print(las[i]+ " ");
                }
                System.out.println();
                System.out.println("In che posizione vorresti accedere? Scegli da 1 a 5. 0 per uscire!");
                pos= scanner.nextInt();
                if (pos>0 & pos<= las.length){
                    System.out.println("Che numero vorresti inserire nella posizione scelta?");
                    int num= scanner.nextInt();
                    pos=pos-1;
                    las[pos]=num;
                    for (int la : las) {
                        System.out.print(la + " ");
                    }
                    System.out.println();
                } else if (pos==0) {
                    System.out.println("Fine!");
                }else {
                    throw new OverPositionException();
                }
            }while (pos!=0);
        }catch (OverPositionException ex) {
        }
    }
}
