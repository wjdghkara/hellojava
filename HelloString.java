class HelloString{
	public static void main(String args[]) {
		String hello = "Hello,World!";
		String [] hello_split = hello.split(",");
		for(int i=0; i<hello_split.length; i++) {
			System.out.println(hello_split[i]);
		}
	}
}
