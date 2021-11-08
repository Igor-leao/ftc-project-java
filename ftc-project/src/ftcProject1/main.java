package ftcProject1;

import java.io.IOException;

public class main {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    String path = "/home/igor/igor/eng_comp/ftc/eclipse-workspace/ftc-project/ftc1.txt";

    FileHandler.writer(path);
    FileHandler.reader(path);

}
}
