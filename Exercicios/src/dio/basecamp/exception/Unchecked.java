package dio.basecamp.exception;

import javax.swing.*;

public class Unchecked {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int div = Integer.parseInt(a) / Integer.parseInt(b);
            System.out.println(div);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel fazer a divisão: " + e.getMessage());
            e.printStackTrace();
        }


        System.out.println(a);
    }
}
