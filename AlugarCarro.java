/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

import java.util.Scanner;

/**
 *
 * @author sidney
 */
public class AlugarCarro {
    
        Cliente usuario = new Cliente();
        Scanner ler = new Scanner(System.in);
     // lista de carros disponivel 
                Carro carro1 = new Carro(3,1.0,50.000f,"palio","fiat","prata","Totalflex");
                Carro carro2 = new Carro(2,1.6,40.000f,"HB20","Hyundai","branco","Totalflex");
                Carro carro3 = new Carro(5,1.0,55.000f,"Gol","volkswagen","preto","Gasolina");
                Carro carro4 = new Carro(3,3.0,7.000f,"Camaros","GM","Amarelo","totalflex");
                Carro carro5 = new Carro(1,2.0,15.000f,"Fusio","Ford","preto","totalflex");
                Carro carro6 = new Carro(1,8.3,5.000f,"Viper","Dodge","azul","Gasolina");
              //fim lista de carro
    
    public void alugar(){ 
           
                   System.out.println("Deseja alugar um veiculo (S/N) ? ");
                   String opcao = ler.nextLine();    
                   if(opcao.equalsIgnoreCase("s")){
                       
                        System.out.println("Escolha o carro para locação!");
                            System.out.println("                                  ");
                            System.out.println("total de veiculos disponivel "
                                    
                                    +(carro1.getQtd()
                                    +carro2.getQtd()
                                    +carro3.getQtd()
                                    +carro4.getQtd()
                                    +carro5.getQtd()
                                    +carro6.getQtd()));
                            
                            
                            System.out.println("                                  ");
                            System.out.println("selecione 1 para solicitar um veiculo");
                            //System.out.println("selecione 2 para acessar a lista de usuarios");
                            //System.out.println("selecione 3 para ver seus dados cadastrados"); 
                            System.out.println("selecione 0 para sair");
                            
                            int escolha; 
                            
                            escolha = Integer.parseInt(ler.nextLine());
                            
                           
                            
                            
                            if(escolha == 1){
                                
                                int valor = 1;
                                usuario.setStatusloc(valor);
                                
                                System.out.println("selcione 1 para o "+ carro1.getNome());
                                System.out.println("selcione 2 para o "+ carro2.getNome());
                                System.out.println("selcione 3 para o "+ carro3.getNome());
                                System.out.println("selcione 4 para o "+ carro4.getNome());
                                System.out.println("selcione 5 para o "+ carro5.getNome());
                                System.out.println("selcione 6 para o "+ carro6.getNome());
                                
                                escolha = Integer.parseInt(ler.nextLine());
                                
                                
                                  if(escolha == 1)
                                  {
                                    if(carro1.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{
                                    int resul = carro1.getQtd()- 1;
                                    carro1.setQtd(resul);

                                    System.out.println("o seu nome é "+usuario.getNome());
                                    System.out.println("o carro escolhido foi "+carro1.getNome());
                                    System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                    System.out.println(" o veiculo tem "+carro1.getKm_rodados()+" rodados.");
                                    System.out.println("quantidade disponivel é "+carro1.getQtd());
                                    
                                    
                                    }
                              


                                  }
                                  else if(escolha == 2)
                                  {
                                      if(carro2.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{

                                     int resul = carro2.getQtd()- 1;
                                     carro2.setQtd(resul);         
                                     System.out.println("o seu nome é "+usuario.getNome());
                                     System.out.println("o carro escolhido foi "+carro2.getNome());
                                     System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                     System.out.println(" o veiculo tem "+carro2.getKm_rodados()+" rodados.");
                                     System.out.println("quantidade disponivel é "+carro2.getQtd());

                                        }
                                  }
                                  else if(escolha == 3)
                                  {
                                    if(carro3.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{
                                    int resul = carro3.getQtd()- 1;
                                    carro3.setQtd(resul);

                                    System.out.println("o seu nome é "+usuario.getNome());
                                    System.out.println("o carro escolhido foi "+carro3.getNome());
                                    System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                    System.out.println(" o veiculo tem "+carro3.getKm_rodados()+" rodados.");
                                    System.out.println("quantidade disponivel é "+carro3.getQtd());

                                  }
                                  }
                                  else if(escolha == 4)
                                  {
                                    if(carro1.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{
                                    int resul = carro4.getQtd()- 1;
                                    carro4.setQtd(resul);

                                   System.out.println("o seu nome é "+usuario.getNome());
                                   System.out.println("o carro escolhido foi "+carro4.getNome());
                                   System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                   System.out.println(" o veiculo tem "+carro4.getKm_rodados()+" rodados.");
                                   System.out.println("quantidade disponivel é "+carro4.getQtd());

                                  }
                                  }
                                  else if(escolha == 5)
                                  {
                                    if(carro5.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{
                                    int resul = carro5.getQtd()- 1;
                                    carro5.setQtd(resul);

                                   System.out.println("o seu nome é "+usuario.getNome());
                                   System.out.println("o carro escolhido foi "+carro5.getNome());
                                   System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                   System.out.println(" o veiculo tem "+carro5.getKm_rodados()+" rodados.");
                                   System.out.println("quantidade disponivel é "+carro5.getQtd());

                                  }
                                  }
                                  else if(escolha == 6)

                                  {
                                    if(carro6.getQtd()==0){  
                                        
                                      System.out.println("o veiculo escolhido nao esta disponivel em estoque! ");

                                    }else{
                                    int resul = carro6.getQtd()- 1;
                                    carro6.setQtd(resul);

                                   System.out.println("o seu nome é "+usuario.getNome());
                                   System.out.println("o carro escolhido foi "+carro6.getNome());
                                   System.out.println(" a data do alugel foi "+usuario.getDtalu()); 
                                   System.out.println(" o veiculo tem "+carro6.getKm_rodados()+" rodados.");
                                   System.out.println("quantidade disponivel é "+carro6.getQtd());

                                  }
                                  }
                            
                            }
                       
                   }else{
                    
                   }
            }

    
}
