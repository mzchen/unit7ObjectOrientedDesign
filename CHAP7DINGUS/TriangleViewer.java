import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TriangleViewer
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
    JFrame frame;
    JPanel panel;

}
public class ClickListenerDos implements ActionListener
{
    public void actionPerformed( ActionEvent event )
    {
        label.setText( "Button " + event.getActionCommand() + " was clicked!"); 
    }
}