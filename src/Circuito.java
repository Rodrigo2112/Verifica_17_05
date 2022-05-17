public class Circuito {
    public Semaforo s;
    public Circuito(Semaforo s){
        this.s = s;
    }
    public void utilizza(String nome){
        System.out.println((nome + " è partito"));
        try{
            Thread.sleep((long)Math.random()*1000);
        }catch(Exception e){}
        System.out.println(nome + " ha finito la gara");
    }
}
