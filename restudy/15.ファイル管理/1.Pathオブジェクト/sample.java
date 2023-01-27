import java.nio.file.Path;
import java.nio.file.Paths;

class sample{
  public static void main(String[] args){
    Path p1 = Paths.get("C:\\code\\java\\file\\report.txt");
    Path p2 = Paths.get("C:", "code", "java", "file", "report.txt");
    Path p3 = Paths.get("C:/code/java/file/report.txt");
    Path p4 = Paths.get("C:/code/java/file/");
    Path p5 = Paths.get("C:/code/java/file");

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);
  }
}