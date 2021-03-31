import processing.core.PApplet;

public class Processing_4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int first = 0;
    int second = 0;
    int third = 0;
    int forth = 0;
    public static void main(String[] args){
        PApplet.main("Processing_4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup(){
//called once
    }

    @Override
    public void draw() {

//        paintWhite();
        drawFirstCircle();
        drawSecondCircle();
        drawThirdCircle();
        drawForthCircle();

    }

    private void drawFirstCircle() {
        ellipse(first,96,10,10);
        first++;
    }
    private void drawSecondCircle() {
        ellipse(second,192,10,10);
        second+=2;
    }
    private void drawThirdCircle() {
        ellipse(third,288,10,10);
        third+=3;
    }
    private void drawForthCircle() {
        ellipse(forth,384,10,10);
        forth+=4;
    }


//    private void paintWhite() {
//        background(255);
//    }
}
