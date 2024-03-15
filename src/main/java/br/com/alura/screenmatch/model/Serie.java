package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria genero;
    private String sinopse;
    private String atores;
    private String poster;
}
