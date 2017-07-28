class  Compression {
	
	public static void main(String[] args) {
	
	String input= args[0];
	
	int count=1;
	StringBuilder s= new StringBuilder();
	char found=input.charAt(0);
	for(int i=1; i<input.length(); i++){
	 if(input.charAt(i)==found){
	 count++;
	
	 }
	 else{
		 s.append(found);
		 s.append(count);
		 found=input.charAt(i);
	 count=1;
	
	 }
	 
 }
 s.append(found);
 s.append(count);
	 
	 
	
	System.out.println(s);
		
	}
}