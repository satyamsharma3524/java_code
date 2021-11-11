import java.awt.*;
import javax.swing.*;

public class Gui {

    private static void createWindow() {
    
     //Create and set up the window
     JFrame frame = new JFrame ("simple GUI");
     frame.setPreferredSize(new Dimension(700, 500));

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JLabel textLabel = new JLabel("Im satyam, The pack() method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes. An alternative to the pack() method is to establish a frame size explicitly by calling the setSize() or setBounds() meth" ,SwingConstants.CENTER); 
     textLabel.setPreferredSize(new Dimension(300, 100));
     frame.getContentPane().add(textLabel, BorderLayout.CENTER);
     //Display the window
     frame.setLocationRelativeTo(null);
     frame.pack();
     frame.setVisible(true); 
    }

    public static void main(String[] args) {
        createWindow();
    }

}