package castle;
//触发事件
public class  Event  {
    
	Personae p=new Personae(10,20,5,0);//创建人物属性
	Monster m=new Monster("Slime",5,10,2,5);//创建怪兽史莱姆
	
	protected Boolean A=true;
	protected int Hp=p.Hp;
	
	public void probability (){//房间中出现怪物的概率为50%；
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
	     if(p.Hp<=0){ //如果生命值小于0则人物HP归0； 
	    	p.Hp=0;
	     }
	     if(p.Hp<=5){ //如果生命值小于5则友情提醒； 
		    	System.out.println("兄弟，注意你的血量别浪了快去卧室补个血吧先");
		     }
	  System.out.println(p);
	}
  
	 public void trigger(String curr ){//触发房间专属事件
	   	 if( "小酒吧".equals(curr)){
	          	System.out.println("好心的酒馆给了5个金币，揣在兜里热乎乎的[+ 5 金币]");
	          	p.Glod=p.Glod+5;
	          }
	          if( curr.equals("书房")){
	          	p.Xp=p.Xp+5;
	          	System.out.println("你拿起了一本书瞬间被内容吸引，读完后感觉自己好像有了文化[+ 5 经验]");
	          }
	          if(curr.equals("卧室")){
	          	p.Hp=p.Hp+10;
	          	System.out.println("你看到了一张弹簧床小手一摸，呀！这插的电褥子还热着呢。掀开被窝后觉得很舒服[+ 10 生命值]");
	          }
	          if(curr.equals("武器店")){
	          	p.Ad=p.Ad+1;
	          	System.out.println("你看到了前女友的照片挂在墙上，心里有点蓝受[+ 1 攻击力]");} 
	          if( curr.equals("城堡外")){
	              	System.out.println("这里什么都没有，你深知陪伴你的只有诗和远方");
	              }
	          happen();
	          Hp=p.Hp;
	   }

}
