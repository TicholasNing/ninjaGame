package main;

import javafx.scene.Node;
import javafx.scene.image.Image;

public class Character extends GameObject/* extends ImageView*/{
	
	private Node view;
	private int x, y;
	private int score;
	private BlockDir blockDirection;
	private Image sprite;
	private boolean alive;
	
	public Character (Node view){
		this.view = view;
		alive = true;
		blockDirection = BlockDir.rest;
	}
	
	public void update(){
		
	}
	
	public Image getSprite() {
		return sprite;
	}
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public BlockDir getBlockDirection() {
		return blockDirection;
	}

	public void setBlockDirection(BlockDir blockDirection) {
		this.blockDirection = blockDirection;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
