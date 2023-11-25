package MyStacks;

public class TestCharStack {
	public static CharStack ob;

	public static void main(String[] args) {

		 String s= "({})";
		//String s = "({[]";
		System.out.println("this is out string " + s);
		ob = new CharStack(s.length());
		for (int i = 0; i < s.length(); i++)

		{
			char j = s.charAt(i);

			if (j == '(' || j == '{' || j == '[') {

				
				ob.push(j);
			}

			else if (j == ')' || j == ']' || j == '}')

			{

				if (ob.getvalueattopofstackarray() == '(') {
					ob.pop();
				}
				else if (ob.getvalueattopofstackarray() == '[') {
					ob.pop();
				}
				else if (ob.getvalueattopofstackarray() == '{') {
					ob.pop();
				}

			}

		}
		if(ob.gettop()==-1)
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("unbalanced");
		}
			

	}

}
