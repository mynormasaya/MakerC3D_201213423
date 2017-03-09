  package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private boolean ver;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.ver = false;
    }
    public NodoC3D(String cad,boolean ver) {
        this.cad = cad;
        this.ver = ver;
    }
    
    public String getCad(){
        return cad;
    }
    
    public boolean getver(){
        return ver;
    }
    
    public void setver(boolean ver){
        this.ver = ver;
    }
        
}
