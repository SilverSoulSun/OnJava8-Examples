// strings/Replacing.java
// �2015 MindView LLC: see Copyright.txt
import static com.mindviewinc.util.Print.*;

public class Replacing {
  static String s = Splitting.knights;
  public static void main(String[] args) {
    print(s.replaceFirst("f\\w+", "located"));
    print(s.replaceAll("shrubbery|tree|herring","banana"));
  }
}
/* Output:
Then, when you have located the shrubbery, you must cut
down the mightiest tree in the forest... with... a herring!
Then, when you have found the banana, you must cut down the
mightiest banana in the forest... with... a banana!
*/
