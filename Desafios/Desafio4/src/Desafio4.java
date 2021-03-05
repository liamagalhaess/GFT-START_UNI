import java.util.Scanner;

public class Desafio4 {


    public static void main(String[] args){

        int total = 0;
        int valor;
        Scanner scanner = new Scanner(System.in);

        while(total < 157){
            System.out.println("Insira um valor: ");
            valor = scanner.nextInt();

            if(valor < 0) {
                System.out.println("Números negativos não são permitidos");
            }else{
                total += valor;
            }
        }
        System.out.println("TOTAL: " + total);

    }
