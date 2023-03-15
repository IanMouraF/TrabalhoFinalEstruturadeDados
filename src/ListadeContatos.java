import java.util.HashMap;
import java.util.Scanner;

public class ListadeContatos {

    Scanner scanner = new Scanner(System.in);
    private HashMap<String, ContatoCelular> contatos;

    public ListadeContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(ContatoCelular contato) {
        this.contatos.put(contato.getNome(), contato);
    }

    public void criarContato() {

        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do contato: ");
        String email = scanner.nextLine();

        System.out.println("Digite a data de nascimento do contato: ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o celular do contato: ");
        String celular = scanner.nextLine();

        ContatoCelular contato = new ContatoCelular(nome, telefone, email, dataNascimento, celular);
        this.adicionarContato(contato);
    }

    public void removerContato() {
        if (this.contatos.isEmpty()) {
            System.out.println("Não há contatos na lista\n");
        } else
            System.out.println("Digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        if (this.contatos.containsKey(nome)) {
            this.contatos.remove(nome);
        } else {
            System.out.println("Contato não encontrado\n");
        }
        this.contatos.remove(nome);
    }

    public ContatoCelular buscarContato() {
        System.out.println("Digite o nome do contato que deseja buscar: ");
        String nome = scanner.nextLine();

        if (this.contatos.containsKey(nome)) {
            return this.contatos.get(nome);
        } else {
            System.out.println("Contato não encontrado\n");
            return null;
        }
    }

    public void listarContatos() {
        if (this.contatos.isEmpty()) {
            System.out.println("Não há contatos na lista\n");
        } else {
            for (String nome : this.contatos.keySet()) {
                System.out.println("-----------------------------");
                System.out.println(this.contatos.get(nome));

            }
            System.out.println("-----------------------------\n");
        }

    }
}
