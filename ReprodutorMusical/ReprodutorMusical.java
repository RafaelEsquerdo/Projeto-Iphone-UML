package ReprodutorMusical;

public class ReprodutorMusical {
 String musica;
        public void selecionarMusica(String musica){
           this.musica = musica;
        }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }



    public void tocar(){
        System.out.println("Tocando Musica");
    }
    public void pausar(){
        System.out.println("Musica Pausada");
    }
}
