package com.joao.music_api.principal;

import com.joao.music_api.model.Artista;
import com.joao.music_api.model.Sexo;
import com.joao.music_api.repository.ArtistaRepository;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    private ArtistaRepository artistaRepository;

    public Principal(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    private Scanner leitura = new Scanner(System.in);

    public void exibirMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                    
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastroArtista();
                    break;
//                case 2:
//                    cadastroMusica();
//                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao nao aceita");
            }

        }
    }

    private int idade(int anoNascimento) {
        return LocalDate.now().getYear() - anoNascimento;
    }

    private void cadastroArtista() {
        System.out.println("Digite o nome do artista");
        var nomeArtistico = leitura.nextLine();
        System.out.println("Digite o nome real do artista");
        var nome = leitura.nextLine();
        System.out.println("Digite o ano de nascimento");
        var anoNascimento = leitura.nextInt();
        var idade = idade(anoNascimento);
        leitura.nextLine();
        System.out.println("Digite o sexo");
        var sexo = leitura.nextLine();
        Sexo sexoCovertido =  Sexo.fromStrig(sexo);
        Artista artista = new Artista(nomeArtistico,nome, anoNascimento, sexoCovertido);
        System.out.printf("Nome do artista: %s, Nome real: %s, Idade: %s, Sexo: %s \n",
                artista.getNomeArtistico(), artista.getNome(), idade,
                artista.getSexo());
    }

}
