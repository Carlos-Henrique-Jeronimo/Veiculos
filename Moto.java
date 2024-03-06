public class Motos {
    public static void main(String[] args) {
        
    }
       private String cor;         
       private String modelo;
       private int ano;
       private int odometro;
       private String marca;
       private float valor;
       private int tanque;

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getTanque() {
        return tanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getOdometro() {
        return odometro;
    }

    public String getMarca() {
        return marca;
    }

    public float getValor() {
        return valor;
    }
    public boolean abastecer (int qtd){
        if(qtd>=tanque){
        JOptionPane.showMessageDialog(null, "A moto de tamanho de tanque "+this.tanque+" está com tanque cheio e com saldo positivo");
              
        return true;
        }else{
            JOptionPane.showMessageDialog(null, "O seu tanque precisa ser abastecido");
            
           return false; 
        } 
            
 
        
    }
   
    }
