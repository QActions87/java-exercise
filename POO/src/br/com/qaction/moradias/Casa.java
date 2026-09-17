package br.com.qaction.moradias;

public class Casa {
    // Atributos:
    String nome;
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


















































