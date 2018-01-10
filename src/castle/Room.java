package castle;

import java.util.HashMap;

public class Room{
	
	
    private   String description;  //创建房间描述；
    private HashMap<String,Room>exits=new HashMap<String,Room>();

    public Room(String description) //构造房间
    {
        this.description = description;
    }
    public void setExit(String dir,Room room){ //设置房间出口
    	exits.put(dir, room);
    }
    
    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc(){//描述房间出口
    	StringBuffer sb=new StringBuffer();
    	for(String dir :exits.keySet()){
    		  sb.append(dir);
    		  sb.append(' ');
    	}
    	return sb.toString();
    }    
    
   
    
    public Room getExit(String direction){
    	  
    	return exits.get(direction);
    	
    }
}
