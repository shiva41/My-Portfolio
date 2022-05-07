Check whether a string is a palindrome or not 
//same functionality as reverse string.



void checkPalindrome()
{
	String str = "BunBka";
	String temp = "";
	int size = str.length();
    System.out.println(size);
	for(int i = size-1 ; i >= 0 ; i--)
		{
			temp = temp+str.charAt(i);
		}
	if(temp.equalsIgnoreCase(str))
	{
		System.out.println(temp+": is a Palindrome");
	}
	else 
		System.out.println(temp+": is not a Palindrome");
}

//Number - check if its palindrome else find the nearest palindrome
boolean checkPalindrome(int number)
{
	int temp = number;
	int reverse=0 ;
	int remainder ;
	while (number!=0)
	{
		remainder = number%10;
		reverse = (reverse*10)+remainder;
		number = number/10;
	}
	//System.out.println(reverse);
	if(temp == reverse)
	{
		//System.out.println("Palindrome");
        return true;
	}
	else 
		//System.out.println("Not a palidrome");
        return false;
	
}    
    
    
    void checkNearestPalindrome()
{
//find difference between highest pali and lowest pali, subtract the highest with num and lowest with num , lower difference is the nearest palindrome
int number=8217;
int lnumber = number;
int hnumber = number;
int Hdiff;
int Ldiff;
//higher palindrome
while(!(checkPalindrome(hnumber)))
{
	hnumber=hnumber+1;
}
Hdiff = hnumber - number;
while(!(checkPalindrome(lnumber)))
{
	lnumber = lnumber-1;
}
Ldiff = number - lnumber;
if(Hdiff<Ldiff)
{
	System.out.println("Nearest Palindrome is : "+ hnumber);
}
else 
	System.out.println("Nearest Palindrome is : "+ lnumber);
}
