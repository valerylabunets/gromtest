
package functionstest;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class MyWindow extends JFrame
{
    private JLabel lblA;
    private JTextField txtA;
    private JLabel lblB;
    private JTextField txtB;
    private JLabel lblC;
    private JTextField txtC;
    private JButton btnCalc;
    private JLabel lblX1;
    private JLabel lblX2;
    public MyWindow()
    {
        lblA = new JLabel("a= ");
        lblB = new JLabel("b= ");
        lblC = new JLabel("c = ");
        txtA = new JTextField("0");
        txtA.setSize(100, 25);
        txtB = new JTextField("0");
        txtB.setSize(100, 25);
        txtC = new JTextField("0");
        btnCalc = new JButton("Вычислить");
        lblX1 = new JLabel();
        lblX1.setText("x1 = ");
        lblX2 = new JLabel();
        lblX2.setText("x2 = ");
        //здесь правило размещения
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout( new BorderLayout()  );
        //разместить - добавить элементы
        JPanel panel1 = new JPanel();
        panel1.setLayout( borderLayout );
        panel1.add(lblA,BorderLayout.WEST);
        panel1.add(txtA,BorderLayout.CENTER);
        this.add(panel1, BorderLayout.NORTH);
        JPanel panel2 = new JPanel();
        panel2.setLayout( new BorderLayout() );
        panel2.add(lblB,BorderLayout.WEST);
        panel2.add(txtB,BorderLayout.CENTER);
        this.add(panel2, BorderLayout.CENTER);
        //
        //this.add(lblC);
        //this.add(txtC);
        //this.add(btnCalc);
        JPanel panel3 = new JPanel();
        panel3.setLayout( new BorderLayout ());
        panel3.add(lblC,BorderLayout.WEST);
        panel3.add(txtC,BorderLayout.CENTER);
        panel3.add(btnCalc,BorderLayout.SOUTH);
        this.add(panel3,BorderLayout.SOUTH);
        ///this.add(lblX1);
        //this.add(lblX2);
        //размеры окна
        this.setSize(200,200);
        //надпись в заголовке окна
        this.setTitle("Вычисление корней кв.уравнения");
        //правило закрытия окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
