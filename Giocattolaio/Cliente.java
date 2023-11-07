package Giocattolaio;
public class Cliente{ 
    private int id;
    private String nome;
    private String indirizzoEmail;

    public Cliente(int id, String nome, String indirizzoEmail){
        this.id=id;
        this.nome=nome;
        this.indirizzoEmail=indirizzoEmail;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getIndirizzoEmail(){
        return indirizzoEmail;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIndirizzoEmail(String indirizzoEmail){
        this.indirizzoEmail=indirizzoEmail;
    }
}
  
