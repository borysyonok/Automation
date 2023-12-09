package po;

import base.mathods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HistoryButton extends BaseMethods {
    private static final By historyButton = By.xpath("//li[@id='ca-history']");

    public HistoryButton searchHistoryButton() {
        send(historyButton);
        return this;
    }
    public HistoryButton clickEnter() {
        send(historyButton, Keys.ENTER);
        return this;
    }
}
