/*
PUCPR - Escola Politécnica - Bacharelado em Ciência da Computação
Resolução de Problemas de Natureza Estruturada - Prof. Andrey Cabral Meira
Avaliação RA01 - Pilhas, Filas e Listas encadeadas
Equipe: Enzo Curcio Stival, Hiann Wonsowicz Padilha, Marcos Paulo Ruppel
 */

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\033\143");//limpar a tela do console
                System.out.print("""
                        ==================================================
                        Sistema de Gerenciamento de Atendimento ao Cliente
                        ==================================================
                        1 - Adicionar cliente a fila
                        2 - Atender proximo cliente da fila
                        3 - Adicionar solicitacao
                        4 - Atender proxima solicitacao
                        5 - Listar fila de clientes
                        6 - Listar pilha de solicitacoes
                        0 - Sair
                        --------------------------------------------------
                        Informe a opcao desejada:\s""");
                int opcao = teclado.nextInt();
                teclado.nextLine(); //Limpa o buffer do teclado
                switch (opcao) {
                    case 1:
                        System.out.print("\nInforme o id do cliente: ");
                        String idCliente = teclado.nextLine();
                        System.out.print("\nInforme o nome do cliente: ");
                        String nome = teclado.next();
                        System.out.print("\nInforme o motivo do atendimento: ");
                        String motivo = teclado.next();
                        fila.adicionar(new Cliente(idCliente, nome, motivo));
                        System.out.print("\nCliente adicionado com sucesso!");
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 2:
                        try {
                            Cliente cliente = fila.atenderPrimeiro();
                            System.out.print("\nCliente atendido: " + cliente.toString());
                        } catch (NullPointerException e) {
                            System.out.println("\nNao ha clientes na fila de atendimento!");
                        } finally {
                            System.out.print("\nPressione Enter para continuar...");
                            teclado.nextLine();
                        }
                        break;
                    case 3:
                        System.out.print("\nInforme o id do solicitacao: ");
                        String idSolicit = teclado.nextLine();
                        System.out.print("\nInforme a descricao do solicitacao: ");
                        String descricao = teclado.nextLine();
                        String dataSolicitacao = LocalDate.now().toString();
                        String horaSolicitacao = LocalTime.now().toString();
                        pilha.adicionar(new Solicitacao(idSolicit, descricao, dataSolicitacao, horaSolicitacao));
                        System.out.print("\nSolicitacao adicionada com sucesso!");
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 4:
                        try {
                            Solicitacao solicitacao = pilha.retirar();
                            System.out.print("\nSolicitacao retirada: " + solicitacao.toString());
                        } catch (NullPointerException e) {
                            System.out.println("\nNao ha solicitacoes para atender!");
                        } finally {
                            System.out.println("\nPressione Enter para continuar...");
                            teclado.nextLine();
                        }
                        break;
                    case 5:
                        fila.print();
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 6:
                        pilha.print();
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    default:
                        continuar = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Entrada invalida! Por favor, insira um número.");
                teclado.nextLine();  // Limpar buffer do teclado após erro
                System.out.println("\nPressione Enter para continuar...");
                teclado.nextLine();  // Aguarda Enter
            }
        }
    }
}
