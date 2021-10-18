
package FinalPOO;

import java.util.Date;

public class ItemEmprestimo {
    private String dataDevolucao;

    public ItemEmprestimo(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
  
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public void atualizarDevolucao(){
       getDataDevolucao().equals(dataDevolucao);
    }
}
