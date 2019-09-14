import java.util.Scanner;
class Tumpukan
{
	private int ukuran;
	private char[] tumpukan;
	private int top;

	public Tumpukan(int s)
	{
		ukuran =s;
		tumpukan = new char[ukuran];
		top = -1;
	}

	public void push(char j)
	{
		tumpukan[++top]=j;
	}

	public char pop()
	{
		return tumpukan[top--];
	}

	public char peek()
	{
		return tumpukan[top];
	}

	public boolean isEmpty()
	{
		return (top ==-1);
	}

	public boolean isFull()
	{
		return(top==ukuran-1);
	}

	public void baca()
	{
		int i=top;
		while(i>=0)
		{
			System.out.print(tumpukan[i]);
			System.out.print("\n");
			i--;
		}
		System.out.println(" ");
	}
}

class ApliStackC
{
	public static void main(String[]args)
	{

		Tumpukan stack=new Tumpukan(10);
		stack.push('H');
		stack.push('A');
		stack.push('L');
		stack.push('O');
		stack.baca();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.baca();
		stack.push('S');
		stack.push('O');
		stack.push('B');
		stack.push('A');
		stack.push('T');
		stack.baca();
		stack.pop();
		stack.pop();
		stack.baca();
		stack.pop();
		stack.pop();

		while(!stack.isEmpty())
		{
			char nilai=stack.pop();
			System.out.print(nilai);
			System.out.print("\n");
		}
		System.out.println(" ");
	}
}

