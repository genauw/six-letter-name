public class Name{
	
	String[] cons = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" };
	String[] vows = { "a", "e", "i", "o", "u"};
	
	public String randyCons(){
		return cons[(int)(Math.random() * cons.length)];
	}	
	public String randyVows(){
		return vows[(int)(Math.random() * vows.length)];
	}
	
	public void generate(){
		System.out.print(randyCons());
		System.out.print(randyVows());
		System.out.print(randyCons());
		System.out.print(randyVows());
		System.out.print(randyVows());
		System.out.print(randyCons());
	}
}