package test2;


import org.openqa.selenium.WebDriver;

public class EvroinsFront {

    private WebDriver driver;
    private String frontUrl;
    private String frontUrlf;
    private String jjj;
    String parts;
    int timeoutInSeconds = 20;
    String orderId;

    //@Before

    public EvroinsFront(String frontUrl) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\zhivkokasabov\\automation\\geckodriver.exe");
        this.driver = new org.openqa.selenium.firefox.FirefoxDriver();
        //frontUrl =  "http://www.euroinslife.bg/";
        this.driver.navigate().to(frontUrl);



    }

}
