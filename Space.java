class Space
{
	public static void main(String args[]){
		String s="Mr johns smith";
			//int n=s.length();
		//replaceSpaces(s.toCharArray(),n);
		System.out.println(method2(s));
    }
public static void replaceSpaces(char[] str, int length)  {
	int spaceCount=0,newLength, i=0;
	for(i=0;i<length;i++){
		if(str[i]==' ')
		{
			spaceCount++;
		}
	}
	newLength=length+spaceCount*2;
	//str[newLength]='\0';
	for(i=length-1; i>=0 ; i--){
		if(str[i]==' '){
			str[newLength-1]='0';
			str[newLength-2]='2';
			str[newLength-3]='%';
			newLength=newLength-3;
		}
		else{
		  str[newLength-1]=	str[i];
		  newLength=newLength-1;
		  
		}
	}
}

public static String method2(String s)
{
	
	StringBuilder s1 = new StringBuilder();
	for( char c : s.toCharArray()){
	if(c==' '){
		s1.append("%20");
	}
	else{
		s1.append(c);
	}
   }
   return s1.toString();
}
	

	
}
