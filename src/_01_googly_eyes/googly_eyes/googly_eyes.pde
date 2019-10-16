void setup() {
   PImage face = loadImage("cat.jpg");
   size(184, 169);
    background(face);
}

void draw() {
  int x = mouseX;
  int y = mouseY;
  fill(#FFFFFF);
  ellipse(70, 85, 30, 30);
  ellipse(139, 85, 30, 30);
  if(x > 80){
    x = 80;
  }
  if (x < 61){
    x = 61;
    
  }
 if(y > 90){
    y = 90;
  }
 if(y < 83){
   y = 83; 
  }
  fill(000000);
  ellipse(x, y, 10, 10);
  ellipse(x+69, y, 10, 10);
  System.out.println(mouseY);
  System.out.println();
}
