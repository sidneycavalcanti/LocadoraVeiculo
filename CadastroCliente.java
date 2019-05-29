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

/**
 *
 * @author sidney
 */
public class CadastroCliente {
    
  
    public boolean execute = true;
    public List<Cliente> listaDeUsuarios;
    boolean cadastrando = true;
    ArrayList<Cliente> lista =new ArrayList<>();
   
            
            
     public void cadastrar(){
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
                String opcao = ler.nextLine();
               //String cadastrar = textInput("Adicionar cadastro (S/N) ?");
                if(opcao.equalsIgnoreCase("s")){
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
                            
                   
            //} fechamento do while
        }         
                
        public void listarCadastro(){ 
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
                           
                     }

}
   
    /* public String textInput(String label){
                         System.out.println(label);
                         return ler.nextLine();
                     }*/
    
