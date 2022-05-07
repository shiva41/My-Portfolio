void isRotation()
{
		String str1 = "ABCD";
		String str2 = "ABCD"; //ABCDABCD
		String temp = "";
		//concatenate the str1.
		temp = str1.concat(str1);
		//check if the temp has the str2/
	if(str1.length()==str2.length() && temp.contains(str2))	
    System.out.println("Rotation");
	
}