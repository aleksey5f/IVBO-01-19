package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Matches extends JFrame {
    private int a=0;
    private int b=0;
    private Matches(){
        super("AC Milan vs Real Madrid");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        JButton but3 = new JButton("End");
        final JLabel lab1 = new JLabel("Result: "+0+" X "+0);
        final JLabel lab2 = new JLabel("Last Scorer: "+"N/A");
        final JLabel lab3 = new JLabel("Winner: "+"DRAW");
        setSize(512,360);
        Container cont = getContentPane();
        JPanel grid = new JPanel(new GridLayout(1,0,15,2));
        JPanel grid2 = new JPanel(new GridLayout(1,0,20,2));
        grid.add(but1);
        grid.add(but2);
        grid.add(but3);
        grid2.add(lab1);
        grid2.add(lab2);
        grid2.add(lab3);
        cont.add(grid,BorderLayout.NORTH);
        cont.add(grid2,FlowLayout.CENTER);
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                a++;
                lab1.setText("Result: "+a+" X "+b);
                lab2.setText("Last Scorer: "+"AC Milan");
            }
        });
        but2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                b++;
                lab1.setText("Result: "+a+" X "+b);
                lab2.setText("Last Scorer: "+"Real Madrid");
            }
        });
        but3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(a>b){
                    lab3.setText("Winner: "+"AC Milan");
                }
                if(a<b){
                    lab3.setText("Winner: "+"Real Madrid");
                }
                if(a==b){
                    lab3.setText("Winner: "+"Draw");
                }
                a=0;
                b=0;
                lab1.setText("Result: "+a+" X "+b);
                lab2.setText("Last Scorer: "+"N/A");
            }
        });
    }
    public static void main(String[] args){
        new Matches().setVisible(true);
    }
}
