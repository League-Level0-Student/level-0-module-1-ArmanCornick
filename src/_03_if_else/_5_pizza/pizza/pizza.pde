PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
noStroke();
size(500,500);    
fill(191,135,59);
ellipse(250,250,450,450);
fill(255,0,0);
ellipse(250,250,400,400);
fill(255,255,50);
ellipse(250,250,390,390);
pepperoni = loadImage("pepperoni.png");
olive = loadImage("olive.png");
mushroom = loadImage("mushroom.png");
pepperoni.resize(60,60);
olive.resize(50,50);
}
void draw() {
if(mousePressed){
image(pepperoni,200,220);
image(pepperoni,100,250); 
image(pepperoni,250,300);
image(pepperoni,350,250); 
image(pepperoni,290,150); 
image(pepperoni,140,280); 
image(pepperoni,170,280); 
image(mushroom,200,200); 
image(mushroom,250,250); 
image(mushroom,100,300); 
image(mushroom,100,100); 
image(mushroom,300,130); 
image(olive,250,100); 
image(olive,240,180); 
image(olive,220,400); 
image(olive,270,350); 
image(olive,100,250); 
image(olive,200,200); 
}
}
