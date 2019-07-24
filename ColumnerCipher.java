import java.util.*;
class CalumnerCipher
{
	
	public static void main(String args[])
	{
		String plaintext=args[0];
		String key=args[1];
		char temp;
		int temp2=0;
		String ciphertext=new String();
		char plaintextarray[]=plaintext.toCharArray();
		char keyarray[]=key.toCharArray();
		int keylength=key.length();
		int msglenght=plaintext.length();
		
		char intermediate[][]=new char[keylength][keylength];
		for(int i=0;i<keylength;i++)
		{
			int flag=0;
			for(int j=0;j<keylength;j++)
			{
				if(i==0)
				{
					intermediate[i][j]=keyarray[j];
				}
				else
				{
					intermediate[i][j]=plaintextarray[flag];
					flag++;
				}
			}
		}
		for(int i=0;i<keylength;i++)
		{
			for(int j=i+1;j<keylength-1;j++)
			{
				if(keyarray[i]>keyarray[j])
				{	
					temp=keyarray[i];
					keyarray[i]=keyarray[j];
					keyarray[j]=temp;
				}
			}
		}
		for(int i=0;i<keylength;i++)
		{
			int temp1=0;
			if(keyarray[temp1]==intermediate[i][0])
			{
				 temp2=i;
			}
		}
		for(int i=1;i<keylength;i++)
		{
			ciphertext+=intermediate[i][temp2];
		}
			
		System.out.println(ciphertext);		
	}
}
