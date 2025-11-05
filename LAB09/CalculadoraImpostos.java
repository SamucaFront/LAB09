public class CalculadoraImpostos {
    private static final double ALIQUOTA_IRRF = 0.15;
    private static final double ALIQUOTA_ICMS = 0.18;
    private static final double ALIQUOTA_ISS  = 0.05;

    public static double calcularIRRF(double valorBase) {
        return valorBase * ALIQUOTA_IRRF;
    }

    public static double calcularICMS(double valorBase) {
        return valorBase * ALIQUOTA_ICMS;
    }

    public static double calcularISS(double valorBase) {
        return valorBase * ALIQUOTA_ISS;
    }

    public static void main(String[] args) {
        double valor = 1000;

        System.out.println("Valor base: R$" + valor);
        System.out.println("IRRF: R$" + calcularIRRF(valor));
        System.out.println("ICMS: R$" + calcularICMS(valor));
        System.out.println("ISS: R$" + calcularISS(valor));
    }
}