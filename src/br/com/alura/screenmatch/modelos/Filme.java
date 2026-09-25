package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    //ATRIBUTOS
    private String diretor;

    //GETTERS E SETTERS
    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    //SOBRESCRIÇÃO DA CLASSE
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
