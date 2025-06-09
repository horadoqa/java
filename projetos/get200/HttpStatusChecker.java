package get200;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java HttpStatusChecker <URL>");
            return;
        }

        String urlString = args[0];

        try {
            URL url = new URL(urlString);

            for (int i = 1; i <= 1000; i++) {
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                conexao.connect();

                int statusCode = conexao.getResponseCode();
                System.out.println("Requisição " + i + " - Status code: " + statusCode);

                conexao.disconnect();
            }

        } catch (IOException e) {
            System.out.println("Erro ao acessar a URL: " + e.getMessage());
        }
    }
}
