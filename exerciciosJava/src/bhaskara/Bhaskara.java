/**package bhaskara;
import java.util.Scanner;

//fórmula de báskara: x=(-b +- raiz_de_deta)/2.a
//fórmula do delta: b² - 4.a.c

public class Bhaskara {
        public static void main(String[] args) {

            //declarar variáveis da fórmula
            double a,b,c,delta,x,x1,x2;

            Scanner input = new Scanner(System.in);

            System.out.print("Insira o valor correspondente a A");
            a = Double.parseDouble(input.next());

            System.out.print("Insira o valor correspondente a B");
            b = Double.parseDouble(input.next());

            System.out.print("Insira o valor correspondente a C ");
            c = Double.parseDouble(input.next());

            input.close();

            delta=(Math.pow(b,2))-(4*(a*c));

            if(delta==0){
                x =(-b+Math.sqrt(delta))/(2*a);
                System.out.printf("x = %.3f", x);

            } else if(delta>0&&(2*a)!=0){
                x1 =(-b+Math.sqrt(delta))/(2*a);
                x2 =(-b-Math.sqrt(delta))/(2*a);
                System.out.printf("Resultado: x1 = %.2f, x2 = %.2f",x1,x2);

            } else{
                System.out.println("Não é possível calcular raiz negativa.");
            }

        }
    }
**/
