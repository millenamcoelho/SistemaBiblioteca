
package FinalPOO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Bibliomax","Centro");
        Scanner in = new Scanner(System.in);
        char selecao = 's';
        
        
    while (selecao == 'S' || selecao == 's'){ 
         
        System.out.println("-------------------BEM VINDO(A) AO SISTEMA DA BIBLIOTECA-------------------\n "
                + "Digite os respectivos números para acessar as funções do sistema: "
                + "1 P/-  Cadastrar Usuario.\n"
                + "2 P/- Cadastrar Publicação.\n"
                + "3 P/- Cadastar Emprestimo.\n"
                + "4 P/- Pesquisar Publicação.\n"
                + "5 P/- Listar Publicação.\n"
                + "6 P/- Listar Usuario.\n");
                /*
                + "7-Cadastrar Devolução.\n"
                + "8-Listar Devolução.\n");
                */
         int painelinicial = in.nextInt();
        switch(painelinicial){
            case 1:
                b.CadastrarUsuario();
             break;
             
            case 2:
                b.CadastrarPublicacao();
            break;
            
            case 3:
                b.CadastrarEmprestimo();
            break;
            
            case 4:
                b.pesquisarPublicacao();
            break;
            
            case 5:
                b.listarPublicacao();
            break;
            
            case 6:
                b.listarUsuario();
            break;
            /*
            case 7:
                 b.CadastrarDevolucao();
            break;
            case 8:
                 b.listarDevolucao();
            break;
            */
        }   
         System.out.println("Digite S para continuar e N para sair.");
            selecao = in.next().charAt(0);  
               
        
        
        }
        
    }
    
}
