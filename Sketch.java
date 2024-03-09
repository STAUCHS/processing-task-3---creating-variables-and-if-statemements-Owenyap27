import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  // variables!
   float hotdogX;
  float hotdogY;
  float hotdogsize;
  int currentHour;
  int currentMin;



  public void settings() {
	// put your size call here
  //background size
    size(800, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  // hotdog random place
    hotdogX = random(0,width);
    hotdogY = random(0,height);
    hotdogsize = random (25, 50);
   // hotdog color change depending on position
    if (hotdogX < width/2 ) {
      background(0, 0, 128); 
    }

    if (hotdogX > width/2 ) {
      background(0, 300, 0); 
    }

  }


 



  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  // clock
   public void draw() {
    currentHour = hour();
    currentMin = minute();
    text(currentHour, 50, 100);
    text(currentMin, 65, 100);

    // hotdog size change
    fill(196, 153, 61);
    ellipse(hotdogX+13, hotdogY, hotdogsize, hotdogsize*5);
    ellipse(hotdogX-13, hotdogY, hotdogsize, hotdogsize*5);
    fill (209, 60, 70);
    if (hotdogX > width/2 ) {
      fill(20, 60 ,100); 
    }
    
    ellipse(hotdogX, hotdogY, hotdogsize, hotdogsize*4);
    

   
    

    

	  

  }
  
  // define other methods down here.
}