/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

public abstract class Carro extends Veiculo implements Avaliavel {

    private int quantidadePortas;
    private int nota;

    public Carro(String placa, String modelo, int anoFabricacao,
            double valorDiaria, double quilometragem, int quantidadePortas) {

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadePortas = quantidadePortas;
    }

    public void avaliar(int nota) {
        this.nota = nota;
    }

    public void exibirDetalhes() {
        System.out.println("Carro / Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAnoFabricacao()
                + "Diaria: " + getValorDiaria() + "Km: " + getQuilometragem() + "Status: " + getStatus()
                + "Portas: " + quantidadePortas + "Nota: " + nota);
    }

    public boolean poussuiSeguroEspecial() {
        return false;
    }
}
