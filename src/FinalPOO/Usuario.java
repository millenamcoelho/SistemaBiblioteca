
package FinalPOO;



public class Usuario {
    private int codigo;
    static private int codProx = 1;
    private String nome;
    private long cpf;
    private String endereco;
    private String telefone;
    private String dataNasc;

    public Usuario(String nome, long cpf, String endereco, String telefone, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public int getCodigo() {
        return codProx++;
    }

    private void setCodigo() {
        this.codigo = codProx;
        codProx++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
          return String.format("codigo:%d\n"
                  + "Nome:%s.\n"
                  + "CPF:%s.\n"
                  + "Endereço:%s.\n"
                  + "Telefone:%s.\n"
                  + "Data nascimento:%s.\n",codProx,this.nome,this.cpf,this.endereco,this.telefone,this.dataNasc);
    }
 
    
}
