package br.unifor.univideo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.unifor.model.Filme;

@RestController
@RequestMapping("/filmes")
public class LocadoraController {
    private ArrayList<Filme> filmes = new ArrayList<>();
    public LocadoraController(){
        filmes.add(new Filme(1, "Thunderbolts", "Ação", "Longo, Marvel né..."));
        filmes.add(new Filme(2, "Moana 2", "Aventura", "Média, Disney..."));
        filmes.add(new Filme(3, "Forrest Gump", "Drama", "2hs"));
    }

    @GetMapping
    public String listarFilmes() {
        String lista = "";
        for (int i = 0; i < filmes.size(); i++)
            lista = lista + "\n"+filmes.get(i).getNome()+" ("+filmes.get(i).getId()+")";
        return lista;
    }

    @GetMapping("/{id}")
    public Filme pegarDetalhes(@PathVariable int id) {
        return filmes.get(id);
    }

    @PostMapping
    public void cadastrarFilme(@RequestBody Filme filme) {
        filmes.add(filme);
    }

    @DeleteMapping("/{id}")
    public void deletarFilme(@PathVariable int id) {
        filmes.remove(id);
    }
}