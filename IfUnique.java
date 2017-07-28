//Algorithm to implement if a string has all unique characters


class IfUnique {
	public static void main(String[] args) {
		
		//boolean method1= method1(args[0]);
		boolean method2= method2(args[0]);
		
		//System.out.println(method1);
		System.out.println(method2);
		
	}
	public static boolean method1(String s){
		for(int i=0; i< s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j)){
					return false;
				}
			}
		}
		return true;
		
	}
	public static boolean method2(String str)
	{
		if(str.length()>256)
			return false;
		boolean[] array=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(array[val])
				return false;
			array[val]=true;
		}
		return true;
	}
	
	
}