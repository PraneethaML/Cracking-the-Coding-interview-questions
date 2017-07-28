import java.util.*;

class IfPermutation  {
	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		check(s1,s2);
	//System.out.println(check(s1,s2));
	System.out.println(permutation(s1,s2));
	}
	public static boolean check(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false; 
		else
			return (sort(s1).equals(sort(s2)));
		
	}
	public static String sort(String str){
		char[] ch = str.toCharArray();
	 Arrays.sort(ch);
	 return new String(ch);
		
	}
	public static boolean permutation(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false; 
		int[] letters=new int[256];
		char[] chars=s1.toCharArray();
		for(char c: chars){
			letters[c]++;
		}
		for(int i=0;i<s2.length();i++)
		{
		   int cs=(int)s2.charAt(i);
			if(--letters[cs]<0)
				return false;
		}
		return true;
	
	}
}