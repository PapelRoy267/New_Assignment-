import org.openqa.selenium.WebElement;

public class Button extends PageElement {


    public Button(WebElement element) {
        super(element);
    }

    @Override
    public void performAction() {
        element.click();
    }
}










