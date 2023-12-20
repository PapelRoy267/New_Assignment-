import org.openqa.selenium.WebElement;

public  abstract  class PageElement {

    protected WebElement element;


    public PageElement(WebElement element) {
        this.element = element;
    }

    // Abstract method to perform a common action on the web element
    public abstract void performAction();
}

