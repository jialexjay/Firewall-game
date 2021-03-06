package com.game.src;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.entities.FriendEntity;

public class Wall implements FriendEntity{
	private int x;
	private int y;
	private Textures text;
//	private int numHits; //to be implemented if walls can take multiple collisions before being removed.
	private Engine game;
	private Controller controller;
	
	public Wall(int x, int y, Textures text, Controller controller, Engine game)
	{
		this.setX(x);
		this.setY(y);
		this.text = text;
		this.controller = controller;
		this.game = game;
	}
	public Rectangle getBounds()
	{
		return new Rectangle((int)x,(int)y,32,32);
	}
//	public boolean gotHit()
//	{
//		if()/*collision occurred*/
//		{
//			//numHits++;
//			return true;
//		}
//			return false;
//	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
//	public int numTimesHit()
//	{
//		return numHits;
//	}
//	
	public void tick()
	{

	}
	
	public void render(Graphics g)
	{
		g.drawImage(text.wall, x, y, null);
	}
}
