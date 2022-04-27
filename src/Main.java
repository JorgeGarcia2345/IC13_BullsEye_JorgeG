/*
    GUI

    AWT:
    - Abstract Windowing Toolkit
    - Button
    - TextFields

    Swing:
    - Menus
    - Drop-Downs
    - 2D graphics
                                                                                          480x480
            2 Containers:                                                   BOX: (0,0)              (479, 0)
            A) JFrame - (outer window) Outer Circle in Target
                - Title
                - Size (in Pixels)                                               (0,479)            (479, 479)
            B) JPanel - (Inner Content)
                - Shapes
                - Drawing
                - Filling

    JavaFx:
    - 3D Graphic Support
    - One Application
    - Web Based - OR Mobile Device
    - CSS and HTML5








 */


import javax.swing.*;
import java.awt.*;

// EXTENDED JPANEL - CANVAS
public class Main extends JPanel {

    // Overriding the paint method to add things to our canvas
    // width -----------
    // height |
    /*
    @Override
    public void paint(Graphics canvas){

        int width = 700;
        int height = 700;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 7; i++) {
            if(i%2 == 0)
                canvas.setColor(new Color(255, 0, 0));
            else
                canvas.setColor(new Color(255, 255,255));
            canvas.fillOval(x, y, width, height);
            x += 50;
            y += 50;
            width -= 100;
            height -= 100;
        }
    }

     */

    public void paint(Graphics canvas){

        int width = 350, height = 350;
        int x = 60, y = 60;

        for (int i = 0; i < 7; i++) {
            if(i % 2 == 0)
                canvas.setColor(Color.RED);
            else
                canvas.setColor(Color.WHITE);
            canvas.fillOval(x, y, width, height);
            width -= 50;
            height -= 50;
            x += 25;
            y += 25;
        }
    }

    public static void main(String[] args) {

        // Instiate a new JFrame ( outer window )
        JFrame frame =  new JFrame();
        frame.setTitle("Bullseye!");
        frame.setSize(1000, 1000);


        // by default, frames are invisible
        frame.setVisible(true);
        // icon: Duke - Java Icon

        // add panel to the fram
        frame.add(new Main());


    }
}
