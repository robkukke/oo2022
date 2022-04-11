import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.regex.Pattern;
import java.util.Collection;

/**
 * https://github.com/mabe02/lanterna/blob/master/docs/examples/gui/basic_form_submission.md
 */
public class LanternaCalculator {
    public static void main(String[] args) throws IOException {
        // Setup terminal and screen layers
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        // Create panel to hold components
        Panel panel = new Panel();
        panel.setLayoutManager(new GridLayout(2));

        final Label lblOutput = new Label("");

        panel.addComponent(new Label("Num 1"));
        final TextBox txtNum1 = new TextBox().setValidationPattern(Pattern.compile("[0-9]*")).addTo(panel);

        panel.addComponent(new Label("Num 2"));
        final TextBox txtNum2 = new TextBox().setValidationPattern(Pattern.compile("[0-9]*")).addTo(panel);

        panel.addComponent(new Label("Operation"));
        final ComboBox < String > operations = new ComboBox < String > ();
        operations.addItem("Add");
        operations.addItem("Subtract");
        operations.addItem("Multiply");
        operations.addItem("Divide");
        panel.addComponent(operations);

        panel.addComponent(new EmptySpace(new TerminalSize(0, 0)));
        new Button("Calculate!", new Runnable() {
            @Override
            public void run() {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                Operations op = null;
                if (operations.getSelectedIndex() == 0) {
                    op = new Operations.OpAdd();
                } else if (operations.getSelectedIndex() == 1) {
                    op = new Operations.OpSub();
                } else if (operations.getSelectedIndex() == 2) {
                    op = new Operations.OpMul();
                } else if (operations.getSelectedIndex() == 3) {
                    op = new Operations.OpDiv();
                }
                lblOutput.setText("" + op.operate(num1, num2));
            }
        }).addTo(panel);

        panel.addComponent(new EmptySpace(new TerminalSize(0, 0)));
        panel.addComponent(lblOutput);

        // Create window to hold the panel
        BasicWindow window = new BasicWindow();
        window.setComponent(panel);

        // Create GUI and start GUI
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
        gui.addWindowAndWait(window);
    }
}