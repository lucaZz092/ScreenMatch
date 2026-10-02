import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //INSTANCIANDO O OBJETO SERIES **lost**
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        //INSTANCIANDO OBJETO **O Mentalista**
        Serie oMentalista = new Serie();
        oMentalista.setNome("O Mentalista");
        oMentalista.setAnoDeLancamento(2010);
        oMentalista.exibeFichaTecnica();
        oMentalista.setTemporadas(14);
        oMentalista.setEpisodiosPorTemporada(12);
        oMentalista.setMinutosPorEpisodio(46);
        oMentalista.setAtiva(true);


        //INSTANCIANDO O OBJETO **episodio**
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(10);

        //INSTANCIANDO O OBJETO FILMES **filme1**
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());

        //INSTANCIANDO O OBJETO **filme2**
        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        //INSTANCIANDO O OBJETO **filme3**
        var filme3 = new Filme();
        filme3.setNome("Dogville");
        filme3.setDuracaoEmMinutos(200);
        filme3.setAnoDeLancamento(2003);
        filme3.avalia(10);


        //INSTANCIANDO O OBJETO **calculadora**
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        //INSTANCIANDO O OBJETO **filtro**
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(lost);



    }
}
