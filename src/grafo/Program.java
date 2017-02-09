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
        BFS redeSocial = new BFS();
        
        redeSocial.inserirVertice("v1");
        redeSocial.inserirVertice("v2");
        redeSocial.inserirVertice("v3");
        redeSocial.inserirVertice("v4");
        redeSocial.inserirVertice("v5");
        redeSocial.inserirVertice("v6");
        
        redeSocial.inserirAresta("v1", "v2", "1");
        redeSocial.inserirAresta("v1", "v4", "-1");
        redeSocial.inserirAresta("v2", "v3", "1");
        redeSocial.inserirAresta("v4", "v5", "1");
        redeSocial.inserirAresta("v4", "v6", "1");
        redeSocial.inserirAresta("v5", "v6", "1");
        
        
        //redeSocial.MatrizAdjacencia();
        //redeSocial.MatrizCusto();
        
        redeSocial.sugestoes(redeSocial.findVertice("v1"));
        
        /*
        for(Vertice a: grafo.getVertices())
        {
            System.out.println(a.getValor());
        }
        */
    }
}
