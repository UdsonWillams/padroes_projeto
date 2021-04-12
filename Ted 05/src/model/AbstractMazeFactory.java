package model;

public abstract class AbstractMazeFactory{

	public void makeMaze() {
		System.out.println("Maze created");
	}

	public void makeWall() {
		System.out.println("Wall created");

	}

	public void makeRoom() {
		System.out.println("Room created");

	}

	public void makeDoor() {
		System.out.println("Door created");

	}
}
