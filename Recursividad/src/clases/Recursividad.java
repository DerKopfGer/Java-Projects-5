package clases;

public class Recursividad {

    public void Imprimir(int x){
        if(x <= 20){
            System.out.print(x +" ");
            Imprimir(x + 1);
        }
    }
}
