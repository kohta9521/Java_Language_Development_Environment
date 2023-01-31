package sample.game;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public Gun gun = new Gun();

public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2d)g;
    g2.clearRect(0, 0getWidth(), getHeight());
    gun.draw(g2);
}

public void update(Graphics g){
    paint(g);
}