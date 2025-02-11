/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.soriyama.enumerados;

/**
 *
 * @author esteb
 */
public class Enumerados {

    public enum DiaSemana {
        LUNES("Inicio de la semana"),
        MARTES("Segundo día de la semana"),
        MIERCOLES("Mitad de semana"),
        JUEVES("Casi fin de semana"),
        VIERNES("Último día laboral"),
        SABADO("Fin de semana"),
        DOMINGO("Fin de semana");
        private String descripcion;
// Constructor del enumerado

        DiaSemana(String descripcion) {
            this.descripcion = descripcion;
        }
// Método para obtener la descripción del día

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.MARTES;
        System.out.println(dia + ": " + dia.getDescripcion());
    }

}
