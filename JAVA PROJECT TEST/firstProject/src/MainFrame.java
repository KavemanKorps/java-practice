import javax.swing.JFrame;
import javax.swing.WindowConstants;

// WE CANNOT RUN THIS B/C IT DOES NOT CONTAIN THE "MAIN" METHOD WITHIN IT, UNLIKE APP.JAVA. 
// so what we do? We add this class to App.java.
// this class in particul opens a new custom window.
public class MainFrame extends JFrame {
    public void init() {
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // IF NOT, WE CAN ALWAYS ADD A MAIN FUNC WITHIN THIS ONE AND RUN IT FROM THERE  LOL.
    // public static void main(String[] args) {
    //     MainFrame myFrame = new MainFrame();
    //     myFrame.init();
    // }
}
