package com.game.src;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.entities.FriendEntity;

public class Bullet extends GameObject implements FriendEntity{
	
	private Textures text;
	private Engine game;
	private Controller controller;
	
	public Bullet(double x, double y, Textures text, Controller controller, Engine game)
	{
		super(x,y);
		this.text = text;
		this.controller = controller;
		this.game = game;
	}
	public Rectangle getBounds()
	{
		return new Rectangle((int)x,(int)y,32,32);
	}
	public int getY() {
		return (int)y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getX() {
		return (int)x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void tick()
	{
		y-=7;
		if(y<0)
		{
			controller.removeEntity(this); //removes bullet if it goes off the screen.
		}
	}
	
	public void render(Graphics g)
	{
		g.drawImage(text.bullet, (int)x, (int)y, null);
	}
}
