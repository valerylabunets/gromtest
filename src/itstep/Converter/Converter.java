package itstep.Converter;

import javax.swing.*;

public class Converter {



        public static void main(String[] args) {
            JDialog.setDefaultLookAndFeelDecorated(true);
            String[] selectionValues = {"$", "€", "£"};
            String initialSelection = "Currency";
            String selection = (String) JOptionPane.showInputDialog(null, "Какая валюта вам нужна?",
                    "Обмен валют. Бета версия", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            String userCurrency = (String) JOptionPane.showInputDialog(null, "Какую валюту предложите?",
                    "Обмен валют. Бета версия", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            double cource = Double.parseDouble(JOptionPane.showInputDialog("Какой курс " + userCurrency + " относительно " + selection + " ?" + "\n" + "1" + userCurrency + " ="));
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Сколько " + userCurrency + " вы собираетесь обменять?"));
            JOptionPane.showMessageDialog(null, "При конвертации" + amount + userCurrency + " в " + selection + " Вы получите " + (cource * amount) + selection);

        }
    }
