public class ConversorMoeda {
    private static double taxaDolar = 5.20;
    private static double taxaEuro = 5.70;

    public static void atualizarTaxas(double novaTaxaDolar, double novaTaxaEuro) {
        taxaDolar = novaTaxaDolar;
        taxaEuro = novaTaxaEuro;
        System.out.println("Taxas atualizadas: Dólar=" + taxaDolar + ", Euro=" + taxaEuro);
    }

    public static double realParaDolar(double valor) {
        return valor / taxaDolar;
    }

    public static double dolarParaReal(double valor) {
        return valor * taxaDolar;
    }

    public static double realParaEuro(double valor) {
        return valor / taxaEuro;
    }

    public static double euroParaReal(double valor) {
        return valor * taxaEuro;
    }

    public static void main(String[] args) {
        double reais = 520;
        System.out.println("R$" + reais + " = $" + ConversorMoeda.realParaDolar(reais) + " dólares");

        double euros = 100;
        System.out.println(euros + " euros = R$" + ConversorMoeda.euroParaReal(euros));

        ConversorMoeda.atualizarTaxas(5.10, 5.60);
        System.out.println("R$" + reais + " = $" + ConversorMoeda.realParaDolar(reais) + " dólares (nova taxa)");
    }
}