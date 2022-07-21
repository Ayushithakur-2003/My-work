import static java.awt.Cursor.CROSSHAIR_CURSOR;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class graphics extends JPanel{
  private Point lastPoint;
  public graphics(){
    addMouseListener(new MouseAdapter(){
          public void mousePressed(MouseEvent e){
            lastPoint = new Point(e.getX(), e.getY());
          }
      });

      addMouseMotionListener(new MouseMotionAdapter(){
          public void mouseDragged(MouseEvent e){
             Graphics g = getGraphics();
             g.drawLine(lastPoint.x,lastPoint.y,e.getX(),e.getY());
             g.dispose();
          }
      });
     
          
      }
      public static void main(String[] args) {
          JFrame frame = new JFrame("Canvas");
          JButton b=new JButton("COLOR");  
          b.setBounds(40, 40, 100, 100); 
          frame.add(b);
          frame.getContentPane().add(new graphics(), BorderLayout.CENTER);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400,300);
          frame.setVisible(true);
          frame.setForeground(Color.black);
          frame.setCursor(CROSSHAIR_CURSOR);

      }
    }


