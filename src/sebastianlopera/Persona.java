/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebastianlopera;

/**
 *
 * @author sena
 */
public class Persona {
    private int edad;
    private String nombre;
    private String id; 
    private String tipoDocumento;
    
    public void setEdad (int edadParametro){
            this.edad = edadParametro;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre (String nombreParametro){
            this.nombre = nombreParametro;
    }
    public String getNombre(){
        return this.nombre;
    }
       public void setId (String idParametro){
            this.id = idParametro;
    }
    public String getId(){
        return this.id;
    }
        public void setTipoDocumento (String tipoDocumentoParametro){
            this.tipoDocumento = tipoDocumentoParametro;
    }
    public String getTipoDocumento(){
        return this.tipoDocumento;
    }
    public void andar(){}
    public void comer(){}
}
