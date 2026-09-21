public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto carro:
        Carro carro = new Carro();
        // Acessando os métodos a partir do objeto carro:
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();

        // Acessando os atributos diretamente:
        System.out.println(carro.motor);
        System.out.println(carro.volante);
        System.out.println(carro.airbag);
    }
}