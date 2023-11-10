package testsAndLearnings;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;

public class firstGUIApp {
    public static void main(String[] args) {
        basicFrame mainFrame = new basicFrame("First GUI App on Swing"); 
    }
}

class basicFrame extends JFrame {
    public basicFrame(String windowName) {
        Toolkit osToolkit = Toolkit.getDefaultToolkit();
        Dimension targetScreenSize = osToolkit.getScreenSize();
        Image windowIcon = osToolkit.getImage("unidad4/logotec.png");

        int windowStartWidth = targetScreenSize.width/2;
        int windowStartHeight = targetScreenSize.height/2;

        setTitle(windowName);
        setIconImage(windowIcon);
        setBounds((targetScreenSize.width-windowStartWidth)/2,(targetScreenSize.height-windowStartHeight)/2,windowStartWidth,windowStartHeight);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class basicLayer extends JPanel {
    public basicLayer() {

    }
}