package cl.duoc.poo.tarea1.menu;

import cl.duoc.poo.tarea1.menu.validacion.Validacion;

import java.util.Scanner;

public abstract class OpcionMenu {

    protected Scanner scanner = new Scanner(System.in);
    private Integer numeroMenu;
    private String nombreMenu;

    public OpcionMenu(Integer numeroMenu, String nombreMenu) {
        this.numeroMenu = numeroMenu;
        this.nombreMenu = nombreMenu;
    }

    public Integer getNumeroMenu() {
        return numeroMenu;
    }

    public void setNumeroMenu(Integer numeroMenu) {
        this.numeroMenu = numeroMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && this.numeroMenu != null && (o instanceof OpcionMenu)) {
            return this.getNumeroMenu().equals(((OpcionMenu) o).getNumeroMenu());
        }
        return false;
    }

    protected String solicitarDato(String textoSolicitud, String textoError, Validacion validacion) {
        Boolean ingresoCorrecto = null;
        String dato = null;
        do {
            System.out.println(textoSolicitud);
            dato = scanner.nextLine();
            ingresoCorrecto = validacion.validar(dato);
            if (!ingresoCorrecto) {
                System.out.println(textoError);
            }
        } while (!ingresoCorrecto);
        return dato;
    }

    public abstract void ejecutar();


}
