
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphics extends JPanel{
  private Point lastPoint;
  public graphics(){
    addMouseListener(new MouseAdapter(){
          public void mousePressed(MouseEvent e){
            lastPoint = new Point(e.getX(),e.getY());
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
          frame.getContentPane().add(new graphics(), BorderLayout.CENTER);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400,300);
          frame.setVisible(true);

      }
    }


