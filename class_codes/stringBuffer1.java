public class stringBuffer1
{
	public static void main(String args [])
	{
		String x = "vaibhav";
		String y = "vaibhav";
		String z = new String("vaibhav");
		
		System.out.println(System.identityHashCode(x)); //1
		System.out.println(System.identityHashCode(y)); //1
		System.out.println(System.identityHashCode(z)); //2

		x = x.concat(y);
		System.out.println(System.identityHashCode(x)); //3



		StringBuffer p = new StringBuffer(x);
		StringBuffer q = new StringBuffer("vaibhav");
	        StringBuffer r = new StringBuffer("vaibhav");	

		System.out.println(System.identityHashCode(p)); //4
		System.out.println(System.identityHashCode(q)); //5
		System.out.println(System.identityHashCode(r)); //6
	
		p = p.append(q);
		System.out.println(System.identityHashCode(p)); //4

		
	}


}
