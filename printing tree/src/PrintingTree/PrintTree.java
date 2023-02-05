package PrintingTree;

public class PrintTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int j;
int k=1;
for (i=0;i<4;i++)
{
	for (j=i;j<4;j++)
	{
		System.out.print(k);
		System.out.print("\t");
		k=k+2;
	}
	System.out.println("");
}
	}

}
