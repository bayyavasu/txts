package jartest;

public class getmessegetype {
public message getMsgType(String s)
{
	if(s.equals("Whatsapp"))
	{
		return new whatsapp();
	}
	else if(s.equals("Facebook"))
	{
		return new Facebook();
	}
	else
	{
		return new Gmail();
	}
}
}
