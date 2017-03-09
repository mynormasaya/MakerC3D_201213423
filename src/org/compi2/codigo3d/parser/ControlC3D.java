package org.compi2.codigo3d.parser;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int lab = 0;
    private static Stack<String> verdaderas = new Stack<>();
    private static Stack<String> falsas = new Stack<>();
    
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        lab = 0;
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    
    public static String generaLabelVerdadero(){
        lab = lab+1;
        verdaderas.push("L"+lab);
        return "L"+lab;
        
    }
    
    public static String generarLabelfinal(){
        lab = lab+1;
        
        return "L"+lab;
        
    }
    
    public static String generaLabelFalso(){
        lab = lab+1;
        falsas.push("L"+lab);
        return "L"+lab;
    }
    
    public static String popFalso(){
        return falsas.pop();
    }
    
    public static String popVerdadero(){
        return verdaderas.pop();
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static boolean verificarStack(){
        if(verdaderas.empty() &&falsas.empty()){
            return true;
        }else   {
            return false;
        }
    }
    
    
    public static String DevolverTEFALSAS(){
        String ver="";
        
        while(!falsas.empty()){
            if(ver.equals("")){
                ver = ver + falsas.pop();
            }else{
                ver = ver +","+ falsas.pop();
            }
        }
        ver = ver+":";
        return ver;
    }
    
    public static String DevolverTEVERDADERAS(){
        String ver="";
        
        while(!verdaderas.empty()){
           if(ver.equals("")){
                ver = ver + verdaderas.pop();
            }else{
                ver = ver +","+ verdaderas.pop();
            }
        }
        ver = ver+":";
        return ver;
    }
    
    
    public static void IntercambioEtiquetas(){
        Queue<String> aux1 =new LinkedBlockingQueue<>();
        Queue<String> aux2 = new LinkedBlockingQueue<>();;
        
        while(!verdaderas.empty()){
            aux1.add(verdaderas.pop());
        }
        while(!falsas.empty()){
            aux2.add(falsas.pop());
        }
        
        while(aux1.size()>0){
            falsas.push(aux1.remove());
        }
        
        while(aux2.size()>0){
            verdaderas.push(aux2.remove());
        }
        
        
    }
    
    
}
