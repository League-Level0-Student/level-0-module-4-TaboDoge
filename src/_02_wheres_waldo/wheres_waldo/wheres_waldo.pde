import ddf.minim.*;
import javax.swing.JOptionPane;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(630, 470);
  //size(700, 540);//
  image(waldo, 0, 0);
  //image(waldo, -150, 0);//
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
System.out.println(mouseY);//305, 279- 298
      // If the mouse is on Waldo, print “Waldo found!”
    if(mouseX == 305 & mouseY > 279 & mouseY < 298){
      
      JOptionPane.showMessageDialog(null, "You found him");
     
    }
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
