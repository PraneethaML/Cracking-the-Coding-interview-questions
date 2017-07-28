
public class IsSubstring {
public static void main(String[] args)
{
	//System.out.println("enter 2 words");
	//String s1= new String(args[0]);
	//System.out.println("enter second word");
	//String s2= new String(args[1]);
	System.out.println(isRotation(args[0],args[1]));
	
	
}

private static boolean isRotation(String s1, String s2) {
	// TODO Auto-generated method stub
	if(s1.length()==s2.length()){
		String s3=s1+s1;
		System.out.println(s3);
		return isSubstring(s3,s2);
	}
	return false;
}

private static boolean isSubstring(String s3, String s2) {
	// TODO Auto-generated method stub
	if(s3.contains(s2)){
		return true;
	}
	return false;
}
}