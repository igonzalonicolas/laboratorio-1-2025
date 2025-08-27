package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {


    Set<Artefacto> catalogo = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }

    Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }

    List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactosPorTipo = new ArrayList<>();
        for(Artefacto artefacto : catalogo){
            if(artefacto.getTipo().equals(tipo)){
                artefactosPorTipo.add(artefacto);
            }
        }
        artefactosPorTipo.sort((artefacto1, artefacto2)-> Integer.compare( artefacto2.getPoder(), artefacto1.getPoder()));

        return artefactosPorTipo;

    }
    /*Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> map = new HashMap<>();
        for(Artefacto artefacto : catalogo){

        }
    }*/
}
