package Giocattolaio;

public class Giocattolo {
    private int id;
    private String nome;
    private float prezzo;
    private int eta;

    public Giocattolo(int id, String nome, float prezzo,int eta){
        this.id=id;
        this.nome=nome;
        this.prezzo=prezzo;
        this.eta=eta;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
     public float getPrezzo(){
        return prezzo;
    }

     public int getEta(){
        return eta;
    }
   
    public void setId(int id){
        this.id=id;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPrezzo(float prezzo){
        this.prezzo=prezzo;
    }
     public void setEta(int eta){
        this.eta=eta;
    }


}

