package shiyan8;
import java.awt.*;
import java.awt.event.* ; //①载入进行事件处理所需的包
import javax.swing.*;
public class ButtonDemo extends JFrame implements ActionListener
{ //空白处②
    Button b;
    public ButtonDemo(String title){
        super(title);
        setLayout(new FlowLayout());
        b = new Button("Sample");
        b.addActionListener(this);
        add(b);
        pack();
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button press received.");
    }
    public static void main(String[] args){
        ButtonDemo myButton=new ButtonDemo("Test");
        myButton.setVisible(true);
    }
}
