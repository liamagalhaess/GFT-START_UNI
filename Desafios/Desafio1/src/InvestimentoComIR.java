public class InvestimentoComIR extends Investimento{


    public InvestimentoComIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calculaLucro(int mes) {
        if(mes < 6) {
            return ((valorInicial * Math.pow((1 + (jurosMensais /100)), mes)) - valorInicial) * 0.775;
        }else if(mes >= 6 && mes < 12){
            return ((valorInicial * Math.pow((1 + (jurosMensais /100)), mes)) - valorInicial) * 0.8;
        }else if( mes >= 12 && mes <24){
            return ((valorInicial * Math.pow((1 + (jurosMensais /100)), mes)) - valorInicial) * 0.825;
        }else if(mes >= 24){
            return ((valorInicial * Math.pow((1 + (jurosMensais /100)), mes)) - valorInicial) * 0.85;
        }else{
            return 0;
        }

    }
}
