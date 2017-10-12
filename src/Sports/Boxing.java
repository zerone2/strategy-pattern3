package Sports;

import Play.GlovePlay;

public class Boxing extends Sports {
    public Boxing(){
        play = new GlovePlay();
    }

    public void playerNum() {
        int number = 1;
        System.out.println("팀원은 " + number + "명 입니다.");
    }

    public void sportsName(){
        System.out.println("===복싱===");
    }
}
