/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

public abstract class AluguelBasico extends Aluguel {

    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    public void exibirDetalhes() {
        System.out.println("Aluguel Basico / Cliente: " + getnomeCliente() + "Dias: " + getQuandidadeDias()
                + "Valor: " + getValorTotal() + "Status: " + getStatus()
                + "Seguro: " + possuiSeguroIncluso());
    }

    public boolean poussuiSeguroEspecial() {
        return false;
    }
}
