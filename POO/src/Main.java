public class Main {
    public static void main(String[] args) {
        // Instâncias criadas com o construtor com parâmetro:
        Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        // Instância criada com o construtor padrão:
        Casa casa3 = new Casa();

        // Modificando o atributo a partir dos objetos criados com o
        // construtor padrão:
        // casa1.inteligente = false;
        // casa2.inteligente = true;

        casa1.acenderLuz();
        casa2.acenderLuz();
        casa3.inteligente = false;
    }
}

















