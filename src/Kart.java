public class Kart extends Thread{

    public int numero;
    Pilota p;

    public Kart(int numero, Pilota p){
        this.numero = numero;
        this.p = p;
    }

}