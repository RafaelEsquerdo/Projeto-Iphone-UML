import ReprodutorMusical.ReprodutorMusical;
import AparelhoTelefonico.AparelhoTelefonico;
import NavegadornaInternet.NavegadornaInternet;
public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical RE = new ReprodutorMusical();
        RE.setMusica("Kamaitachi");
        System.out.println("Selecionado: " + RE.getMusica());
        RE.tocar();
        RE.pausar();
        System.out.println("==========================================");
        AparelhoTelefonico ap  = new AparelhoTelefonico();
        ap.setNumero("31991525909");
        System.out.println("O numero: " + ap.getNumero()+ " Está ligando");
        ap.Atender();
        ap.iniciarCorreiodeVoz();
        System.out.println("===========================================");
        NavegadornaInternet ni= new NavegadornaInternet();
        System.out.println(ni.getUrl());
        ni.atualizarPagina();
        ni.adicionarNovaAba();




    }

}
