import java.io.Serializable;
import java.util.Collection;

public class App implements Serializable{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Semaforo s_persone = new Semaforo(2);
        Semaforo s_circuito = new Semaforo(8);

        Spogliatoio sPersone = new Spogliatoio(s_persone);
        Circuito cPersone = new Circuito(s_circuito);

        
        Pilota p1 = new Pilota("ciccio", sPersone);
        Pilota p2 = new Pilota("pluto", sPersone);
        Pilota p3 = new Pilota("topolino", sPersone);
        Pilota p4 = new Pilota("minni", sPersone);
        Pilota p5 = new Pilota("sissi", sPersone);
        Pilota p6 = new Pilota("paperino", sPersone);
        Pilota p7 = new Pilota("ciao", sPersone);
        Pilota p8 = new Pilota("sus", sPersone);

        Kart k1 = new Kart(1,p1,s_circuito);
        Kart k2 = new Kart(2,p2);
        Kart k3 = new Kart(3,p3);
        Kart k4 = new Kart(4,p4);
        Kart k5 = new Kart(5,p5);
        Kart k6 = new Kart(6,p6);
        Kart k7 = new Kart(7,p7);
        Kart k8 = new Kart(8,p8);

        

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        System.out.print("Sono usciti tutti dallo spogliatoio");

        k1.start();
        k2.start();
        k3.start();
        k4.start();
        k5.start();
        k6.start();
        k7.start();
        k8.start();

        k1.join();
        k2.join();
        k3.join();
        k4.join();
        k5.join();
        k6.join();
        k7.join();
        k8.join();

        
        System.out.println("Finito");
    }
}














