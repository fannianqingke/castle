package castle;
//�����¼�
public class  Event  {
    
	Personae p=new Personae(10,20,5,0);//������������
	Monster m=new Monster("Slime",5,10,2,5);//��������ʷ��ķ
	
	protected Boolean A=true;
	protected int Hp=p.Hp;
	
	public void probability (){//�����г��ֹ���ĸ���Ϊ50%��
		int pro=(int)(Math.random()*10);
		if(pro>=1&&pro<=6){
		   this.A=false; 
		}
	}
   
	public void happen(){
		     probability ();
     if(A&&p.Hp!=0){
            System.out.println(m);
			p.Glod=p.Glod+m.Mglod;
			p.Hp=p.Hp-(p.Hp/p.Ad*m.Mad);
			p.Xp=p.Xp+m.Mxp;
		}	
	     if(p.Hp<=0){ //�������ֵС��0������HP��0�� 
	    	p.Hp=0;
	     }
	     if(p.Hp<=5){ //�������ֵС��5���������ѣ� 
		    	System.out.println("�ֵܣ�ע�����Ѫ�������˿�ȥ���Ҳ���Ѫ����");
		     }
	  System.out.println(p);
	}
  
	 public void trigger(String curr ){//��������ר���¼�
	   	 if( "С�ư�".equals(curr)){
	          	System.out.println("���ĵľƹݸ���5����ң����ڶ����Ⱥ�����[+ 5 ���]");
	          	p.Glod=p.Glod+5;
	          }
	          if( curr.equals("�鷿")){
	          	p.Xp=p.Xp+5;
	          	System.out.println("��������һ����˲�䱻���������������о��Լ����������Ļ�[+ 5 ����]");
	          }
	          if(curr.equals("����")){
	          	p.Hp=p.Hp+10;
	          	System.out.println("�㿴����һ�ŵ��ɴ�С��һ����ѽ�����ĵ����ӻ������ء��ƿ����Ѻ���ú����[+ 10 ����ֵ]");
	          }
	          if(curr.equals("������")){
	          	p.Ad=p.Ad+1;
	          	System.out.println("�㿴����ǰŮ�ѵ���Ƭ����ǽ�ϣ������е�����[+ 1 ������]");} 
	          if( curr.equals("�Ǳ���")){
	              	System.out.println("����ʲô��û�У�����֪������ֻ��ʫ��Զ��");
	              }
	          happen();
	          Hp=p.Hp;
	   }

}
