package Giocattolaio;


public class Main {
    public static void main(String args[]){ 
    // Creo oggetti Giocattolo
    Giocattolo giocattolo1 = new Giocattolo(1, "Macchinina", 50, 6);
    Giocattolo giocattolo2 = new Giocattolo(2, "Bambola", 15, 4);

    // Creo oggetti Cliente
    Cliente cliente1 = new Cliente(1, "Mario Rossi", "mariorossi@email.com");
    Cliente cliente2 = new Cliente(2, "Sofia Bianchi", "sofiabianchi@email.com");
        System.out.println("Ciao");
}
}
