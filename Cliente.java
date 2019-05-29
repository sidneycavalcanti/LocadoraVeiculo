/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;
        
/**
 *
 * @author sidney
 */
public class Cliente {

 

    
     String nome;
     String end;
     String tel;
     String idade;
     String rg;
     String cpf;
     String dtalu;
     String dtdev;
     int statusloc;
     int id;

     
    
    /*public Cliente(int[] statusloc, String[] nome, String[] end, String[] tel, String[] idade, String[] rg, String[] cpf, String[] dtalu, String[] dtdev){
           
            super();
            this.statusloc = statusloc;
            this.nome = nome;
            this.end = end;
            this.tel = tel;
            this.idade = idade;
            this.rg = rg;
            this.cpf = cpf;
            this.dtalu = dtalu;
            this.dtdev = dtdev;
           
            
    
            }
     */
   
  public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtalu() {
        return dtalu;
    }

    public void setDtalu(String dtalu) {
        this.dtalu = dtalu;
    }

    public String getDtdev() {
        return dtdev;
    }

    public void setDtdev(String dtdev) {
        this.dtdev = dtdev;
    }

    public int getStatusloc() {
        return statusloc;
    }

    public void setStatusloc(int statusloc) {
        this.statusloc = statusloc;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente() {
    }
    
    
    // construtor
   public Cliente(int id,String nome, String end, String tel,String idade, String rg, String cpf, String dtdev,String dtalu)
    
    {
        this.id = id;
        this.nome = nome;
        this.end = end;
        this.tel = tel;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.dtdev = dtdev;
        this.dtalu = dtalu;
        //this.statusloc = statusloc;
    }
    
    
    //metodos
    
    /* public void cadCliente(int i, int valor, int statusloc, String nome, String end, String tel, String rg, String cpf,String dtalu,String dtdev) {

       Cliente clientes = new Cliente();
         
       
         {
            
            i++;
                    
            clientes.statusloc[i] = statusloc;
        
            clientes.nome[i] = nome;

            clientes.end[i] = end;
            
            clientes.tel[i] = tel;

            clientes.rg[i] = rg;
            
            clientes.cpf[i] = cpf;
            
            clientes.dtalu[i] = dtalu;

            clientes.dtdev[i] = dtdev;
            
            
            valor--;

        }

       System.out.println("Cliente cadastrado com sucesso.");

    }           
    */
    
   
    void clientesalugando()
    {
        
    }

  
       
        
        
 }
    

