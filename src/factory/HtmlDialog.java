package src.factory;

import src.buttons.Button;
import src.buttons.WindowsButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
