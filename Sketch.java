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
 
   // All drawing methods
  public void draw() {
    drawGrass(0, 350, 400, 70, 0 ,255, 0);
    drawChimney(230, 90, 25, 50, 198, 109, 71);
    drawHouse(125, 200, 150, 150, 165, 22, 23);
    drawWindows(225, 215, 40, 40, 204, 255, 255);
    drawdoor(185, 300, 35, 50, 198, 109, 71);
    drawSun(25, 25, 100, 100, 255, 255, 0);
    drawFlower(0, 0, 10, 50, 247, 10, 208, 45, 325, 300);

  }
  /**
   * 
   * @param grassX  x value for the grass
   * @param grassY  y value for the grass
   * @param grassWidth the width value of the grass 
   * @param grassHeight the height value of the grass
   * @param grassColour1 the first colour for the grass in rgb
   * @param grassColour2 the second colour for the grass in rgb
   * @param grassColour3 the third colour for the grass in rgb
   */
  // Method to draw the grass
  public void drawGrass(float grassX, float grassY, float grassWidth, float grassHeight, float grassColour1,float grassColour2, float grassColour3){
    fill(grassColour1, grassColour2, grassColour3);
    rect(grassX, grassY, grassWidth, grassHeight);
  }

  /**
   * 
   * @param houseX x value for the house
   * @param houseY y value for the house
   * @param houseBase the value for the width of the house
   * @param houseHeight the value for the height of the house
   * @param houseColour1 the first colour for the house in rgb
   * @param houseColour2 the second colour for the house in rgb
   * @param houseColour3 the thrid colour for the house in rgb
   */
  // Method to draw the house
  public void drawHouse(float houseX, float houseY, float houseBase, float houseHeight, float houseColour1, float houseColour2, float houseColour3){
    // Code for the rectangle of the house
    fill(houseColour1, houseColour2, houseColour3);
    rect(houseX, houseY, houseBase, houseHeight);

    // Code for the triangle of the house
    fill(houseColour1, houseColour2, houseColour3);
    triangle(houseX - 35, houseY, houseX + 75, houseY - 120, houseX + 185, houseY);
  }

  /**
   * 
   * @param windowX x value for the windows
   * @param windowY y value for the windows
   * @param windowWidth the width value for the windows
   * @param windowHeight the height value for the windows
   * @param windowColour1 the red for the windows in rgb
   * @param windowColour2 the green for the windows in rgb
   * @param windowColour3 the blue for the windows in rgb
   */
  // Method to draw the windows
  public void drawWindows(float windowX, float windowY, float windowWidth, float windowHeight, float windowColour1, float windowColour2, float windowColour3){
    // Right window
    fill(windowColour1, windowColour2, windowColour3);
    rect(windowX, windowY, windowWidth, windowHeight);
    line(windowX, windowY + 20, windowX + 40, windowY + 20);
    line(windowX + 20, windowY, windowX + 20, windowY + 40);

    // Left window
    rect(windowX - 90, windowY, windowWidth, windowHeight);
    line(windowX - 90, windowY + 20, windowX - 50 , windowY + 20);
    line(windowX - 70, windowY, windowX - 70, windowY + 40);

    // Top window
    ellipse(windowX - 25, windowY - 85, windowWidth, windowHeight);
  }

  /**
   * 
   * @param doorX x value for the door
   * @param doorY y value for the door
   * @param doorWidth the width value for the door
   * @param doorHeight the height value for the door
   * @param doorColour1 the red for the door in rgb
   * @param doorColour2 the green for the door in rgb
   * @param doorColour3 the blue for the door in rgb
   */
  // Method to draw the door
  public void drawdoor(float doorX, float doorY, float doorWidth, float doorHeight, float doorColour1, float doorColour2, float doorColour3){
    fill(doorColour1, doorColour2, doorColour3);
    rect(doorX, doorY, doorWidth, doorHeight);
  }
  
  /**
   * 
   * @param chimneyX x value for the chimney
   * @param chimneyY y value for the chimney
   * @param chimneyWidth the width value for the chimney
   * @param chimneyHeight the height value for the chimney
   * @param chimneyColour1 the red for the chimney in rgb
   * @param chimneyColour2 the green for the chimney in rgb
   * @param chimneyColour3 the blue for the chminey in rgb
   */
  // Method to draw the chimney
  public void drawChimney(float chimneyX, float chimneyY, float chimneyWidth, float chimneyHeight, float chimneyColour1, float chimneyColour2, float chimneyColour3){
    fill(chimneyColour1, chimneyColour2, chimneyColour3);
    rect(chimneyX, chimneyY, chimneyWidth, chimneyHeight);
  }

  /**
   * 
   * @param sunX x value for the sun
   * @param sunY y value for the sun
   * @param sunWidth the width value for the sun 
   * @param sunHeight the height value for the sun
   * @param sunColour1 the red for the sun in rgb
   * @param sunColour2 the green for the sun in rgb
   * @param sunColour3 the blue for the sun in rgb
   */
  // Method to draw the sun
  public void drawSun(float sunX, float sunY, float sunWidth, float sunHeight, float sunColour1, float sunColour2, float sunColour3){
    fill(sunColour1, sunColour2, sunColour3);
    ellipse(sunX, sunY, sunWidth, sunWidth);
  }

  /**
   * 
   * @param flowerX initial x value for the flower
   * @param flowerY initial y value for the flower
   * @param flowerWidth the initial width value for the flower
   * @param flowerHeight the initial height value for the flower
   * @param flowerColour1 the initial amount of red for the flower in rgb
   * @param flowerColour2 the initial amount of green for the flower in rgb
   * @param flowerColour3 the initial amount of blue for the flower in rgb
   * @param flowerAngle the angle that the flower pedals will rotate in the loop
   * @param translateX the x value that will be translated in order to rotate the pedals in the same position
   * @param translateY the y value that will be translated in order to rotate the pedals in the same position
   */
  // Method to draw the flower
  public void drawFlower(float flowerX, float flowerY, float flowerWidth, float flowerHeight, float flowerColour1, float flowerColour2, float flowerColour3, float flowerAngle, float translateX, float translateY){
    // Code to draw the flower stem
    fill(flowerColour1 - 236, flowerColour2 + 209, flowerColour3 - 166);
    rect((float) (flowerX + 322.5), flowerY + 300, flowerWidth - 5, flowerHeight);
    
    // Loop to draw the flower pedals
    stroke(0);
    translate(translateX, translateY);
    for(int pedal = 1; pedal <= 9; pedal += 1){
      fill(flowerColour1, flowerColour2, flowerColour3);
      ellipse(flowerX, flowerY, flowerWidth, flowerHeight);
      rotate(radians(flowerAngle));
    } 

    // The center circle of the flower
    fill(flowerColour1 - 13, flowerColour2 + 245, flowerColour3 - 208);
    ellipse(flowerX, flowerY, flowerWidth, flowerHeight - 40);
  }
}