package cl.duoc.poo.tarea1.menu;

public class Salir extends OpcionMenu {

    public Salir(Integer numeroMenu, String nombreMenu) {
        super(numeroMenu, nombreMenu);
    }

    @Override
    public void ejecutar() {
        System.exit(1);
    }
}
