/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

public abstract class Van extends Veiculo implements Avaliavel, Inspecionavel {

    private int quantidadeMaximaPassageiros;
    private int nota;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,
            double quilometragem, StatusVeiculo status, int quantidadeMaximaPassageiros) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    public void avaliar(int nota) {
        this.nota = nota;
    }

    public void realizarInspecao() {
        setStatus(StatusVeiculo.MANUTENCAO);
    }

    public void exibirDetalhes() {
        System.out.println("Carro / Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAnoFabricacao()
                + "Diaria: " + getValorDiaria() + "Km: " + getQuilometragem() + "Status: " + getStatus()
                + "Passageiros: " + quantidadeMaximaPassageiros + "Nota: " + nota);
    }

    public boolean poussuiSeguroEspecial() {
        return false;
    }
}