void removeDuplicate()
{
	String str = "aaaaanbadf";
	str.toLowerCase();
	String newStr = "";
	int size = str.length();
	char[] ch = str.toCharArray();
    ArrayList<Character> al= new ArrayList<Character>();
    for(int i = 0 ; i < size ; i++)
    {
           for(int j = i+1 ; j < size ; j++)
           {   
               if(al.contains(ch[j]))
               {
                   break;
               }
                   if(ch[i]!=ch[j])
                  {
                     al.add(ch[j]);
                  }
               }
           }
          
        for(int i=0 ; i < al.size() ; i++)
        System.out.print(al.get(i));
    
    }