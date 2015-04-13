package parametrosxvalor;

public class ParametrosXValor {

    private static int a;

    public static void main(String[] args) {
        a = 0;
        System.out.println("valor de a: " + a);
        miMetodo(a);
        System.out.println("valor de a: " + a);
        Color flor = new Color("rosa");
        System.out.println(flor.nombre);
        flor.cambiarObjeto(flor);
        System.out.println(flor.nombre);
        flor.cambiarNombre(flor);
        System.out.println(flor.nombre);
    }

    public static void miMetodo(int num) {
        num++;
        System.out.println("valor después de metodo:" + num + " valor de a:" + a);

    }

}
