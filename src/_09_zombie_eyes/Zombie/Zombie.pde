  void setup(){
    size(500, 500);   
PImage face = loadImage("zombieEyes.png");
face.resize(500, 500);
image(face, 0, 0);
face.resize(500, 500);
fill(#D81661);
ellipse(210, 125, 100, 100);
ellipse(310, 130, 100, 100);
fill(#000000);
ellipse(210, 125, 12, 12);
ellipse(310, 130, 12, 12);

  
}


    void draw(){
if(mouseX==210){
    fill(#3C6ACB);
  ellipse(210, 125, 100, 100);  
  fill(#3C6ACB);
    ellipse(310, 130, 100, 100);

fill(#000000);
ellipse(210, 125, 12, 12);
ellipse(310, 130, 12, 12);
    }
    }
