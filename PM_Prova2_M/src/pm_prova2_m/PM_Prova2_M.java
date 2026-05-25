/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pm_prova2_m;

public class PM_Prova2_M {

    public static void main(String[] args) {
        SistemaAluguel sistema = criarDadosIniciais();

        sistema.avaliarVeiculo("ABC1D23", 9);
        sistema.avaliarVeiculo("IJK7L89", 8);
        sistema.avaliarAluguel("Yasmin", 10);

        sistema.associarVeiculoAAluguel("ABC1D23", "Luiz");
        sistema.associarVeiculoAAluguel("IJK7L89", "Yasmin");

        System.out.println("VEICULOS CADASTRADOS");
        sistema.exibirVeiculos();

        System.out.println("\nALUGUEIS CADASTRADOS");
        sistema.exibirAlugueis();

        System.out.println("\nVEICULOS DISPONIVEIS");
        sistema.exibirVeiculosDisponiveis();

        sistema.inspecionarVeiculo("EFG4H56");
        sistema.removerVeiculosEmManutencao();

        System.out.println("\nVEICULOS APOS REMOVER MANUTENCAO");
        sistema.exibirVeiculos();
    }

    public static SistemaAluguel criarDadosIniciais() {
        SistemaAluguel sistema = new SistemaAluguel();

        sistema.cadastrarVeiculo(new Carro("ABC1D23", "Nivus", 2022, 140, 32000, StatusVeiculo.DISPONIVEL, 5));
        sistema.cadastrarVeiculo(new Moto("EFG4H56", "Corola", 2021, 90, 18000, StatusVeiculo.DISPONIVEL, 200));
        sistema.cadastrarVeiculo(new Van("IJK7L89", "Ranger", 2020, 280, 45000, StatusVeiculo.DISPONIVEL, 35));

        sistema.cadastrarAluguel(new AluguelBasico("Luiz", 3, 420, StatusAluguel.ATIVO));
        sistema.cadastrarAluguel(new AluguelExecutivo("Yasmin", 5, 1400, StatusAluguel.ATIVO));

        return sistema;
    }
}
