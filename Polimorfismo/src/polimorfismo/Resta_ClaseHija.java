package polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre {
  
   @Override
   public void Operaciones(){
       System.out.println("");
       resultado = valor1 - valor2;
   }
}
