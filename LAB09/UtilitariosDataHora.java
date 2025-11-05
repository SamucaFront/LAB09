import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UtilitariosDataHora {
    public static String formatarData(LocalDate data, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatter);
    }

    public static long diferencaEmDias(LocalDate data1, LocalDate data2) {
        return Math.abs(Period.between(data1, data2).getDays());
    }

    public static boolean isAnoBissexto(int ano) {
        return LocalDate.of(ano, 1, 1).isLeapYear();
    }

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2000, 1, 1);

        System.out.println("Data formatada (dd/MM/yyyy): " + formatarData(hoje, "dd/MM/yyyy"));
        System.out.println("Diferença em dias: " + diferencaEmDias(aniversario, hoje));
        System.out.println("Ano 2024 é bissexto? " + isAnoBissexto(2024));
    }
}