
package FinalPOO;


public abstract class  Publicacao {
    private int codigo;
    static int codProx = 1;
    private String titulo;
    private String editora;
    private String ano;
    

    public Publicacao( String titulo, String editora, String ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }
    
    @Override
    public abstract String toString();   

    public int getCodigo() {
        return codProx++;
    }

    private void setCodigo() {
        this.codigo = codProx;
        codProx++;
    }
            
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
    
}
