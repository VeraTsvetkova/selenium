package Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import test2.EvroinsFront;

public class GivenSteps {




    private EvroinsFront EvroinsFront;





    @Given("I am  on  Home Page<frontUrl>")
    public void whenIamOnMagAdminOrderPddage(@Named("frontUrl") String frontUrl)  {

        EvroinsFront = new EvroinsFront(frontUrl);}
}
