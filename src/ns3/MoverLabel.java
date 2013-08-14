/*
    MoverLabel mouseController = new MoverLabel();
        monitorLabel.addMouseListener(mouseController);  
        monitorLabel.addMouseMotionListener(mouseController); 
 */
package ns3;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author João
 */
    public class MoverLabel extends MouseAdapter implements MouseMotionListener{
        int baseX = -1;  
        int baseY = -1;  
      
    @Override
        public void mouseDragged(MouseEvent e) {  
            Component b = e.getComponent();
            JPanel p = (JPanel) b.getParent();
            if ((this.baseX != -1) && (this.baseY != -1)) {  
                int x = b.getX() + e.getX() - this.baseX;  
                int y = b.getY() + e.getY() - this.baseY;  
                b.setLocation(x, y);  
                p.repaint();
            }
        }  
    
    @Override
        public void mouseMoved(MouseEvent e) {
            //Component b = e.getComponent();
            //JPanel p = (JPanel) b.getParent();
            //if( (((Label)b).getLink() != null) && ( ((Label)(((Label)b).getLink())).getLink() != null) )
               // ((PrincipalFrame)p.getParent()).manterLinks();
        }
    @Override
        public void mousePressed(MouseEvent e) {
            this.baseX = e.getX();  
            this.baseY = e.getY();
        }  
    @Override
        public void mouseReleased(MouseEvent e) {  
            this.baseX = -1;  
            this.baseY = -1;
        }  
    
    @Override
        public void mouseExited(MouseEvent e) {
        
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            
        }
    }  