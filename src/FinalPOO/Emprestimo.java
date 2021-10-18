
package FinalPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
    private int codigo;
    private static int codProx = 1;
    private String dataEmprestimo;
    private String dataPreDevolucao;
    private double valorMulta;
    private Usuario usuario;
    private String dataDevolucaoReal;
    Biblioteca b = new Biblioteca("","");
    ArrayList <Livro> lstAddItem = new ArrayList <Livro>();
            
    Scanner in = new Scanner(System.in);

    public Emprestimo() {
    }
    
    public Emprestimo(String dataEmprestimo, String dataPreDevolucao, double valorMulta) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataPreDevolucao = dataPreDevolucao;
        this.valorMulta = valorMulta;
    }

 public void adicionarItem(){  
    System.out.println("-------------------Qual Livro Você Procura------------------- ");  
    System.out.println("DIGITE O CODIGO: ");
    in.nextLine();
    String titulo = in.next();
    for (Livro l : b.lstLivro){
        if (l.getTitulo().equals(titulo)){
            lstAddItem.add(l);
            System.out.println("Livro Adicionado ou Emprestimo.");
          
        }else
            System.out.println("Livro não encontrado.");
  }   
 }
 
 public void devolverItem(){
    System.out.println("-------------------Qual Livro Deseja Devolver ------------------- ");  
    System.out.println("Digite o Titulo do Livro:");
    in.nextLine();
    String titulo = in.next();
    for (Livro l : lstAddItem){
        if (l.getTitulo().equals(titulo)) {
            lstAddItem.remove(l);
            System.out.println("Livro Devolvido.");
            for (Livro lv : lstAddItem){
              System.out.println(lv);
            }
        }else
            System.out.println("Livro não encontrado.");
  }   
     
 }
 
 public void devolverTodos(){
     System.out.println("-------------------Deseja Realmente Devolver Todos os Livros------------------- "); 
     System.out.println("Se sim Digite S. Se não Digite N");
     char opcao = in.next().charAt(0);
       if(opcao == 'S' ){
       lstAddItem.removeAll(lstAddItem);
       System.out.println("Livros Devolvidos.");
       }
      if(opcao == 'N'){
          System.out.println("Devolução Cancelada"); 
      }     
            
 }
 
 public double calcularValor(long maiorData){
     return maiorData*(1*0.5);
 }
 
 public void adicionarUsuario(Usuario usuario){
     this.usuario=usuario;
 }
 
 public void verificarDatas(){
     
 }

    @Override
    public String toString() {
        return "Emprestimo{" + "codigo=" + codigo + ", dataEmprestimo=" + dataEmprestimo + ", dataPreDevolucao=" + dataPreDevolucao + ", valorMulta=" + valorMulta + '}';
    }
  
    public int getCodigo() {
        return codProx++;
    }

    private void setCodigo() {
        this.codigo = codProx ;
        codProx++;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPreDevolucao() {
        return dataPreDevolucao;
    }

    public void setDataPreDevolucao(String dataPreDevolucao) {
        this.dataPreDevolucao = dataPreDevolucao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
     public String getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(String dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    
    public String imprimirDevolucao(){
        return String.format("Codigo=" + codigo + ", Data do Emprestimo=" + dataEmprestimo + ", Data Pré Devolucao=" + dataPreDevolucao + ", Valor da Multa=" + valorMulta + ", Data da Devolução = " + getDataDevolucaoReal() );
    }
    
    
}
