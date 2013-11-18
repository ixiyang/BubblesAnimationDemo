package com.example.bubbleanimationdemo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Bubble {
	private float x, y, speed;
	private Paint bubblePaint = new Paint();
	public static final int RADIUS = 10;
	public static final int MAX_SPEED = 10;
	public static final int MIN_SPEED = 1;

	public Bubble(float x, float y, float speed) {
		this.x = x;
		this.y = y;
		this.speed = speed < MIN_SPEED ? MIN_SPEED : (speed > MAX_SPEED
				? MAX_SPEED
				: speed);
		bubblePaint.setColor(Color.CYAN);
		bubblePaint.setStyle(Paint.Style.STROKE);
	}
	
	public void draw(Canvas canvas){
		canvas.drawCircle(x, y, RADIUS, bubblePaint);
	}
	
	public void move(){
		y-=speed;
	}
	
	public boolean isOutOfRange(){
		return (y+RADIUS)<0;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public Paint getBubblePaint() {
		return bubblePaint;
	}

	public void setBubblePaint(Paint bubblePaint) {
		this.bubblePaint = bubblePaint;
	}
	
	
}
