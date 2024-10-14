import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Practice1 {

    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JTextArea textArea;

    private JTextField textField;
    Scanner layoutOption = new Scanner(System.in);

    public static void main(String[] args) {
        Practice1 p = new Practice1();
    }

    public Practice1(){
        frame = new JFrame("Practice 1");

        System.out.println("Layout 1, or 2?");
        Integer layoutChoice = layoutOption.nextInt();
        int rand = (int) (Math.random() * 2);

        while(layoutChoice!=1 && layoutChoice!=2) {
            if(rand==0) {
                System.out.println("Invalid input. Try typing '1'.");
                layoutChoice = layoutOption.nextInt();
            }else{
                System.out.println("Invalid input. Try typing '2'.");
                layoutChoice = layoutOption.nextInt();
            }

        }

        if (layoutChoice == 1) {
            layoutOne();
        } else if (layoutChoice == 2) {
            layoutTwo();
        }




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public void layoutOne(){
        panel = new JPanel(new GridLayout(2, 2));
        label1 = new JLabel("Label 1!");
        button1 = new JButton("Button 1");
        label2 = new JLabel("Label 2!");
        button2 = new JButton("Button 2");


        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(label2);
        frame.add(panel);
    }

    public void layoutTwo(){
        panel = new JPanel(new BorderLayout());
        label1 = new JLabel("Label!");
        button1 = new JButton("Button 1");
        textField = new JTextField("This is a text field!");
        textArea = new JTextArea("This is a text area!");


        panel.add(label1, BorderLayout.WEST);
        panel.add(button1, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.CENTER);
        frame.add(panel);
    }


}
