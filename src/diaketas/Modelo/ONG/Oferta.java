/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Modelo.ONG;

import com.mysql.jdbc.Statement;
import diaketas.ConexionBD;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class Oferta {
    
    
    /**
     * Codigo asociado a la oferta
     */
    private int cod_oferta;
    
    /**
     * Tipo de oferta
     */
    private String concepto;
    
    /**
     * Fecha en que se emitio la oferta
     */
    private Date fecha;

    /**
     * Indica si la oferta sigue en pie o no
     */
    private int activo;
    
    /**
     * Lugar en el que se ofrece el puesto de trabajo
     */
    private String poblacion;
    
    /**
     * Total de vacantes disponibles para una oferta
     */
    private int numero_vacantes;
    
    /**
     * Breve resumen de los aspectos principales de la oferta
     */
    private String descripcion;
    
    /**
     * Estudios o experiencia laboral mínimos requeridos
     */
    private String requisitos_minimos;
    
    /**
     * Especifica la clase de contrato ofrecido
     */
    private String tipo_contrato;
    
    /**
     * Número de horas diarias de trabajo del puesto ofrecido
     */
    private int jornada_laboral;
    
    /**
     * Cantidad a cobrar (mensual) por el puesto ofrecido
     */
    private Double salario;
    
    /**
     * Notas adicionales sobre la oferta
     */
    private String observaciones;
    
    
    
    /**
     * DNI del donante que ha facilitado la oferta
     */
    private String NIF_CIF_Donante;
    
    
    // ------------------------------ CONSULTORES ----------------------------------- //

    public String obtenerNIFCIFDonante() {
        return NIF_CIF_Donante;
    }

    public int obtenerActivo() {
        return activo;
    }

    public int obtenerCodOferta() {
        return cod_oferta;
    }

    public String obtenerConcepto() {
        return concepto;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public Date obtenerFecha() {
        return fecha;
    }

    public int obtenerJornadaLaboral() {
        return jornada_laboral;
    }

    public int obtenerNumeroVacantes() {
        return numero_vacantes;
    }

    public String obtenerObservaciones() {
        return observaciones;
    }

    public String obtenerPoblacion() {
        return poblacion;
    }

    public String obtenerRequisitosMinimos() {
        return requisitos_minimos;
    }

    public Double obtenerSalario() {
        return salario;
    }

    public String obtenerTipoContrato() {
        return tipo_contrato;
    }
    
    // ------------------------------ MODIFICADORES --------------------------------- //
    

    public void modificarNIFCIFDonante(String NIF_CIF_Donante) {
        this.NIF_CIF_Donante = NIF_CIF_Donante;
    }

    public void modificarActivo(int activo) {
        this.activo = activo;
    }

    public void modificarCodOferta(int cod_oferta) {
        this.cod_oferta = cod_oferta;
    }

    public void modificarConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void modificarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void modificarFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void modificarJornadaLaboral(int jornada_laboral) {
        this.jornada_laboral = jornada_laboral;
    }

    public void modificarNumeroVacantes(int numero_vacantes) {
        this.numero_vacantes = numero_vacantes;
    }

    public void modificarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void modificarPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void modificarRequisitosMinimos(String requisitos_minimos) {
        this.requisitos_minimos = requisitos_minimos;
    }

    public void modificarSalario(Double salario) {
        this.salario = salario;
    }

    public void modificarTipoContrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
    
    
    
    ConexionBD con = new ConexionBD();
    
    
    
    
    /*------------------OPERACIONES------------------*/
    
    public Oferta(int cod_oferta, String concepto, Date fecha, int activo, String poblacion, 
            int numero_vacantes, String descripcion, String requisitos_minimos, String tipo_contrato
            ,int jornada_laboral,Double salario,String observaciones,String NIF_CIF_Donante) {
        this.cod_oferta =cod_oferta;
        this.concepto = concepto;
        this.fecha = fecha;
        this.activo = activo;
        this.poblacion = poblacion;
        this.numero_vacantes = numero_vacantes;
        this.descripcion = descripcion;
        this.requisitos_minimos = requisitos_minimos;
        this.tipo_contrato = tipo_contrato;
        this.jornada_laboral = jornada_laboral;
        this.salario = salario;
        this.NIF_CIF_Donante = NIF_CIF_Donante;
        this.observaciones = observaciones;
    }
    
    
    
    
    /**
     * Funcion que devuelve los datos asociados a una Oferta
     * @return Devuelve el objeto Oferta consultado
     */
    public Oferta obtenerDatosOferta()
    {
        return this;
    }
    
    
    /**
     * Funcion que añade la oferta y que actualiza la tupla en la BD
     */
    public Boolean agregar()
    {
        //modifico los datos asociados en la BD:
        Boolean exito=true;
        
        con.comprobarConexionBD();

        //transformo los tipo Date pasados
        java.sql.Timestamp fechaOferta = new java.sql.Timestamp( fecha.getTime() );
        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();

            //Actualizo la tabla de Oferta
            instruccion.executeUpdate("INSERT INTO Oferta (Concepto, Fecha, Activo, Poblacion, Numero_Vacantes, Descripcion, Requisitos_Minimos, Tipo_Contrato, Jornada_Laboral, Salario, Observaciones, NIF_CIF_Donante) VALUES ("
                    + "\"" + concepto + "\", "                    
                    + "\"" + fechaOferta + "\", "                    
                    + "\"" + activo + "\", "                    // Desactivada
                    + "\"" + poblacion + "\", "
                    + "\"" + numero_vacantes + "\", "
                    + "\"" + descripcion + "\", "
                    + "\"" + requisitos_minimos + "\", "
                    + "\"" + tipo_contrato + "\", "
                    + "\"" + jornada_laboral + "\", "
                    + "\"" + salario + "\", "
                    + "\"" + observaciones + "\", "
                    + "\"" + NIF_CIF_Donante + "\")");
         }
         //Captura de errores
         catch(SQLException e)
         { 
             exito=false;
             System.out.println(e); 
         }
         catch(Exception e)
         { 
             exito=false;
             System.out.println(e);
         }

        return exito;
        
        
    }
    
    
    /**
     * Funcion que modifica los datos asociados a la Oferta y que actualiza la tupla en la BD
     * @param Cod_Oferta Nuevo codigo a asociar a la oferta
     * @param Concepto Nuevo concepto a asociar a la oferta
     * @param FechaOf Nueva fecha a asociar a la oferta
     * @param Activada Nuevo valor de activacion a asociar a la oferta
     * @param Poblacion Nueva poblacion a asociar a la oferta 
     * @param Num_vacantes Nuevo numero de plazas vacantes a asociar a la oferta
     * @param Descripcion Nueva descripcion a asociar a la oferta
     * @param Req_minimos Nuevos requisitos minimos a asociar a la oferta
     * @param Tipo_contrato Nuevo tipo de contrato a asociar a la oferta
     * @param Jornada_laboral Nueva jornada laboral a asociar a la oferta
     * @param Salario Nuevo salario a asociar a la oferta
     * @param DNI_donante Nuevo dni de Donante a asociar a la oferta
     * @param Observaciones Nuevas observaciones a asociar a la oferta
     * @return Devuelve true si todo ha ido bien y no ha habido ningun error
     */
    public Boolean modificar(Integer Cod_Oferta, String Concepto, Date FechaOf, Integer Activada, String Poblacion, Integer Num_vacantes, String Descripcion, String Req_minimos, String Tipo_contrato, Integer Jornada_laboral, Double Salario, String DNI_donante, String Observaciones)
    {
        
        
        int cod_oferta_antiguo = cod_oferta;    //me servira para buscar la tupla correspondiente
        
        cod_oferta = Cod_Oferta;
        concepto = Concepto;
        fecha = FechaOf;
        activo = Activada;
        poblacion = Poblacion;
        numero_vacantes = Num_vacantes;
        descripcion = Descripcion;
        requisitos_minimos = Req_minimos;
        tipo_contrato = Tipo_contrato;
        jornada_laboral = Jornada_laboral;
        salario = Salario;
        observaciones = Observaciones;
        NIF_CIF_Donante = DNI_donante;
        
        
        //modifico los datos asociados en la BD:
        Boolean exito=true;
        
        con.comprobarConexionBD();

        //transformo los tipo Date pasados
        java.sql.Timestamp fechaOferta = new java.sql.Timestamp( fecha.getTime() );
        
        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();

            //Actualizo la tabla de Oferta
            instruccion.executeUpdate("Update Oferta SET "
                    + "Cod_Oferta = \"" + cod_oferta + "\", "
                    + "Concepto = \"" + concepto + "\", "                    
                    + "Fecha = \"" + fechaOferta + "\", "                    
                    + "Activo = \"" + activo + "\", "                    
                    + "Poblacion = \"" + poblacion + "\", "
                    + "Numero_Vacantes = \"" + numero_vacantes + "\", "
                    + "Descripcion = \"" + descripcion + "\", "
                    + "Requisitos_Minimos = \"" + requisitos_minimos + "\", "
                    + "Tipo_Contrato = \"" + tipo_contrato + "\", "
                    + "Jornada_Laboral = \"" + jornada_laboral + "\", "
                    + "Salario = \"" + salario + "\", "
                    + "NIF_CIF_Donante = \"" + NIF_CIF_Donante + "\""
                    + "Observaciones = \"" + observaciones + "\", "
                    + " WHERE Cod_Oferta = \""+cod_oferta_antiguo+"\"");
            
            

            
         
            
         }
         //Captura de errores
         catch(SQLException e)
         { 
             exito=false;
             System.out.println(e); 
         }
         catch(Exception e)
         { 
             exito=false;
             System.out.println(e);
         }

        
        return exito;
        
        
    }

    
    /**
     * Funcion que deshabilita la oferta y que actualiza la tupla en la BD
     */
    public Boolean eliminar()
    {
        //modifico los datos asociados en la BD:
        Boolean exito=true;
        
        con.comprobarConexionBD();

        //transformo los tipo Date pasados
        java.sql.Timestamp fechaOferta = new java.sql.Timestamp( fecha.getTime() );
        
        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();

            //Actualizo la tabla de Oferta
            instruccion.executeUpdate("Update Oferta SET "                  
                    + "Activo = \"" + 0 + "\""                    // Desactivada
                    + " WHERE Cod_Oferta = \""+cod_oferta+"\"");
         }
         //Captura de errores
         catch(SQLException e)
         { 
             exito=false;
             System.out.println(e); 
         }
         catch(Exception e)
         { 
             exito=false;
             System.out.println(e);
         }

        return exito;
        
        
    }
    
    
}
