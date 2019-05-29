/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;




public class JavaLocadora 
{
    public Scanner ler;
    private boolean execute = true;
     ArrayList<Cliente> lista =new ArrayList<>();
   //public List<Cliente> listaDeUsuarios;
   //private List<Cliente> cliente;
    
    public static void main(String[] args){
        
        new JavaLocadora();
        
    }
    public JavaLocadora(){
      
      
      
       ler = new Scanner(System.in);
       //cliente = new ArrayList<>();
       
      System.out.println("BEM VINDO A LOCADORA DE VEICULOS");
      
     
               
      while(execute){
                
               CadastroCliente cad = new CadastroCliente(); 
               AlugarCarro alu = new AlugarCarro();
               
               System.out.println("Selecione a opção");
               System.out.println("N - Novo Cadastro");
               System.out.println("L - Listar cadastros");
               System.out.println("V - Listar veiculos disponivel ");
               System.out.println("X - Sair");    
               String opcao = ler.nextLine();
               
                if(opcao.equalsIgnoreCase("n")){
                    //cad.cadastrar();
                    //função retornar data 
                Scanner ler = new Scanner(System.in);
                  
                Date data = new Date(System.currentTimeMillis());  
                SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy"); 
                
            
           //while(cadastrando){
                System.out.println("Cadastro de Usuario");
               
                             /*d.setNome(textInput("Nome: "));
                             d.setEnd(textInput("Endreço: "));
                             d.setTel(textInput("Telefone: "));
                             d.setIdade(textInput("Idade"));
                             d.setRg(textInput("RG: "));
                             d.setCpf(textInput("CPF: "));*/
                            System.out.println("Digite codigo do cliente, somente numeros");                            
                            int id =   Integer.parseInt(ler.nextLine());
                            System.out.println("Digite o nome completo ");
                            String nome = ler.nextLine();
                            System.out.println("Digite o endereço");
                            String end = ler.nextLine();
                            System.out.println("Digite o telefone ");
                            String tel =ler.nextLine();
                            System.out.println("Digite a idade ");
                            String idade = ler.nextLine();
                            System.out.println("Digite o RG ");
                            String rg = ler.nextLine();
                            System.out.println("Digite o CPF ");
                            String cpf = ler.nextLine();
                            System.out.println("Digite a data de devolução ");
                            String dtdev = ler.nextLine();
                        
                          
                            
                            String dtalu = formatarDate.format(data);
                           
                            Cliente usuario = new Cliente();
                           // Cliente usuario = new Cliente(id, nome,end,tel,idade,rg,cpf,dtdev,dtalu);
                            lista.add(usuario);
                            //lista.add(usuario);
                           
                            usuario.setNome(nome);
                            usuario.setEnd(end);
                            usuario.setTel(tel);
                            usuario.setIdade(idade);
                            usuario.setRg(rg);
                            usuario.setCpf(cpf);
                            usuario.setDtalu(dtalu);
                            usuario.setDtdev(dtalu);
                            //System.out.println("teste mostra " + usuario.getId());
    
                            
                             
                System.out.println("Adicionar cadastro (S/N) ?");
                String op = ler.nextLine();
               //String cadastrar = textInput("Adicionar cadastro (S/N) ?");
                if(op.equalsIgnoreCase("s")){
                    System.out.println("Cadastro Adicionado!");
                    lista.add(usuario);
                    
                     for(int i = 0 ;i < lista.size(); i++){
                                        System.out.println(lista.get(i));
                                        Cliente d = lista.get(i);
                                        System.out.println("Cadastro numero :"+i);
                                        System.out.println("\tNome: "+ d.getNome());
                                        System.out.println("\tEndereço: "+ d.getEnd());
                                        System.out.println("\tTelefone: "+ d.getTel());
                                        System.out.println("\tIdade: "+ d.getIdade());
                                        System.out.println("\tRG: "+ d.getRg());
                                        System.out.println("\tCPF: "+ d.getCpf());    
                     }
                    System.out.println("voltar menu anterior (S) ou adicionar outro cadastro (N) ?");
                    opcao = ler.nextLine();
                    if(opcao.equalsIgnoreCase("s")){
                          //break;
                       
                    }else{
                    
                    }
                    //cadastrar();
                }else if(opcao.equalsIgnoreCase("n")){
                    System.out.println("Cadastro ignorado!");   
                     //break;
                   }else{
                    System.out.println("Tecla incorreta, cadastro ignorado!");
                    // break;
                }
                            
                    
                
                }else
                if(opcao.equalsIgnoreCase("l")){
                      //Cliente usuario = new Cliente();
                     //cad.listarCadastro();
                    
                    if(!lista.isEmpty()){
                                    System.out.println("\nNão existem cadastros !\n");
                                }else{
                                    System.out.println("\nLista de Cadastros\n");
                                    for(int i = 0 ;i < lista.size(); i++){
                                        System.out.println(lista.get(i));
                                        Cliente d = lista.get(i);
                                        System.out.println("Cadastro numero :"+i);
                                        System.out.println("\tNome: "+ d.getNome());
                                        System.out.println("\tEndereço: "+ d.getEnd());
                                        System.out.println("\tTelefone: "+ d.getTel());
                                        System.out.println("\tIdade: "+ d.getIdade());
                                        System.out.println("\tRG: "+ d.getRg());
                                        System.out.println("tCPF: "+ d.getCpf());    
                                    }
                                        System.out.println("\nFim da lista\n");
                                }
                
                }else
                if(opcao.equalsIgnoreCase("x")){
                    execute = false;
                    
                }else
                if(opcao.equalsIgnoreCase("v")){
                    
                    
                   alu.alugar();
                   
                }else{
                 System.out.println("opção incorreta :(");
                }
                /*String opcao = menu();
                if(opcao.equalsIgnoreCase("n")) {
                    cad.cadastrar();
                }else if(opcao.equalsIgnoreCase("l")){
                     cad.listarCadastro();
                }else if(opcao.equalsIgnoreCase("x")){
                    
                }else{ 
                    System.out.println("opção incorreta :(");
                }
            }*/
        }
    
    
    
       
        /*public String menu(){
            System.out.println("Selecione a opção");
            System.out.println("N - Novo Cadastro");
            System.out.println("L - Listar cadastros");
            System.out.println("V - Listar veiculos");
            System.out.println("X - Sair");    
            return ler.nextLine();
        }*/
       
                
                
                          
         
                    
                   

                    /*while(opcao != 0)
                    //do{  
                        
                        
                        
                        
                          { System.out.println("Deseja cadastrar um usuario se sim digite 1 !");
                          { System.out.println("Deseja ver lista de usuarios cadastrados digite 2 !");
                          opcao = Integer.parseInt(ler.nextLine());
                        
                            if(opcao == 1){
                                
                            Cliente usuario = new Cliente();
                            
                            
                            
                            System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");   
                            System.out.println("Digite o nome completo ");
                            String nome = ler.nextLine();
                            System.out.println("Digite o endereço");
                            String end = ler.nextLine();
                            System.out.println("Digite o telefone ");
                            String tel =ler.nextLine();
                            System.out.println("Digite a idade ");
                            String idade = ler.nextLine();
                            System.out.println("Digite o RG ");
                            String rg = ler.nextLine();
                            System.out.println("Digite o CPF ");
                            String cpf = ler.nextLine();
                            System.out.println("Digite a data de devolução ");
                            String dtdev = ler.nextLine();
                            idusuario++;
                            
                            
                           
                         

                            String dtalu = formatarDate.format(data);
                           
                            usuario.setId(idusuario);
                            usuario.setNome(nome);
                            usuario.setEnd(end);
                            usuario.setTel(tel);
                            usuario.setIdade(idade);
                            usuario.setRg(rg);
                            usuario.setCpf(cpf);
                            usuario.setDtalu(dtalu);
                            usuario.setDtdev(dtalu);
                            
                            
                            
                           
                               
                            }else if(opcao == 2){
                                
                                
                                
                                
                                
                            
                                
                            }else{
                                System.out.println("opção invalida!");
                            }
                            
                            
                            Cliente usuario = new Cliente();

                           // int statusloc = 1;
                           // int valor = 1000;
                            


                            //usuario.cadCliente(i, valor, statusloc, nome, end, tel, rg, cpf, dtalu, dtdev);


                           
                            

                            

                            


                           
                            else if(escolha == 2)
                                {
                                             
                                              
                                               
                                  }
                            else if(escolha == 3)

                              {

                                  System.out.println("seus dados");
                                  
                                  System.out.println(usuario.getNome());
                                  System.out.println(usuario.getEnd());
                                  System.out.println(usuario.getTel());
                                  System.out.println(usuario.getIdade());
                                  System.out.println(usuario.getCpf());
                                  System.out.println(usuario.getRg());


                               }
                            else if(escolha == 0)
                                
                               System.exit(0);
                            
                          } 
                     // }while(opcao !=0);    
    }   

    
  }
}*/
           
 
 






 }
}