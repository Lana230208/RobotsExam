package exam;

public class Robot {
    private String name = "?";
    private int life = 0;
    private String activeLetters = "?";
    // В конструкторе запоминаем переданные параметры через this.
    Robot(String name, int life) {
        this.name = name;
        this.life = life;
        this.activeLetters = Letters.random5();
    }
    public void print() {
//        System.out.println(String.format("name: %s, life: %d", this.name, this.life));
        System.out.println(String.format("name: %s, life: %d, letters:%s", this.name, this.life, this.activeLetters));
    }
    public boolean move(String letter) {
        if (this.activeLetters.contains(letter)) {
            this.life = this.life - 20;
// Delete used letter to not repeat it anymore
            this.activeLetters = this.activeLetters.replace (letter, "");
        } else{
            System.out.println(String.format("%s: this letter isn't in activeLetters", this.name));
        }
        return this.life > 0;
        //Life > 0, means that robot is alive
    }
}
