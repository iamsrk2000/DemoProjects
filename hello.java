
class base{
base(){}
  //base(int j){ }
base(int j,int k)
{
}
}
class test extends base{
 test(int j){// super(j);
}
test(int j,int k){
super(j,k);
}
}
class Test1
{
public static void main(String[] args)
{
test t=new test(3);
System.out.println(t);
}
}











/*"METHOD OVERRRIDING"-
class Simple
{
void method()
{
System.out.println("method in Simple");
}
}
class SimpleA extends Simple
{
void method()
{
System.out.println("method in SimpleA");
}
}
class TestOverRiding
{
public static void main(String[] args)
{
Simple sl=new Simple();
sl.method();
SimpleA s2=new SimpleA();
s2.method();
Simple s3=new SimpleA();
s3.method();
}
}
*/


