package principal;

import javax.swing.JOptionPane;
import model.Veiculo;


public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        
        veiculo.setDistancia(Integer.parseInt(JOptionPane.
            showInputDialog("Digite a distancia: ")));
        
        veiculo.setLitros(Integer.parseInt(JOptionPane.
            showInputDialog("Digite quantos litros foram gastos: ")));
        
        JOptionPane.showMessageDialog(null,"O consumo de combustível foi de " + veiculo.getConsumo());
    }
}
