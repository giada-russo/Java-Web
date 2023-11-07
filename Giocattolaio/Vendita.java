package Giocattolaio;

public class Vendita {
    private int idVendita;
    private Cliente cliente1;
    private Giocattolo giocattolo1;

    public Vendita(int idVendita, Cliente cliente, Giocattolo giocattolo) {
        this.idVendita = idVendita;
        this.cliente1 = cliente;
        this.giocattolo1 = giocattolo;
    }

    public int getIdVendita(){
        return idVendita;
    }
    public Cliente getCliente1(){
        return cliente1;
    }
    public Giocattolo getGiocattolo1(){
        return giocattolo1;
    }

    public void setIdVendita(int idVendita){
        this.idVendita=idVendita;
    }
    public void setCliente1(Cliente cliente1){
        this.cliente1=cliente1;
    }
    public void setGiocattolo1(Giocattolo giocattolo1){
        this.giocattolo1=giocattolo1;
    }
}


