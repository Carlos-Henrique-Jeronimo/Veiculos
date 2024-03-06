public class Veiculos {
    public static void main(String[] args) {
        
        
        Carro c = new Carro();
        Motos m = new Motos();
        String marca, modelo, cor;
        int ano, odometro;
        float valor;
        int qtd, tanque;
        
        
        marca = JOptionPane.showInputDialog("Qual a marca do veículo? ");
        c.setMarca(marca);
        c.setModelo(JOptionPane.showInputDialog("Qual modelo do veículo? "));
        c.setCor(JOptionPane.showInputDialog("Qual a cor do seu carro? "));
        c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu carro: ")));
        c.setOdometro(Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem do seu carro: ")));
        c.setValor(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do seu carro: ")));
                
        c.status(); //chamar o método
        
        
        m.setTanque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de litros do tanque: ")));
        
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos litros sua moto está? "));
        m.abastecer(qtd);
        
    }
}
