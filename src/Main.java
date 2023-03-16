import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListadeContatos lista = new ListadeContatos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nadicionar - Adiciona um contato\n" +
                "remover - Remove um contato\n" +
                "buscar - Busca um contato\n" +
                "listar - Lista todos os contatos\n" +
                "sair - Encerra o programa\n" +
                "\nDigite o comando: ");
        args = scanner.nextLine().split(" ");

        while (!args[0].equals("sair")) {
            switch (args[0]) {
                case "adicionar":
                    lista.criarContato();
                    break;
                case "remover":
                    lista.removerContato();
                    break;
                case "buscar":
                    System.out.println(lista.buscarContato());
                    break;
                case "listar":
                    lista.listarContatos();
                    break;
                default:
                    System.out.println("Comando inválido");
            }
            System.out.println("\nadicionar - Adiciona um contato\n" +
                    "remover - Remove um contato\n" +
                    "buscar - Busca um contato\n" +
                    "listar - Lista todos os contatos\n" +
                    "sair - Encerra o programa\n" +
                    "\nDigite o comando: ");
            args = scanner.nextLine().split(" ");
        }

    }
}