import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
 PImage donkey;
PImage tail;
void setup() {
donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png");
size(550, 406);


}
void draw() {
  background (donkey);
  tail.resize(80, 130);
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30);
rect(454, 75, 40 ,40);
if (mouseX < 30 & mouseY < 30){
  image(tail, 15, 15);
  
}

else if (mouseX < 488 & mouseY < 110 & mouseX > 455 & mouseX > 78){
  image(tail, 470, 90);
  
}
else{
 background(#E8F6FA);
  
}

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
