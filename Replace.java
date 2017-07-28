class Replace {
public static void main(String[] args) {
	String s="Mr  John  Smith  ";
		int length=s.length();
		String[] parts=s.split(" ");
		for(int i=0; i<length; i++)
		{
		 System.out.println(parts[i]+"%20");
		}
}
	
}