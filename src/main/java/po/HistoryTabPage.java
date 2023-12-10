package po;

import org.openqa.selenium.By;

public class HistoryTabPage extends ArticlePage {
    private static final By historyButton = By.xpath("//li[@id='ca-history']");

    public HistoryTabPage searchHistoryButton() {
        send(historyButton);
        return this;
    }
}
