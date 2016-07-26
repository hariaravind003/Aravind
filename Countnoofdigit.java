import javax.swing.JOptionPane;
public class Count
{
	String output=" ";
	public int count_digits(int x)
	{
		output+=x+"\n";
		if (x<10)
			return 1;
			else
				output+=1+count_digits(x/10);
				return 1+count_digits(x/10);
	}
	public void Result()
	{
		JOptionPane.showMessageDialog(null,output,"output",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
