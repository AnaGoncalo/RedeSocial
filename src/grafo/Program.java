/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Ana Gonçalo
 */
public class Program {
    
    public static void main(String args[]) {
        Grafo grafo = new Grafo();
        
        grafo.inserirVertice("v1");
        grafo.inserirVertice("v2");
        grafo.inserirVertice("v3");
        grafo.inserirVertice("v4");
        
        grafo.inserirAresta("v1", "v2", "v12");
        grafo.inserirAresta("v2", "v4", "v24");
        grafo.inserirAresta("v3", "v1", "v31");
        grafo.inserirAresta("v4", "v3", "v43");
        
        grafo.MatrizAdjacencia();
        
        /*
        for(Vertice a: grafo.getVertices())
        {
            System.out.println(a.getValor());
        }
        */
    }
}
