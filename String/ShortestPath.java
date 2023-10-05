package String;

public class  ShortestPath {

    public static float  getshortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();++i){
char dir=str.charAt(i);
if(dir=='W'){
    x--;
}
else if(dir=='E'){
 x++;   
}
else if(dir=='N'){
    y++;
}
else{
    y--;
}





        }
        float X2=x*x;
float Y2=y*y;
return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String str="WENSENSWE";
System.out.println(getshortestpath(str));
    }
}
