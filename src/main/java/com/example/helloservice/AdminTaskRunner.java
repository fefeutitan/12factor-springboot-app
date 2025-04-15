package com.example.helloservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminTaskRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0 && args[0].equals("run-admin-task")) {
            System.out.println("Executando tarefa administrativa one-off...");
            // Simula uma migração, limpeza ou carga
        }
    }
}
