public class Casa {
    // Atributo:
    boolean inteligente;
    // Construtor padrão (sem parâmetro):
    public Casa() {
    }

    // Construtor com parâmetro:
    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    // Metodo:
    void acenderLuz() {
        if (inteligente)
            System.out.println("Comando de voz");
        else
            System.out.println("Pressionar interruptor");
    }
}


















































