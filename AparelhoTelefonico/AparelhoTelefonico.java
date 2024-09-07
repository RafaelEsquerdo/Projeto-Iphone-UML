package AparelhoTelefonico;

public class AparelhoTelefonico {
    String numero;
    public void ligar(String numero){
        System.out.println("Ligando");

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void Atender(){
        System.out.println("Atendendo Telefone");
    }
    public void iniciarCorreiodeVoz(){
        System.out.println("Iniciando Correio de Voz");
    }

}
