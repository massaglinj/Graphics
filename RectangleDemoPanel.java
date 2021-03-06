import java.awt.Color;
import java.awt.Graphics;
public class RectangleDemoPanel extends MyPanel
{
        /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public RectangleDemoPanel()
    {
        super();
    }
        
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
            
        g.setColor(Color.BLACK);
            
        int startX = 10;
        int startY = 10;
            
        int endX = 280;
        int endY = 280;
            
        g.drawLine(startX, startY, endX, endY);
        
        startX += 30;
        startY += 30;
        
        endX += 40;
        endY += 40;
        
        g.fillRect(startX, startY, endX, endY);
    }
}
