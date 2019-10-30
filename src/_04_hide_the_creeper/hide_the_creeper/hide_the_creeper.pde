       PImage tree;     //at the top of your program

void setup() {
   PImage treetops = loadImage("626-351.jpg");  
   
   //in setup method
         //in setup method
           size(626, 351);
   background(treetops);     //in setup method
tree=loadImage("tree.png");   
   tree.resize(60, 60);  //in setup method
}

void draw() {

image(tree, mouseX - 30, mouseY - 30);     //in draw method

}
