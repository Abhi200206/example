import java.util.Scanner;
class hello{
  void h(){  int a;
    Scanner a=new Scanner(System.in);
    System.out.println(a);
}
}
class bye extends hello {
    public static void main(String args[]){
        bye b=new bye();
        b.h();
    }
}