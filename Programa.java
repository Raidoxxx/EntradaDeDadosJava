import javax.swing.*;

class Programa
{

  public static void main(String entrada[])
  {
    int num1, num2, quociente;
    double potencia;
    String text = "";

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

    quociente = num1 / num2;
    potencia = Math.pow(num1, num2);


    text = text + "Resto da divisão de " + num1 + " por "+ num2 +" = "+ quociente + " \n ";
    text = text + "Potencia: " + potencia + " \n ";
    JOptionPane.showMessageDialog(null, text);
  }


}