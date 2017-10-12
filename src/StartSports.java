import Sports.*;

public class StartSports {
    public static void main(String[] args){

        Sports soccer = new Soccer();
        Sports boxing = new Boxing();
        Sports athletics = new Athletics();

        start(soccer);
        start(boxing);
        start(athletics);
    }

    public static void start(Sports sports){
        System.out.println("====================");
        sports.principle();
        sports.sportsName();
        sports.playerNum();
        sports.doPlay();
    }
}
