package hash_X;
import java.io.*;
public class CLassLoaderTest {
  public static void main(String[] args) throws Exception {
    ClassLoader myLoader = new ClassLoader() {
      public Class findClass(String name) throws ClassNotFoundException {
        try {
          String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
          System.out.println("fileName = " + fileName);
          BufferedInputStream is = (BufferedInputStream)getClass().getResourceAsStream(fileName);
          if (is == null) {
            System.out.println("super have invoked " + super.getParent());
            return super.findClass(name);
          }
          byte[] b = new byte[is.available()];
          is.read(b);
          Class cls = defineClass(name, b, 0, b.length);
          System.out.println("The defined classloader is "+cls.getClassLoader());
          return cls;
        } catch (IOException e) {
          throw new ClassNotFoundException(name);
        }
      }
    };
//    ClassLoader userLoader1_3 =  myLoader.loadClass("ClassLoadtest").getClassLoader();
    ClassLoader hadoop = myLoader.loadClass("TestOutOfOrderWrite").getClassLoader();
//    System.out.println("userLoader1_3 = " + userLoader1_3);
    System.out.println("hadoop = " + hadoop);

  }

}
