package castle;
//��������
public class Monster {
    
	protected String monster;//�������ƣ�
	protected int Mglod;//���޵���Ľ�Ǯ��
	protected int Mhp;//��������ֵ��
	protected int Mad;//����ս������
	protected int Mxp;//������þ���ֵ��
	

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
	return "��ż�����Ĺ�����"+monster+"����������[ ����ֵ=" + Mhp + ",������=" + Mad+ "] " +
			"�����Լ������������˹��ޣ��ž�����ô���� [��Ǯ+" + Mglod + ", ����ֵ+" + Mxp + "]";
   }
}
