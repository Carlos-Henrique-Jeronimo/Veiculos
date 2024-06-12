public class banco {     
 
private ArrayList<String> Nome = new ArrayList<String>();
private ArrayList<String> Email = new ArrayList<String>();
private ArrayList<Integer> Num_Conta = new ArrayList<Integer>();
private ArrayList<Double> Valor_Conta = new ArrayList<Double>();
 private int num_conta;


    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public ArrayList<String> getNome() {
        return Nome;
    }


    public void setNome(ArrayList<String> Nome) {
        this.Nome = Nome;
    }

    public ArrayList<String> getEmail() {
        return Email;
    }

    public void setEmail(ArrayList<String> Email) {
        this.Email = Email;
    }

    public ArrayList<Integer> getNum_Conta() {
        return Num_Conta;
    }

    public void setNum_Conta(ArrayList<Integer> Num_Conta) {
        this.Num_Conta = Num_Conta;
    }

    public ArrayList<Double> getValor_Conta() {
        return Valor_Conta;
    }

    public void setValor_Conta(ArrayList<Double> Valor_Conta) {
        this.Valor_Conta = Valor_Conta;
    }

 public boolean CriarConta(){
 
            
        Nome.add(JOptionPane.showInputDialog("Digite o nomo da pessoa cadastrada na conta"));
        Email.add(JOptionPane.showInputDialog("Digite o email da pessoa cadastrada na Conta"));
        Num_Conta.add(Integer.parseInt( JOptionPane.showInputDialog("Digite o numero conta (Por Favor, comece do numero 1)")));
   
        
      double valorinicial = 0;
       int index = Num_Conta.get(Num_Conta.size() - 1) - 1;
        
       setEmail(Email);
       setNome(Nome);
       setNum_Conta(Num_Conta);
    Valor_Conta.add(index, valorinicial);
     setValor_Conta(Valor_Conta);
      
       return false;
}

  void exibir(){
      
      if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{
        setNum_conta(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: ")));
             
   int index = num_conta - 1;
   
   if(Nome.get(index) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
      JOptionPane.showMessageDialog(null, "O seu email é:"+Email.get(index)+"\n"
              + "O seu nome é"+Nome.get(index)+"\n"
                      + "o numero da sua conta é: "+Num_Conta.get(index)+"\n"
                              + "o saldo da sua conta é: "+Valor_Conta.get(index));
   
   
   }
      }
}
  
  
  public boolean sacar(){
         if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{
           
 setNum_conta(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: ")));         
  int index = num_conta - 1;
  if(Nome.get(index) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
  double saque = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do saque: "));
  
      if (saque > Valor_Conta.get(index)) {
         JOptionPane.showMessageDialog(null, "O Saque nao poderar ser realizado, pois o saldo é insuficiente:");
      }
  
      else{
  double novo_valor_saque =  Valor_Conta.get(index) - saque;
      
Valor_Conta.remove(index);
Valor_Conta.add(index, novo_valor_saque);

  
    JOptionPane.showMessageDialog(null, "O novo saldo ficou:"+Valor_Conta.get(index));      
      }
  }
         }
    return false;
  
         
  }
  
  
  
  public boolean depositar(){
         if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{
               setNum_conta(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: ")));
             
  int index = num_conta - 1;
  if(Nome.get(index) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
  double deposito = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do deposito: "));
  
  double novo_valor = deposito + Valor_Conta.get(index);

Valor_Conta.remove(index);
Valor_Conta.add(index, novo_valor);

  
    JOptionPane.showMessageDialog(null, "O novo saldo ficou:"+Valor_Conta.get(index));      
         } 
         }
      
    return false;
  
  
  }
  
  public boolean editar(){
         if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{
               setNum_conta(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: ")));
             
   int index = num_conta - 1;
   if(Nome.get(index) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
       JOptionPane.showMessageDialog(null, "Esses sao seu dados atuais: O seu email é:"+Email.get(index)+"\n"
              + "O seu nome é"+Nome.get(index)+"\n"
                      + "o numero da sua conta é: "+Num_Conta.get(index)+"\n"
                              + "o saldo da sua conta é: "+Valor_Conta.get(index)); 
       
       Nome.remove(index);
       Email.remove(index);
       Num_Conta.remove(index);
       Valor_Conta.remove(index);
     
       String Nome = (JOptionPane.showInputDialog("Digite o  nome"));
        String Email = (JOptionPane.showInputDialog("Digite o email"));
       int Num_Conta = (Integer.parseInt( JOptionPane.showInputDialog("Digite o numero da conta: ")));
       
        
        this.Nome.add(index, Nome);
         this.Email.add(index, Email);
          this.Num_Conta.add(index, Num_Conta); 
         
         }
         }
    return false;
  
  }
    public boolean excluir(){
           if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{  
            setNum_conta(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: ")));
            int index = num_conta - 1;
            
            if(Nome.get(index) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
       JOptionPane.showMessageDialog(null, "Esses sao seu dados atuais: O seu email é:"+Email.get(index)+"\n"
              + "O seu nome é"+Nome.get(index)+"\n"
                      + "o numero da sua conta é: "+Num_Conta.get(index)+"\n"
                              + "o saldo da sua conta é: "+Valor_Conta.get(index)); 
       
       Nome.remove(index);
       Email.remove(index);
       Valor_Conta.remove(index);
       JOptionPane.showConfirmDialog(null, "A conta de numero "+index+1+" foi excluido");
       
       
       double valor = 0;
       Nome.add(index, "Nome excluido");
       Email.add(index, "email excluido");      
       Valor_Conta.add(index, valor);
           }
           }
    return false;
    }
  
    
    
    
    public boolean Transferir(){
    if(Num_Conta.isEmpty()){
      JOptionPane.showMessageDialog(null, "Não tem conta cadastrada");
      }
      
      else{
    int conta1 = Integer.parseInt(JOptionPane.showInputDialog("Digita o numero da conta que sera retirada o valor: "));
    int conta2 = Integer.parseInt(JOptionPane.showInputDialog("Digita o numero da conta que será adicioanda o valor: "));
    
    int index1 = conta1 - 1;
    int index2  = conta2 - 1;
    
    if(Nome.get(index1) == "Nome excluido" || Nome.get(index2) == "Nome excluido"){
   JOptionPane.showMessageDialog(null, "Essa conta foi excluida!");
   }
   
   else{
  
  double transferencia= Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da tranferencia: "));
  
  
  if(transferencia > Valor_Conta.get(index1)){
  
      JOptionPane.showMessageDialog(null, "Saldo insuficiente em uma das duas conta!");
  
  }
  
  else{
  double novo_valor1 = Valor_Conta.get(index1) - transferencia;

Valor_Conta.remove(index1);
Valor_Conta.add(index1, novo_valor1);

  
    JOptionPane.showMessageDialog(null, "O novo saldo da conta ficou:"+Valor_Conta.get(index1)); 
    
    double novo_valor2 = Valor_Conta.get(index2) + transferencia;

Valor_Conta.remove(index2);
Valor_Conta.add(index2, novo_valor2);

  
    JOptionPane.showMessageDialog(null, "O novo saldo da conta ficou:"+Valor_Conta.get(index2)); 
    
  }
    
    
    }
    
    }


return false;

    }
}