package shiyan8;
import javax.swing.*; //载入JFrame所在的包
import java.awt.*;
import java.awt.event.*  ;  //空白处①
public class SimpleEventDemo extends JFrame {
    public SimpleEventDemo() {
        JButton jbtOK = new JButton("OK");
        setLayout(new FlowLayout());
        add(jbtOK);
        OKListener ak=new OKListener(); // 空白处②，定义监听器
        jbtOK.addActionListener(ak); //  空白处③，按钮增加单击事件
    }
    /** Main method */
    public static void main(String[] args) {
        JFrame frame = new SimpleEventDemo();
        frame.setTitle("SimpleEventDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 80);
        frame.setVisible(true);
    }
}
class OKListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("It is OK");
    }
}
