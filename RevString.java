import java.util.Scanner;
import java.util.Random;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class RevString
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";
		
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		//System.out.println("Reversed string is:");
		//System.out.println(reverse);
                Random numbr= new Random();
                 try {
                org.json.JSONObject newData = new org.json.JSONObject();
                System.out.println (newData.put("message",reverse));
                 System.out.println (newData.put("random",numbr.nextInt()));}
                    
                catch (Exception e ){System.out.println("Exception occured"+e);}
	}
}
