public class Hero extends GameObject {
  private int HP;
  private int DP;
  private int SP;
  private int currentHP;
  private boolean isHero;
  private Map map;

  public Hero(int posX, int posY,Map map) {
    super(posX, posY, "assets/hero-down.png");
    this.map = map;
    this.HP = 20 + (3 *((int) (Math.random() * 6) + 1));
    this.DP = 2 * ((int) (Math.random() * 6) + 1);
    this.SP = 5 + ((int) (Math.random() * 6) + 1);
    this.currentHP = this.HP;

  }
  public void moveUp() {
    setCostume("assets/hero-up.png");
    if (map.isThereMonster(getPosX(),getPosY() - 1)){
      setPosY(getPosY() - 1);
      System.out.println("fight");
    } else if (getPosY() > 0 && !map.isThereWall(getPosX(),getPosY() - 1)) {                    ////////&& !map.isThereMonster(getPosX() - 1,getPosY())) {
      setPosY(getPosY() - 1);
    }
  }

  public void moveDown() {
    setCostume("assets/hero-down.png");
    if (map.isThereMonster(getPosX(),getPosY() + 1)) {
      setPosY(getPosY() + 1);
      System.out.println("fight");
    }
    else if (getPosY() < 9 && !map.isThereWall(getPosX(),getPosY() + 1) ) {
      setPosY(getPosY() + 1);
    }
  }

  public void moveRight() {
    setCostume("assets/hero-right.png");
    if (map.isThereMonster(getPosX() + 1,getPosY())) {
      setPosX(getPosX() + 1);
      System.out.println("fight");
    }
    else if (getPosX() < 9 && !map.isThereWall(getPosX() + 1,getPosY())){
      setPosX(getPosX() + 1);
    }
  }

  public void moveLeft() {
    setCostume("assets/hero-left.png");
    if (map.isThereMonster(getPosX() - 1,getPosY())) {
      setPosX(getPosX() - 1);
      System.out.println("fight");
    }
    if (getPosX() > 0 && !map.isThereWall(getPosX() - 1,getPosY())){
      setPosX(getPosX() - 1);
    }
  }


  public boolean isHero() {
    return isHero;
  }



  public String hudStat() {
    String hudText = ("Hero HP: " + HP + "/" + currentHP + " | DP: " + DP + " | SP:" + SP );
    return hudText;
  }

}
