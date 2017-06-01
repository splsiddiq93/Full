public class Demo {
	public String backfront1(String s) {
		char[] a = s.toCharArray();
		int len = a.length-1;
		char temp;
		if (len > 3) {
			temp = a[0];
			a[0] = a[1];
			a[1] = temp;
			temp = a[len];
			a[len] = a[len - 1];
			a[len - 1] = temp;
		} else {
			temp = a[0];
			a[0] = a[2];
			a[2] = temp;
		}
		String b = new String(a);

		return b;
	}

	public static void main(String args[]) {
		String s = "help";
		Demo obj = new Demo();
		String r = obj.backfront1(s);
		System.out.println(r);
	}
}