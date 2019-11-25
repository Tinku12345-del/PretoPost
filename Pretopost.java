package Ques;
import java .util.*;
public class PrefixToPostfix {
	public static void main(String Args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter expression");
		String str=s.next();
		Stack st= new Stack();
		char ch[]=str.toCharArray();
		int l= ch.length;
		for(int i =l-1;i>=0;i--) {
			if(ch[i]=='/' || ch[i]=='*'||ch[i]=='-'||ch[i]=='+') {
				String str1 = (String) st.pop();
				String str2 = (String) st.pop();
				str= str1+str2+ch[i];
				st.push(str);
			}
			else {
				st.push(ch[i]+"");
			}
		}

		System.out.print(str);
		
	}

}
