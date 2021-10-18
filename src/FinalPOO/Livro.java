
package FinalPOO;


public class Livro extends Publicacao {
   
    private String autores;
    private int quantExemplar;
    private int quantDisponivel;

    public Livro(String titulo, String editora, String ano,String autores, int quantExemplar, int quantDisponivel ) {
        super(titulo, editora, ano);
        this.autores = autores;
        this.quantExemplar = quantExemplar;
        this.quantDisponivel = quantDisponivel;
    }
    
    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getQuantExemplar() {
        return quantExemplar;
    }

    public void setQuantExemplar(int quantExemplar) {
        this.quantExemplar = quantExemplar;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }
    
    public void atualizarQuantDisponivel(){
        
        
    }
    
    @Override
    public String toString() {
        return String.format ("codigo:%d.\n"
                + "Titulo:%s.\n"
                + "Editora:%s.\n"
                + "Ano:%s.\n"
                + "Autores:%s.\n"
                + "Quantidade de Exemplares:%d.\n"
                + "Quantidade Disponivel:%d.\n",super.getCodigo(),super.getTitulo(),super.getEditora(),super.getAno(),this.autores,this.quantExemplar,this.quantDisponivel);
    }
    
}
