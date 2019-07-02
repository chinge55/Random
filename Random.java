import java.util.concurrent.TimeUnit;
public class Random
{
		static int t1ran=0, t2ran=0;
	public static void main(String[] args) throws Exception
	{
	while(true)
	{
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						int i = 0;
						while(true)
						{
							i++;
							t1ran = i;
							if(i==1000)
								i=0;
						}
					}
				});
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						int i = 0;
						while(true)
						{
							i++;
							t2ran = i;
							if(i==1000)
								i=0;
						}
					}
				});
		t1.start();
		t2.start();
		TimeUnit.SECONDS.sleep(1);
		t1.stop();
		t2.stop();
		System.out.println("x="+t1ran+"y="+ t2ran);
	}
	}

}
