package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateToGoogle {

    GoToGoogle goToGoogle;

    @Step("Open Google")
    public void googleHomePage() {
        goToGoogle.open();
    }
}
