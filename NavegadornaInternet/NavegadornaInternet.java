package NavegadornaInternet;

public class NavegadornaInternet {
    String url;
    public void exibirPagina(String url){
        this.url=url;

    }

    public String getUrl() {
        return url="Exibindo Pagina";
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova Aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }
}
