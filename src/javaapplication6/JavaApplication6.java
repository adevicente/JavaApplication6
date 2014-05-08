/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;


import java.io.IOException;


/**
 *
 * @author alex
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Graph grafo = new Graph(100);
        grafo.addEdge(1, 60);
        grafo.addEdge(1, 50);
        System.out.println(grafo.toString());
        // TODO code application logic here
    }

}
