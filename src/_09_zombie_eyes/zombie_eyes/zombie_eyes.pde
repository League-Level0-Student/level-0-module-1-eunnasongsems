
void setup() {
size(500,500);

PImage face = loadImage("zombie.png");
face.resize(500,550);
image(face,0,0);

}
void draw(){
fill(mouseX,mouseY);
ellipse(170,250,90,70);
ellipse(350,250,90,70);
fill(#000000);
ellipse(170,250,25,25);
ellipse(380,250,25,25);


}
