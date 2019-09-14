class Aplistack
{
	public static  void main(String[] args)
	{
		Tumpukan stack = new Tumpukan(10);
		stack.push(56);
		stack.baca();
		stack.push(45);
		stack.baca();
		stack.push(67);
		stack.baca();
		stack.push(83);
		while( !stack.isEmpty() )
		{
			long nilai = stack.pop();
			System.out.print(nilai);
			System.out.print (" ");
		}
		System.out.println(" ");

	}
}
