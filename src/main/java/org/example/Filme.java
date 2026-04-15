package org.example;

public class Filme {
    private String nomeFilme;
    private int lotacaoAtual;
    private int lotacaoMaxima;
    private String categoriaFilme;
    private int salaSessao;
    private int horarioSessao;
    private double custo;

    //NOTA : Sala não é uma classe separada tendo em conta a complexidade do que nos foi pedido


    public Filme(String nomeFilme, int lotacaoAtual, String categoriaFilme, int salaSessao, int horarioSessao, double custo) {
        this.nomeFilme = nomeFilme;
        this.lotacaoAtual = lotacaoAtual;
        this.lotacaoMaxima = 100;
        this.categoriaFilme = categoriaFilme;
        this.salaSessao = salaSessao;
        this.horarioSessao = horarioSessao;
        this.custo = custo;
    }

    //Getteres de Filme

    public double getCusto() {
        return custo;
    }

    public int getHorarioSessao() {
        return horarioSessao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    //Setteres de Filme


    public void adicionarReserva(int lotacaoAtual) {

        if(lotacaoMaxima <= lotacaoAtual){
            return;
        }
            this.lotacaoAtual = lotacaoAtual+1;
    }
}

