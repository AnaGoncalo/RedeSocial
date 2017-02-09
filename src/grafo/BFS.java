/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Ana Gonçalo
 */
public class BFS extends Grafo {
    
    //Incrementando as sugestoes
    public List<Vertice> sugestoes(Vertice vert){
        List<Vertice> sugestoes = new ArrayList();
        
        List<Vertice> fila = new ArrayList();
        int pos = 0;
        fila.add(vert);
        
        for(Vertice x : this.getVertices()){
            x.setVisitado(0);
        }
        
        while(!fila.isEmpty())
        {
            Vertice v = fila.get(0);
            //pos++;
            for(Vertice w : adjascentes(v))
            {
                if(w.getVisitado() == 0){
                    fila.add(w);
                    w.setDist(v.getDist()+1);
                    w.setVisitado(-1);
                    System.out.println("->" + w.getNome() + " " + w.getDist());
                }
            }
            v.setVisitado(1);
            fila.remove(v);
            //System.out.println("fila size" + fila.size());
        }
        
        
        
        return sugestoes;
    }
    
    
}
