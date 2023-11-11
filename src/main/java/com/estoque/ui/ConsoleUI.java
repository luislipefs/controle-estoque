package com.estoque.ui;

import com.estoque.controller.EstoqueController;

import java.util.Scanner;

public class ConsoleUI {
    private EstoqueController estoqueController;
    private Scanner scanner;

    public ConsoleUI(EstoqueController estoqueController) {
        this.estoqueController = estoqueController;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    estoqueController.adicionarProduto();
                    break;
                case 2:
                    estoqueController.removerProduto();
                    break;
                case 3:
                    estoqueController.exibirProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void exibirMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Remover Produto");
        System.out.println("3. Listar Produtos");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }
}
