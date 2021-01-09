package src.factories;

import src.buttons.Button;
import src.checkboxs.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
