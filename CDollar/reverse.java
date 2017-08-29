public  class reverse

{

protected static void main(String args[])

{

int  n= Integer.parseInt(args[0]);

int  s=0;
int  r=0;

while  ( n>0)

{

r= n %10;

n=n/10;

s=s+r;
System.out.print(r);

}

System.out.println("sumofdigits"+s);


}


}