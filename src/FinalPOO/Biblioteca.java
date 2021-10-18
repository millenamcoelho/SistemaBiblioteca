
package FinalPOO;

import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca implements Ibiblioteca {
    private String nome;
    private String endereco;
    ArrayList <Usuario> lstUsuario = new ArrayList <Usuario>();
    ArrayList <Livro> lstLivro = new ArrayList <Livro>();
    ArrayList <Periodico> lstPeriodico = new ArrayList <Periodico>(); 
    ArrayList <Emprestimo> lstEmprestimo = new ArrayList <Emprestimo>();
    
    Scanner in = new Scanner(System.in);
    
    
    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void CadastrarUsuario() {
        System.out.println("Digite o nome do usuario");
        String nome = in.next();
        System.out.println("Digite o CPF");
        long CPF = in.nextLong();
        System.out.println("Digite o Enderço");
        String end = in.next();
        System.out.println("Digite o Telefone");
        in.nextLine();
        String tel = in.next();
        System.out.println("Data de nascimento");
        String data = in.next();
        Usuario u = new Usuario(nome,CPF,end,tel,data);
        lstUsuario.add(u);
        System.out.println("Usuario Cadastrado com succeso");
    }

    @Override
    public void CadastrarPublicacao() {
       
        
        System.out.println("-------------------Cadastro de Publicação-------------------");
        
         System.out.println("Digite qual o tipo de publicação. 1- Para Livro 2- para Periodico");
        int opcao = in.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Digite o Titulo da publicação");
                String nome = in.next();
                System.out.println("Digite a Editora");
                in.nextLine();
                String ed = in.next();
                System.out.println("Digite o Ano");
                in.nextLine();
                String ano = in.next();  
                System.out.println("Digite o Autor do Livro:");
                String nomeAutor = in.next();
                System.out.println("Digite a quantidade de exemplares do livro:");
                int qtdL = in.nextInt();
                System.out.println("Digite a quantidade de exemplares disponiveis:");
                int qtdE = in.nextInt();
                Livro l = new Livro(nome,ed,ano,nomeAutor,qtdL,qtdE);
                lstLivro.add(l);
                 System.out.println("Publicação Cadastrda com sucesso");
                break;
            case 2:
                System.out.println("Digite o Titulo da publicação");
                String nomeP = in.next();
                System.out.println("Digite a Editora");
                in.nextLine();
                String edP = in.next();
                System.out.println("Digite o Ano");
                in.nextLine();
                String anoP = in.next();  
                System.out.println("Digite o número de Edição:");
                int numeroEdicao = in.nextInt();
                System.out.println("Digite o mês:");
                String mes = in.next();
                Periodico p = new Periodico(nomeP,edP,anoP,numeroEdicao,mes);
                lstPeriodico.add(p);
                System.out.println("Publicação Cadastrda com sucesso");
                break; 
        }
        
    }

    @Override
    public void CadastrarEmprestimo() {
      //Emprestimo e = new Emprestimo("","",0);
      //e.adicionarItem();
      
    }

    @Override
    public void CadastrarDevolucao() {
        /*System.out.println("------------------- Realizar Devolução -------------------");
        System.out.println("Digite o titulo do empréstimo:");
        String titulo = in.next();
        for (Livro l : lstLivro) {
            if (l.getTitulo().equals(titulo)) {
                System.out.println("Deseja devolver Livro específico ou todos? 1 Para específicos 2 Para todos");
                int opcao = in.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o título do livro a ser devolvido:");
                        String titulo2 = in.nextLine();
                        for (Livro lv : lstLivro) {
                            if (l.getTitulo().equals(titulo)) {
                                System.out.println("Qual a data da devolução?");
                                String data = in.nextLine();
                                e.setDataDevolucaoReal(data);
                            } else {
                                System.out.println("Livro não encontrado.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Qual a data da devolução?");
                        String data = in.nextLine();
                        e.setDataDevolucaoReal(data);
                }
            } else {
                System.out.println("Código não encontrado.");
            }
        }
*/
    }

    @Override
    public int gerarCodigo() {
    return 0;
    }

    @Override
    public void listarUsuario() {
       for(Usuario u : lstUsuario)
            System.out.println(u.toString());
    }

    @Override
    public void listarPublicacao() {
        
        System.out.println("Deseja listar Livro ou Periodico. 1 - Para Livro 2 - Para Periodico"); 
         int opcao = in.nextInt();
        switch(opcao){
            case 1:
        for(Livro l : lstLivro){
            System.out.println(l.toString());
        }
        break;
            case 2:
    for(Periodico p : lstPeriodico){
          System.out.println(p.toString());
    }
    break;
   }
}
    @Override
    public void listarDevolucao() {
        /*
    System.out.println("------------------- Listar Devolução -------------------");
        System.out.println("Digite o codigo do empréstimo:");
        int codemprestimo = in.nextInt();
        for (Emprestimo e : lstEmprestimo) {
            if (codemprestimo == e.getCodigo()) {
                e.imprimirDevolucao();
            } else {
                System.out.println("Empréstimo não encontrado.");
            }
        }
*/
    }

    @Override
    public void pesquisarPublicacao() {
        
        System.out.println("-------------------Qual Publicação você procura------------------- ");
        
        System.out.println("1 - Para Livro e 2 - Para Periodico");
        int menu = in.nextInt();
        switch(menu){
            case 1:
                System.out.println("Digite o Título do Livro: ");
                String titulo = in.next();  
        
        
            for (Livro l : lstLivro){ 
                if(l.getTitulo().equals(titulo)){
                    System.out.println(l.toString());        
          }else
            System.out.println("Livro não encontrado."); 
        }
        break;
            case 2:
                System.out.println("Digite o Código: ");
                in.nextLine();
                String titulo2 = in.next();
                for (Periodico p : lstPeriodico){
                    if (p.getTitulo().equals(titulo2) ) {
                        System.out.println(p.toString());
                    }else
                        System.out.println("Livro não encontrado.");
          }
            break;    
           } 
         
        }
    }
