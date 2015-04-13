package parametrosxvalor;

public class Color {

    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarObjeto(Color obj1) {
        obj1 = new Color("púrpura");
        System.out.println(obj1.nombre);
    }

    public void cambiarNombre(Color obj2) {
        obj2.setNombre("azul");
        System.out.println(obj2.nombre);

    }
}
