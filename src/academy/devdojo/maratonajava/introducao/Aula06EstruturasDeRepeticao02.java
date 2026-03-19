package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int n = 0;
        for(n = 0; n <= 1000000; n++){
            if(n % 2 == 0){
            System.out.println(n);
            }
        }
    }
}
