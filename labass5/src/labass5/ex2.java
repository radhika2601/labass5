package labass5;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="HeLlO";
		StringBuffer newStr=new StringBuffer(str1);
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isLowerCase(str1.charAt(i)))
			{
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			else if(Character.isUpperCase(str1.charAt(i)))
			{
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("string after case conversion :"+newStr);
	}

}
