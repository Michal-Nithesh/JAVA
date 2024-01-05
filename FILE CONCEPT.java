import java.io.File;
class FileDemo
{
static void p(String s)
{
System.out.println(s);
}
public static void main(String args[ ])
{
File f1 = new File(args[0]);
p(&quot;File Name: &quot; + f1.getName());
p(&quot;Path: &quot; + f1.getPath());
p(&quot;Abs Path: &quot; + f1.getAbsolutePath());
p(&quot;Parent: &quot; + f1.getParent());
p(f1.exists() ? &quot;exists&quot; : &quot;does not exist&quot;);

p(f1.canWrite() ? &quot;is writeable&quot; : &quot;is not writeable&quot;);
p(f1.canRead() ? &quot;is readable&quot; : &quot;is not readable&quot;);
p(&quot;is &quot; + (f1.isDirectory() ? &quot;&quot; : &quot;not&quot; + &quot; a directory&quot;));
p(f1.isFile() ? &quot;is normal file&quot; : &quot;might be a named pipe&quot;);
p(f1.isAbsolute() ? &quot;is absolute&quot; : &quot;is not absolute&quot;);
p(&quot;File last modified: &quot; + f1.lastModified());
p(&quot;File size: &quot; + f1.length() + &quot; Bytes&quot;);
}
}
