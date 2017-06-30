import javax.swing.*;
import java.awt.*;

public class Circle extends Canvas {

    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(500,210,150,150);
        g.setColor(Color.blue);
        g.fillOval(540,250,30,30);
        g.fillOval(580,250,30,30);
        g.setColor(Color.red);
        g.fillArc(400, 300, 200,50,90,45);

        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Circle");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add(canvas);
        win.setVisible(true);
    }
}
