/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

public abstract class Moto extends Veiculo implements Inspecionavel {

    private int cilindrada;

    public Moto(String placa, String modelo, int anoFabricacao,
            double valorDiaria, double quilometragem, StatusVeiculo status, int cilindrada) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
    }

    public void realizarInspecao() {
        setStatus(StatusVeiculo.MANUTENCAO);
    }

    public void exibirDetalhes() {
        System.out.println("Carro / Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAnoFabricacao()
                + "Diaria: " + getValorDiaria() + "Km: " + getQuilometragem() + "Status: " + getStatus()
                + "Cilindrada: " + cilindrada);
    }

    public boolean poussuiSeguroEspecial() {
        return false;
    }
}
