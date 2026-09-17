public class Casa {
    // Atributo:
    boolean inteligente;

    // Construtor com parâmetro:
    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }


    void acenderLuz() {
        if (inteligente)
            System.out.println("Comando de voz");
        else
            System.out.println("Pressionar interruptor");
    }
}


















































