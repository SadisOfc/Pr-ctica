package Juanito;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        NumerosPrimos primo = new NumerosPrimos();
        System.out.println("Verificar Números Primos");
        while(true){
            System.out.println("Digite el número");
            int num = Integer.parseInt(l.nextLine());
            primo.Primo(num);

            if(num==0){
                l.close();
                System.exit(0);
            }
        }
    }

    public void Primo(int numero){
        int primo = 0;
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                primo++;
            }
        }
        if(primo==2){
            System.out.println("El número " + numero + " es primo");
            System.out.println();
        }else{
            System.out.println(numero + " no es un número primo");
            System.out.println();
        }
    }

}
