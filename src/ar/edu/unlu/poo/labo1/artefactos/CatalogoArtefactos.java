package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    Set<Artefacto> catalogo = new HashSet<>();
    Map<String, Integer> cantArtefactosPorTipo = new HashMap<>();
    List<Artefacto> artefactosPorTipo = new ArrayList<>();

    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        /*for(Artefacto artefacto : catalogo){
            if (!equals((Object)artefacto)){
                catalogo.add(artefacto);}
        }*/
        return catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {

        for (Artefacto artefacto : catalogo) {
            if (artefacto.getTipo().equals(tipo)) {
                artefactosPorTipo.add(artefacto);
            }
        }
        artefactosPorTipo.sort((artefacto1, artefacto2) -> Integer.compare(artefacto2.getPoder(), artefacto1.getPoder()));
        return artefactosPorTipo;
    }


    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> map = new HashMap<>();
        int conteo;
        for (Artefacto artefacto : catalogo) {
            String tipo = artefacto.getTipo();
            conteo = map.getOrDefault(tipo, 0);
            map.put(tipo, conteo + 1);
        }
        return map;
    }

        Artefacto obtenerArtefactoMasPoderoso () {
            if (catalogo.isEmpty()) {
                return null;
            }

            Artefacto artefactoMasPoderoso = new Artefacto(null, 0, null);
            for (Artefacto artefacto : catalogo) {
                if (artefacto.getPoder() > artefactoMasPoderoso.getPoder()) {
                    artefactoMasPoderoso = artefacto;
                }
            }
            return artefactoMasPoderoso;
        }
    }

