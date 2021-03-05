public class InvestimentoSemIR extends Investimento{


    public InvestimentoSemIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calculaLucro(int mes) {
        if(valorInicial > 1000){
            return ((valorInicial * Math.pow((1 + (jurosMensais /100)), mes)) - valorInicial);
        }else{
            System.out.println("O valor Inicial não pode ser menor que R$1000");
            return 0;
        }
    }
}
