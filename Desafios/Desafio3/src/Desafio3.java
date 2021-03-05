import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Desafio3 {
    public static void main(String[] args) {

        int multiplicador;
        int intervalo;
        int fimIntervalo;
        int i=0;
        int resultado;

        Scanner input = new Scanner(System.in);

        System.out.println("Multiplicador:");
        multiplicador= input.nextInt();
        if(multiplicador<0){
            System.out.println("O multiplicando inserido não é válido");
        }else{
            System.out.println("Intervalo:");
            intervalo=input.nextInt();

            if(intervalo <0 || intervalo > 5000){
                System.out.println("O intervalo inserido não é válido");

            }else{
                System.out.println("Fim do Intervalo:");
                fimIntervalo=input.nextInt();;

                if(fimIntervalo<0 || fimIntervalo>5000){
                    System.out.println("O fim do intervalo inserido não é válido");

                }else if (fimIntervalo-intervalo > 10)
                {
                    System.out.println("Intervalo entre números ultrapassado");

                }else if(intervalo>fimIntervalo){
                    System.out.println("O início do intervalo não pode ser maior que o fim do intervalo");

                }else{
                    input.close();
                    for( i=intervalo; i<fimIntervalo; i++){
                        resultado = multiplicador * intervalo;
                        System.out.println(multiplicador+ " x " + intervalo +"="+ resultado);
                        intervalo++;
                    }
                }
            }
        }

    }
}
