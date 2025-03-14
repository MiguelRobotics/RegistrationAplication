package programming;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as entradas do usuário
        String name = "";
        int age = 0;
        char gender = ' ';
        double contact = 0;

        boolean running = true; // Variável para controlar o loop do menu

        while (running) {
            // Exibe o menu de opções
            System.out.println("=== Menu ===");
            System.out.println("1. Registrar dados");
            System.out.println("2. Mostrar dados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Registro de dados
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter your age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter your Gender (M/F): ");
                    gender = scanner.next().charAt(0);
                    System.out.print("Enter your Contact Number: ");
                    contact = scanner.nextDouble();
                    System.out.println("Dados registrados com sucesso!");
                    break;

                case 2:
                    // Mostrar dados registrados
                    if (name.isEmpty()) {
                        System.out.println("Nenhum dado registrado.");
                    } else {
                        System.out.println("=== Dados Registrados ===");
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Gender: " + gender);
                        System.out.println("Contact Number: " + contact);
                    }
                    break;

                case 3:
                    // Sair do programa
                    System.out.println("Saindo...");
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
