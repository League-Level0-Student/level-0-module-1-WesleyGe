    boolean isBite=false;
void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#C12323);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#70AF5E);
    rect(176, 103, 12, 32);

    if(mousePressed){
     isBite=true;
    }
     if(isBite==true){
       fill(#C8CBC5);
    ellipse(mouseX, mouseY, 50, 50);
}
}
