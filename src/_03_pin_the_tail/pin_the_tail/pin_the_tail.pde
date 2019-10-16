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

}
