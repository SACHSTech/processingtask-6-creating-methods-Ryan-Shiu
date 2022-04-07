import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(66, 228, 253);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawGrass(0, 350, 400, 70);
  
  // define other methods down here.
  }

  public void drawGrass(float grassX, float grassY, float grassBase, float grassHeight){
    rect(grassX, grassY, grassBase, grassHeight);
    fill(0, 255, 0);
  }

  //public void drawHouse(float houseX, float houseY, float houseBase, float houseHeight)
}