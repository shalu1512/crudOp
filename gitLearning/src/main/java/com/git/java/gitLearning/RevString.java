package com.git.java.gitLearning;

public class RevString {
	void rev()
	{
		
		String a="shalu patel xyz ty";
		String str[]=a.split("");
		for(int i=a.length()-1;i>=0;i--)
		{
			a=str[i];
			System.out.print(a);
		}
		
	}
	public static void main(String[] args) {
		RevString rv= new RevString();
		rv.rev();
		
	}

}
