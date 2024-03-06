public class Carro {
    private String cor;         
       private String modelo;
       private int ano;
       private int odometro;
       private String marca;
       private float valor;

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
       public void status(){
           JOptionPane.showMessageDialog(null, "O carro da marca "+this.marca+", modelo "+this.modelo+", dar cor "+this.cor+ ", do ano "+this.ano+ ", com um odometro marcando "+this.odometro+"Km, do valor "+this.valor+" está a venda");
           
       }
}
