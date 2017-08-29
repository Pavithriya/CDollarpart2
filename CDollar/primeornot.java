public  class  primeornot

{

protected static  void main(String  args[])

{


int  n =  Integer.parseInt(args[0]);

int  i;

for  ( i=2 ; i<=(n-1);i++)

{

if ((n%i)==0)
{
System.out.println(n+" is  Not  Prime");
break;
}

}

if (i==n)
System.out.println(n+" is  Prime");




}



}

