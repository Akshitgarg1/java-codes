class GFG
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and cols:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();

		System.out.println("enter elements:");
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
}