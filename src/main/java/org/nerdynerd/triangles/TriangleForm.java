package org.nerdynerd.triangles;

import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TriangleForm extends JFrame {

    private JPanel contentPane;

    private int x1 =512;

    private int y1 = 109;

    private int x2 = 146;

    private int y2 = 654;

    private int x3 = 876;

    private int y3 = 654;

    private int x = 512;

    private int y = 382;

    private static Random random;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try
                {
                    random = new Random();
                    TriangleForm frame = new TriangleForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < 50000; i++)
        {
            int redColor = random.nextInt(255) + 1;
            int blueColor = random.nextInt(255) + 1;
            int greenColor = random.nextInt(255) + 1;
            g.setColor(new Color(redColor,blueColor,greenColor));
            g.drawLine(x, y, x, y);
            /*
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
             */
            int randomNumber = random.nextInt(3) + 1;
            int xDistance = 0;
            int yDistance = 0;
            if (randomNumber == 1)
            {
                xDistance = x - x1;
                yDistance = y - y1;
            }
            else if (randomNumber == 2)
            {
                xDistance = x - x2;
                yDistance = y - y2;
            }
            else if (randomNumber == 3)
            {
                xDistance = x - x3;
                yDistance = y - y3;
            }
            x = x - xDistance / 2;
            y = y - yDistance / 2;
        }
        g.drawString( "Sierpinski Triangle",462,484);
    }

    /**
     * Create the frame.
     */
    public TriangleForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1024, 768);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }



}