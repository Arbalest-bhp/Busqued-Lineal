public class BusquedaLineal{

    public static void main(String[] args) {
        int[] arregloInt = {3,37,45,57,93,120};

        //Crear el Objeto
        Busqueda buscador = new Busqueda();

        //Usar o manipular el Objeto
        int posicion = buscador.searchList(arregloInt, 45);

        if (posicion == -1)
            System.out.println("El valor " + 45 + " no se encontro");
        else
            System.out.println("El valor " + 45 + " se encontro en la posicion " + posicion);

        //destroy object
        buscador = null;
    }
}