package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchForPictures extends UIInteractionSteps {
    @Step("Click pisctures")
    public void click_pictures() {
        //$(SearchForm.SEARCH_FIELD).clear();
        //$(SearchForm.SEARCH_FIELD).type(term);
        $(SearchForm.PICTURES_BUTTON).click();
    }
}
