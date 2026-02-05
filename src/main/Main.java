package main;

import javax.swing.JFrame;

public class Main {
    static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("nush ce fac");

        GamePanel gamepanel = new GamePanel();
        window.add(gamepanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamepanel.startgameThread();
    }
}