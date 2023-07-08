PImage zombie;
int r = 255;
int g = 255;
int b = 255;
int rup = -3;
int gup = -5;
int bup = -7;
void setup() {
size(500,500);
zombie = loadImage("zombie.png");
zombie.resize(500,500);
image(zombie,0,0);
}
void draw() {
if(mousePressed){
r = r + rup;
if(r<=1 || r>=255){
rup = -rup;
}
g = g + gup;
if(g<=1 || g>=255){
gup = -gup;
}
b = b + bup;
if(b<=1 || b>=255){
bup = -bup;
}
}


fill(r,g,b);
ellipse(120,245,80,80);
ellipse(296,230,145,145);
fill(0,0,0);
ellipse(120,245,30,30);
ellipse(296,230,45,45);
}
