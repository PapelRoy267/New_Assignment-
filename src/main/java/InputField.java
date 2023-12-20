import org.openqa.selenium.WebElement;
// Encapsulation: Creating classes that encapsulate specific web elements and their actions
public  class InputField extends PageElement {


    public InputField(WebElement element) {
        super(element);
    }

    @Override
    public void performAction() {
        element.sendKeys("SampleText");
    }
}



