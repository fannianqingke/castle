package castle;
//人物属性
public class Personae   {
     
	protected int Glod;//金钱
	protected int Hp;//生命值
	protected int  Ad;//战斗力
	protected int Xp;//经验值
	

	public Personae(int glod, int hp, int ad, int xp) {
		super();
		Glod = glod;
		Hp = hp;
		Ad = ad;
		Xp = xp;
	}

	@Override
	public String toString() {
		return "您目前的人物属性为 [金钱=" + Glod + ", 生命值=" + Hp + ", 攻击力=" + Ad + ", 经验值="
				+ Xp + "]";
	}
}
