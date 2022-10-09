class car
{
String name,color;
int carn;

void printInfo()
{
System.out.println(name);
System.out.println(color);
System.out.println(carn);
}
void carinfo()
{
System.out.println("name....");
}
public static void main(String ar[])
{
//new car()
car c=new car();
//System.out.println(c);
c.name="as";
c.printInfo();
}
} 