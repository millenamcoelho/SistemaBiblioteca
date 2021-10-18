
package FinalPOO;



public class Periodico extends Publicacao{
    private int numEdicao;
    private String mes;

    public Periodico(String titulo, String editora, String ano,int numEdicao, String mes) {
        super(titulo, editora, ano);
        this.numEdicao = numEdicao;
        this.mes = mes;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
 
    @Override
    public String toString() {
        return String.format("Codigo:%d.\n"
                + "Titulo:%s. \n"
                + "Editora:%s.\n"
                + "Ano:%s.\n"
                + "Numero da Edição:%d.\n"
                + "Mes:%s.\n",super.getCodigo(),super.getTitulo(),super.getEditora(),super.getAno(),this.numEdicao,this.mes);
    
    
}
}