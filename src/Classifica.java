import java.util.ArrayList;

public class Classifica{
    ArrayList<Pilota>ListaPiloti;
    ArrayList<Kart>ListaKart;

    public Classifica(){
        ListaPiloti = new ArrayList<>();
        ListaKart = new ArrayList<>();
    }

    public boolean AggiungiClassifica(Pilota p){
        for(int i = 0; i < ListaPiloti.size(); i++){
            if(ListaPiloti.get(i).Nome == p.Nome){
                return false;
            }
        }
        ListaPiloti.add(p);
        return true;
    }

    public boolean AggiungiKart(Kart k){
        for (int i = 0; i < ListaKart.size(); i++){
            if(ListaKart.get(i).numero == k.numero){
                return false;
            }
        }
        ListaKart.add(k);
        return true;
    }

}