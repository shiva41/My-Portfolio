void arrange()

{	
    int j=1;
    int k=0;
    int[] arr = {6, 30, -9, -4, 5, -1,-2,-34,90,91};
    int [] arr1 = new int [arr.length];
    for(int i = 0 ; i < arr.length ; i++)
    {
           if(arr[i]>0)
           {
               arr1[j]=arr[i];
               j=j+2;
           }
            if(arr[i]<0)
            {
                   arr1[k]=arr[i];
                    k=k+2;
            }
    } 
        for(int i = 0 ; i < arr.length ; i++)
    {
           System.out.print(arr1[i]+" ");
     }
}