/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaAluguel {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<Aluguel> alugueis = new ArrayList<>();
    private HashMap<Aluguel, ArrayList<Veiculo>> veiculosPorAluguel = new HashMap<>();

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void cadastrarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
        veiculosPorAluguel.put(aluguel, new ArrayList<>());
    }

    public void associarVeiculoAAluguel(String placa, String nomeCliente) {
        Veiculo veiculo = buscarVeiculo(placa);
        Aluguel aluguel = buscarAluguel(nomeCliente);

        if (veiculo != null && aluguel != null && veiculo.getStatus() == StatusVeiculo.DISPONIVEL) {
            veiculosPorAluguel.get(aluguel).add(veiculo);
            veiculo.setStatus(StatusVeiculo.ALUGADO);
        }
    }

    public void exibirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }

    public void exibirAlugueis() {
        for (Aluguel aluguel : alugueis) {
            aluguel.exibirDetalhes();
            for (Veiculo veiculo : veiculosPorAluguel.get(aluguel)) {
                System.out.print(" ");
                veiculo.exibirDetalhes();
            }
        }
    }

    public void exibirVeiculosDisponiveis() {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getStatus() == StatusVeiculo.DISPONIVEL) {
                veiculo.exibirDetalhes();
            }
        }
    }

    public void avaliarVeiculo(String placa, int nota) {
        Veiculo veiculo = buscarVeiculo(placa);
        if (veiculo instanceof Avaliavel) {
            ((Avaliavel) veiculo).avaliar(nota);
        }
    }

    public void avaliarAluguel(String nomeCliente, int nota) {
        Aluguel aluguel = buscarAluguel(nomeCliente);
        if (aluguel instanceof Avaliavel) {
            ((Avaliavel) aluguel).avaliar(nota);
        }
    }

    public void inspecionarVeiculo(String placa) {
        Veiculo veiculo = buscarVeiculo(placa);
        if (veiculo instanceof Inspecionavel) {
            ((Inspecionavel) veiculo).realizarInspecao();
        }
    }

    public void removerVeiculosEmManutencao() {
        veiculos.removeIf(veiculo -> veiculo.getStatus() == StatusVeiculo.MANUTENCAO);
        for (ArrayList<Veiculo> lista : veiculosPorAluguel.values()) {
            lista.removeIf(veiculo -> veiculo.getStatus() == StatusVeiculo.MANUTENCAO);
        }
    }

    private Veiculo buscarVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    private Aluguel buscarAluguel(String nomeCliente) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                return aluguel;
            }
        }
        return null;
    }
}
