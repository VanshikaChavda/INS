class PlayfairCipher
{
	public static void main(String args[])
	{
		//int first=0,last=1;
		int length=0;
		char alphabet='A';
		String plaintext=new String(args[0]);
		String key=new String(args[1]);
		char key1[]=key.toCharArray();
		int keylength=key.length();
		char matrix[][]=new char[5][5];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(length<keylength)
				{
					matrix[i][j]=key1[length];
					length++;
				}
				else
				{
					if(key.indexOf(alphabet)>0)
					{
						alphabet++;
					}
					else
					{
						matrix[i][j]=alphabet;
						alphabet++;	
					}	
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("  "+matrix[i][j]);
			}
			System.out.println();
		}
	}
}
