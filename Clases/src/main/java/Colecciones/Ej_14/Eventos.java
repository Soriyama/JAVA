package Colecciones.Ej_14;

import java.util.ArrayList;
import java.util.Date;

public class Eventos {
    static int numId = 0;
    private String id;
    private String nombre;
    private String deporte;
    private Date fecha;
    private Date hora;
    private String lugar;
    private int nParticipantes;

    public Eventos(String id, String nombre, String deporte, Date fecha, Date hora, String lugar, int nParticipantes){
        this.id= id+numId;
        numId++;
        this.nombre=nombre;
        this.deporte=deporte;
        this.fecha=fecha;
        this.hora=hora;
        this.lugar=lugar;
        this.nParticipantes=nParticipantes;
    }

    public String getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", nParticipantes=" + nParticipantes +
                '}';
    }
}
class Competiciones extends Eventos{
    private String tipoCompeticion;
    ArrayList<String> listaParticipantes;
    public Competiciones(String id, String nombre, String deporte, Date fecha, Date hora, String lugar, int nParticipantes,String tipoCompeticion){
        super(id, nombre, deporte, fecha, hora, lugar, nParticipantes);
        this.tipoCompeticion=tipoCompeticion;
        listaParticipantes=new ArrayList<>();
    }
    public void añadirParticipante(String nombre){
        listaParticipantes.add(listaParticipantes.size(),nombre);
    }
    public String getParticipante(int posicion){
        return listaParticipantes.get(posicion);
    }

    @Override
    public String toString() {
        return "Competiciones{" +
                "tipoCompeticion='" + tipoCompeticion + '\'' +
                ", listaParticipantes=" + listaParticipantes +
                '}';
    }
}
