package src.factories;

import src.buttons.Button;
import src.buttons.MacOSButton;
import src.buttons.WindowsButton;
import src.checkboxs.Checkbox;
import src.checkboxs.MacOSCheckbox;
import src.checkboxs.WindowsCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
