import net.xuserver.part1.AssessementTest;
import net.xuserver.part1.BearOrShark;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Assessement Tests");
        String[] arg = {""};
        AssessementTest.main(arg);

        System.out.println("BearShark");

        
        BearOrShark.calendar();
        BearOrShark.luck(9);
        BearOrShark.luck(11);


    }


}
