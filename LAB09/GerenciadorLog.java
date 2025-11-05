import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class GerenciadorLog {
    private static String destino = "console";
    private static String caminhoArquivo = "logs.txt";

    public static void configurarDestino(String novoDestino) {
        destino = novoDestino.toLowerCase();
    }

    private static void registrar(String nivel, String mensagem) {
        String log = "[" + LocalDateTime.now() + "] [" + nivel + "] " + mensagem;

        if (destino.equals("arquivo")) {
            try (FileWriter fw = new FileWriter(caminhoArquivo, true)) {
                fw.write(log + "\n");
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo de log: " + e.getMessage());
            }
        } else {
            System.out.println(log);
        }
    }

    public static void logInfo(String mensagem) {
        registrar("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        registrar("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        registrar("ERROR", mensagem);
    }

    public static void main(String[] args) {
        GerenciadorLog.logInfo("Aplicação iniciada.");
        GerenciadorLog.logWarn("Uso de memória alto detectado.");
        GerenciadorLog.logError("Erro ao conectar ao banco de dados.");

        GerenciadorLog.configurarDestino("arquivo");
        GerenciadorLog.logInfo("Mensagem gravada em arquivo.");
    }
}