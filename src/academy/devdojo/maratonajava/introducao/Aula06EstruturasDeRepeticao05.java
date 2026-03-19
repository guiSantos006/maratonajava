package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        int quantParcela;
        for(quantParcela = (int) valorCarro; quantParcela >= 1; quantParcela--){
            valorParcela = valorCarro/quantParcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Valor da Parcela: "+valorParcela+" Quantidade de Parcelas: "+quantParcela);
        }
    }
}
