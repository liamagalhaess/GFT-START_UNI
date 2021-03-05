public class Main {

    public void Main(String args[]){

        InvestimentoComIR ir = new InvestimentoComIR(5000, 1.2);
        InvestimentoSemIR sir = new InvestimentoSemIR(3000, 0.7);

        Double valorIr = ir.calculaLucro(17);
        Double valorSir = sir.calculaLucro(10);

        System.out.println("============ Investimentos ===========");
        System.out.println("Investimento com IR: ");
        System.out.println("Valor inicial: " + ir.getValorInicial() + "Juros Mensais: " + ir.getJurosMensais() + "Total: " + valorIr);
        System.out.println("Investimento sem IR: ");
        System.out.println("Valor inicial: " + sir.getValorInicial() + "Juros Mensais: " + sir.getJurosMensais() + "Total: " + valorSir);

    }

}
