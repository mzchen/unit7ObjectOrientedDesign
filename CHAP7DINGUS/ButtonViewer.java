import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 140;
    private static final int FRAME_HEIGHT = 120;
    JFrame frame;
    JPanel panel;
    JButton buttona, buttonb;
    JLabel label;
    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();

        buttona = new JButton( "A" );
        panel.add(buttona);

        buttonb = new JButton( "B" );
        panel.add ( buttonb );

        label = new JLabel( "No button clicked" );
        panel.add( label );

        frame.add( panel );
        ActionListener listener = new ClickListener();
        buttona.addActionListener(listener);
        buttonb.addActionListener(listener);

        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event )
        {
            label.setText( "Button " + event.getActionCommand() + " was clicked!"); 
        }
    }
    public static void main(String [] args )
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}