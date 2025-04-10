import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		char ch[]=str.toCharArray();
		int upcount=0;
		int lowcount=0;
		int numcount=0;
		int splcount=0;
		for(int i=0;i<len;i++){
		    if(ch[i]>='a'&& ch[i]<='z'){
		        upcount++;
		    }
		    else if(ch[i]>='A'&& ch[i]<='Z'){
		        lowcount++;
		    }
		    else if(ch[i]>='0'&& ch[i]<='9'){
		        numcount++;
		    }
		    else{
		        splcount++;
		    }
		}
		System.out.println(upcount);
		System.out.println(lowcount);
		System.out.println(numcount);
		System.out.println(splcount);
	}
}
