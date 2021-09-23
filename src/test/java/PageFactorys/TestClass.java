package PageFactorys;

import org.junit.Test;

public class TestClass extends ConfigurationClass {
    private HomePageClass home;
    private String _name = "Gio";
    private String _lastName = "Bolota";
    private String _gender = "Male";
    private String _phone = "9995555999";
    private String _mainText = "Thanks for submitting the form";

    public TestClass(){
        super("https://demoqa.com/");
        home = new HomePageClass(super.driver);
    }

    @Test
    public void DemoqaTest(){

        home.ClickToForms();
        home.ClickToPracticeForms();
        home.FillBlank(_name, _lastName, _gender, _phone);
        home.Submit();
        home.CheckMainText(_mainText);
        home.CheckName(_name, _lastName);
        home.CheckGender(_gender);
        home.CheckPhoneNumber(_phone);

        Close();
    }

/*    @AfterMethod
    public void Finish(){
        Close();
        System.out.println("Close");
    }*/
}
