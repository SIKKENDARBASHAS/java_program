class SK
{
double width;
double height;
double depth;
}
class box0
{
public static void main(String args[])
{
SK box=new SK();
double vol;
box.width=10;
box.height=20;
box.depth=30;
vol=box.width*box.height*box.depth;
System.out.println("volume" +vol);
}
}