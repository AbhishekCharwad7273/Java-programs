//8>remove white spaces in string




class StringSpace
 {
	public static void main(String[] args)
	{
		String str = "  Abhi  Anil  Charwad";
	
		str = str.replaceAll("\\s", "");
	
		System.out.println(str);
	}
}
