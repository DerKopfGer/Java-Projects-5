package hilos;

public class ClasePrincipal {
    public static void main(String args[]){
        
        Hilo1 hilouno = new Hilo1();
        Hilo2 hilodos = new Hilo2();
        Hilo3 hilotres = new Hilo3();
        Hilo4 hilocuatro = new Hilo4();
        
        //Hilo 1      
        hilouno.start();
        try{
            hilouno.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1");    
             
        }
        //Hilo 2
        hilodos.start();
        try{
            hilodos.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2");    
             
        }
        //Hilo 3
        hilotres.start();
        try{
            hilotres.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3");    
             
        }
        //Hilo 4
        hilocuatro.start();
        try{
            hilocuatro.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 4");    
             
        }
    }
}