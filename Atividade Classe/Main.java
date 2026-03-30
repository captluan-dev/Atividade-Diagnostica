import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do contato " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o telefone do contato " + (i + 1) + ":");
            String telefone = scanner.nextLine();

            contatos[i] = new Contato(nome, telefone);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDeseja alterar o contato " + (i + 1) + "? (s/n)");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.println("Novo nome:");
                contatos[i].setNome(scanner.nextLine());

                System.out.println("Novo telefone:");
                contatos[i].setTelefone(scanner.nextLine());
            }
        }

        System.out.println("\nLista de contatos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println("Nome: " + contatos[i].getNome());
            System.out.println("Telefone: " + contatos[i].getTelefone());
            System.out.println("---------------------");
        }

        scanner.close();
    }
}