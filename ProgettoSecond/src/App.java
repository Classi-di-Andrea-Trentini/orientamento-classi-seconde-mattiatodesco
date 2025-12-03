import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int n1,n2, ops;
        while(true) {
        
            System.out.println("Inserisci il primo numero: ");
            n1=scanner.nextInt();
            System.out.println("Inserisci il secondo numero: ");
            n2=scanner.nextInt();
            
            System.out.println("Inserisci l'operazione:" +
            "\n1. +"+
            "\n2. -"+
            "\n3. x"+
            "\n4. /"
            );

            ops = scanner.nextInt();

            calc(n1, n2, ops);
            System.out.println("Continuare? (y/n): ");

            if (scanner.next().equals("n")) {
                break;
            }
        }

        int[] array = {1, 4, 65, 22, 432};
        ArrayList<Character> lista = new ArrayList<>(5);
        char c = 'a';
        lista.add('r');
        lista.add('a');
        lista.add('g');
        lista.add('y');
        lista.add(' ');
        lista.add('l');
        lista.add('5');
        int grandezza = lista.size();
        for (int i = array.length -1; i >= 0; i--) {
            
        }
        
        //array di array -> matrice
        char array[][] = new char[3][3];

        array[1][2]= 'x';


        int numero = 1;
        double num2 = numero;

        double numfl  = 2.9;
        int numint2  = (int)numfl;
        

        //cast char int
        char lett =  'f';
        int letf = (int)lett;
        System.out.println(letf);
    



    }


    public static int calc(int num1,int num2, int ops){
        int res;
       
        switch (ops) {
            case 1:
                res = num1 + num2;       
                break;
            case 2:
                res = num1 - num2;       
                break;
            case 3:
                res = num1 * num2;       
                break;
            case 4:
                res = num1 / num2;       
                break;
            default:
                System.out.println("Input invalido");
                res = 0;
                break;
        
        }
        System.out.println("Risultato: " + res);
        return res;
    }
}
