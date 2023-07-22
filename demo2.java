import java.util.*;
class demo2
{
public static void main(String args[])
{
try
{
FileReader file=new FileReader("f:\\test\\a.text");
BufferReader fileinput=new BufferReader(file);
System.out.print(fileinput.readline());
file.close();
}
catch(IOException)
{
System.out.print("check another program");
}
}
}