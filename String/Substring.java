
public class Main
{
    public static String substring(String str , int si ,int ei){
         String substr="";
for(int i=si;i<ei;++i){
   
     substr+=str.charAt(i);
     si++;
        }
        return substr;
    }
	public static void main(String[] args) {
	    String str="hello brother";
	 
		System.out.println( substring(str ,2,5));
	}
}
//change the class Name or run it on online compiler.
//sks