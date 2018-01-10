package castle;
//怪兽属性
public class Monster {
    
	protected String monster;//怪兽名称；
	protected int Mglod;//怪兽掉落的金钱；
	protected int Mhp;//怪兽生命值；
	protected int Mad;//怪兽战斗力；
	protected int Mxp;//人物会获得经验值；
	

	public Monster(String monster, int mglod, int mhp, int mad, int mxp) {
	super();
	this.monster = monster;
	Mglod = mglod;
	Mhp = mhp;
	Mad = mad;
	Mxp = mxp;
}

	public String getMonster() {
	return monster;
}

public void setMonster(String monster) {
	this.monster = monster;
}


	@Override
public String toString() {
	return "您偶遇到的怪兽是"+monster+"它的属性是[ 生命值=" + Mhp + ",攻击力=" + Mad+ "] " +
			"你用自己的魅力征服了怪兽，嗯就是这么自信 [金钱+" + Mglod + ", 经验值+" + Mxp + "]";
   }
}
