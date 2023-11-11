package com.estoque.controller;

import com.estoque.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueController {
    private List<Produto> produtos;
    private Scanner scanner;

    public EstoqueController() {
        this.produtos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        double preco = 0.0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.print("Digite o preço do produto: ");
                preco = scanner.nextDouble();
                inputValido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um preço válido.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        Produto novoProduto = new Produto(nome, preco);
        produtos.add(novoProduto);

        System.out.println("Produto adicionado com sucesso!");
    }



    public void removerProduto() {
        System.out.print("Digite o nome do produto a ser removido: ");
        String nome = scanner.nextLine().toLowerCase();

        Produto produtoRemover = null;

        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().equals(nome)) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }


    public List<Produto> listarProdutos() {
        return produtos;
    }

    public void exibirProdutos() {
        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
