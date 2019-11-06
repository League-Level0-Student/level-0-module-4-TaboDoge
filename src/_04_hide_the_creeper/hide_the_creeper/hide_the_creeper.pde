       import javax.swing.JOptionPane;
       PImage tree;     //at the top of your program

void setup() {
   PImage treetops = loadImage("626-351.jpg");  
           size(626, 351);
   background(treetops);     
tree=loadImage("tree.png");   
   tree.resize(60, 60);  
}
void draw() {


image(tree, 374 - 30, 350 - 30); 
if (mouseX > 329 && mouseX < 416 && mouseY > 311){
  if(mousePressed){
  fill(#057126);
   ellipse(mouseX,mouseY,30,30);
   JOptionPane.showMessageDialog(null, "you found it!");
  }
}
else {
  if (mousePressed){
  fill(#AF0000);
  ellipse(mouseX,mouseY,30,30);
  }
}
}
