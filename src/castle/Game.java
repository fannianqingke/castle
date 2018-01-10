package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private String curr;
    private HashMap<String, Handler> handlers=new HashMap<String, Handler>();
    Personae p=new Personae(10,20,5,0);//创建人物属性；
    Event event=new Event();   
    public Game() 
    {
    	handlers.put("bye", new HandlerBye(this));
    	handlers.put("help", new HandlerHelp(this));
    	handlers.put("go", new HandlerGo(this));
        createRooms();
    }

    private void createRooms()  //创造房间
    {
        Room outside, lobby, pub, study, bedroom,weaponstore;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        weaponstore=new Room("武器店");
       
        //	初始化房间的出口
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        outside.setExit("north",weaponstore );
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down", lobby); 
        
        currentRoom = outside;  //	从城堡门外开始(当前房间)；
    }

    private void printWelcome() {
        System.out.println("  ---------------------------------------");
        System.out.println(" |           欢迎来到城堡！                         |");
        System.out.println(" |       这是一个超级无聊的游戏。               |");
        System.out.println(" |      如果需要帮助，请输入 'help'       |");
        System.out.println("  ---------------------------------------");
		System.out.println(p);
        showPrompt();
    }

    // 以下为用户命令

    public void goRoom(String direction) //去下一个房间的出口方向；
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("是不是傻，脑门疼不疼，那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
	public void showPrompt(){  //显示提示
		  System.out.println("你在" + currentRoom);
		   curr= currentRoom.toString();
		   event.trigger(curr);  //触发房间专属事件
          System.out.print("出口有: ");
          System.out.print(currentRoom.getExitDesc()); //当前房间出口
          System.out.println();
	}


	public void play(){
		Scanner in=new Scanner(System.in);
	     while ( event.Hp!=0 ) {
	     		String line = in.nextLine();
	     		String[] words = line.split(" "); //以空格为分隔返回一个数组；
	     		Handler handler=handlers.get(words[0]);
	     		String value="";
	     		if(words.length>1)
                     value=words[1];
	     		if(handler!=null){
	     			handler.doCmd(value);
	     			if(handler.isBye())
	     			       break;
	     		} 
	      }
	       in.close();
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
        game.play();
        System.out.println("忆往昔峥嵘岁月，你可以考虑再来一次老铁");
	}
}
