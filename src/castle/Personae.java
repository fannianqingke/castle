package castle;
//��������
public class Personae   {
     
	protected int Glod;//��Ǯ
	protected int Hp;//����ֵ
	protected int  Ad;//ս����
	protected int Xp;//����ֵ
	

	public Personae(int glod, int hp, int ad, int xp) {
		super();
		Glod = glod;
		Hp = hp;
		Ad = ad;
		Xp = xp;
	}

	@Override
	public String toString() {
		return "��Ŀǰ����������Ϊ [��Ǯ=" + Glod + ", ����ֵ=" + Hp + ", ������=" + Ad + ", ����ֵ="
				+ Xp + "]";
	}
}
