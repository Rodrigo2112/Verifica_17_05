
public class Pilota extends Thread{
    public String Nome;
    boolean Tuta = false;
    boolean Casco = false;
    int Tempo = 0;
    Spogliatoio spogliatoio;

    

    public Pilota(String Nome, Spogliatoio spogliatoio){
        this.Nome = Nome;
        this.spogliatoio = spogliatoio;
    }

    public void run(){
        spogliatoio.s.P();
        spogliatoio.utilizza(Nome);
        spogliatoio.s.V();
    }


}