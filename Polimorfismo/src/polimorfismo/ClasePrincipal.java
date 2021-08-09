package polimorfismo;

public class ClasePrincipal {

    public static void main(String args[]){
        
        Operaciones_ClasePadre Mensajero_Suma = new Suma_ClaseHija();
        Mensajero_Suma.PedirDatos();
        Mensajero_Suma.Operaciones();
        Mensajero_Suma.MostrarResultado();
        
        Operaciones_ClasePadre Mensajero_Resta = new Resta_ClaseHija();
        Mensajero_Resta.PedirDatos();
        Mensajero_Resta.Operaciones();
        Mensajero_Resta.MostrarResultado();
        
    }
}
