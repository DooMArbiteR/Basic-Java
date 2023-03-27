
package guinew;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GuiNew implements ActionListener{
        
 private int count = 0; 
 JLabel label;
    
 public GuiNew(){
    JFrame frame =new JFrame();
    
    JButton button = new JButton("Click me");
    button.addActionListener(this);
    label = new JLabel("number of clicks: 0");
    
    
    JPanel panel =new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);
    
    frame.add(panel,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Our Gui");
    frame.pack();
    frame.setVisible(true);
     
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GuiNew();
    }
   @Override
   public void actionPerformed(ActionEvent e){
    count++;
    label.setText("number of clicks" +count);
   
   }
}
