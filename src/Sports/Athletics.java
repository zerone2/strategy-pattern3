package Sports;

import Play.BodyPlay;

public class Athletics extends Sports {
    public Athletics(){
        play = new BodyPlay();
    }

    public void playerNum() {
        int number = 1;
        System.out.println("팀원은 " + number + "명 입니다.");
    }

    public void sportsName(){
        System.out.println("===육상===");
    }
}
