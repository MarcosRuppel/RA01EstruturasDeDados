/**
 * Programa que simula um sistema de gerenciamento de atendimento ao cliente, implementando
 * estruturas de dados do tipo pilha e fila. Parte do RA01 da disciplina de Resolução de Problemas Estruturados
 * em Computação.
 * @version 2.0(REV3)
 * @author Enzo Curcio Stival, Hiann Wonsowicz Padilha, Marcos Paulo Ruppel
 * @since 2024-09-13
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;

public class Main {
    /**
     * Apresenta um menu de opções selecionáveis das funcionalidades de interação do sistema.
     * @param f Fila a ser manipulada pelo programa.
     * @param p Pilha a ser manipulada pelo programa
     */
    public static void menuInicial(Fila f, Pilha p) {
        Scanner teclado = new Scanner(System.in);
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
                        String nome = teclado.nextLine();
                        System.out.print("\nInforme o motivo do atendimento: ");
                        String motivo = teclado.nextLine();
                        f.adicionar(new Cliente(idCliente, nome, motivo));
                        System.out.print("\nCliente adicionado com sucesso!");
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 2:
                        try {
                            Cliente cliente = f.atenderPrimeiro();
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
                        String dataSolicitacao = LocalDateTime.now().toString();
                        p.adicionar(new Solicitacao(idSolicit, descricao, dataSolicitacao));
                        System.out.print("\nSolicitacao adicionada com sucesso!");
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 4:
                        try {
                            Solicitacao solicitacao = p.retirar();
                            System.out.print("\nSolicitacao retirada: " + solicitacao.toString());
                        } catch (NullPointerException e) {
                            System.out.println("\nNao ha solicitacoes para atender!");
                        } finally {
                            System.out.println("\nPressione Enter para continuar...");
                            teclado.nextLine();
                        }
                        break;
                    case 5:
                        f.print();
                        System.out.println("\nPressione Enter para continuar...");
                        teclado.nextLine();
                        break;
                    case 6:
                        p.print();
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

    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Solicitacao[] historico = {
                new Solicitacao("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Solicitacao("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Solicitacao("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Solicitacao("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Solicitacao("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Solicitacao("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Solicitacao("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Solicitacao("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Solicitacao("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Solicitacao("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };
        Cliente[] filadeatendimento = {
                new Cliente("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Cliente("CLI002", "João Souza", "Reclamação de serviço"),
                new Cliente("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Cliente("CLI004", "Pedro Alves", "Informações de entrega"),
                new Cliente("CLI005", "Carla Dias", "Agendamento de visita"),
                new Cliente("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Cliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Cliente("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Cliente("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Cliente("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };
        for (Solicitacao solicitacao : historico) {
            pilha.adicionar(solicitacao);
        }
        for (Cliente cliente : filadeatendimento) {
            fila.adicionar(cliente);
        }
        menuInicial(fila, pilha);
    }
}
