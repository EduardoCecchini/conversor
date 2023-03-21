
package logica;


public class ConexionScraping { 
    //atributos
    String webPage;
    String html;
    String claseElementos;
    int idElementos;

    public ConexionScraping() {
    }

    public ConexionScraping(String webPage, String html, String claseElementos, int idElementos) {
        this.webPage = webPage;
        this.html = html;
        this.claseElementos = claseElementos;
        this.idElementos = idElementos;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getClaseElementos() {
        return claseElementos;
    }

    public void setClaseElementos(String claseElementos) {
        this.claseElementos = claseElementos;
    }

    public int getIdElementos() {
        return idElementos;
    }

    public void setIdElementos(int idElementos) {
        this.idElementos = idElementos;
    }
    
    
}
