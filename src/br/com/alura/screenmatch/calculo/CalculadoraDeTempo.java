package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal = tempoTotal + f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal = tempoTotal + s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo.getNome());
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
