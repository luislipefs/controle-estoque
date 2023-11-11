package com.estoque;

import com.estoque.controller.EstoqueController;
import com.estoque.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        EstoqueController estoqueController = new EstoqueController();
        ConsoleUI consoleUI = new ConsoleUI(estoqueController);
        consoleUI.iniciar();
    }
}
