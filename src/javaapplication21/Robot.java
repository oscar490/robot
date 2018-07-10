/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author Oscar
 */
public class Robot {
    
    //  Atributos
    private static int contador;
    private String     alias;
    private int        identificador;
    private char       generacion;
    private char       orientacion;
    
    public Robot(String alias, char generacion)
    {
        setAlias(alias);
        setGeneracion(generacion);
        setIdentificador(++contador);
    }
    
    //  Mutadores
    private void setAlias(String alias)
    {
        if (alias.isEmpty()) {
            throw new NullPointerException("No se permite un alias vacio");
        }
        
        this.alias = alias;
    }
    
    private void setGeneracion(char generacion)
    {
        char[] generaciones = {'A', 'B', 'M', 'Z'};
        
        if (generacion != 'A' && generacion != 'B' && generacion != 'M' && generacion != 'Z') {
            throw new IllegalArgumentException("Generacion equivocada");
        }
        
        this.generacion = generacion;
    }
    
    private void setIdentificador(int identificador)
    {
        this.identificador = identificador;
    }
    
    public String toString()
    {
        return this.identificador + " " + this.alias;
    }
}
