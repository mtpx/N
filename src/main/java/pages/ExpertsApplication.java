
package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static utils.Utils.selectRandomValueFromDropdown;


public class ExpertsApplication extends _TestBase {

    //0.

    private SelenideElement polishLanguageCheckbox = $("#o0section-15-control≡grid-1-grid≡choose_language-control≡≡e0 + span");
    private SelenideElement englishLanguageCheckbox = $("#o0section-15-control≡grid-1-grid≡choose_language-control≡≡e0 + span");
    private List<SelenideElement> languages = $$(By.xpath("//input[@name='section-15-control≡grid-1-grid≡choose_language-control']"));

    private SelenideElement interestedInNawaCheckbox = $("#o0o0section-1-control≡grid-2-grid≡options-control≡≡e0 + span");
    private SelenideElement haveActivationCodeFromNavaCheckbox = $("#o0section-1-control≡grid-2-grid≡options-control≡≡e1");

    private SelenideElement nawaProgramsSelect = $("#o0section-1-control≡grid-153-grid≡programs_categories-control≡select1≡≡c⊙1");
    private SelenideElement nawaSecondProgramsSelect = $("#o0section-1-control≡grid-153-grid≡programs_categories-control≡select1≡≡c⊙2");
    private SelenideElement addNextNawaProgramButton = $("#o0section-1-control≡grid-153-grid≡fr-grid-add≡≡c");

    //1. Informacje o kandydacie

    private SelenideElement phoneNumberInput = $("#o0section-5-control≡grid-5-grid≡telephone-control≡xforms-input-1");
    private SelenideElement academicTitleInput = $("#o0section-5-control≡grid-5-grid≡academic_title-control≡xforms-input-1");

    //2. Okreslenie specjalizacji, zakresu tematycznego
    private SelenideElement thematicScopeSelect_acfg = $("#o0section-5-control≡grid-156-grid≡thematic_scope1-control≡select1≡≡c⊙1");
    private SelenideElement thematicScopeSelect_bd = $("#o0section-5-control≡grid-158-grid≡oecd_lvl_i-control≡select1≡≡c⊙1");
    private SelenideElement thematicScopeSelect_bd_2 = $("#o0section-5-control≡grid-158-grid≡oecd_lvl_ii-control≡select1≡≡c⊙1");
    //8. Znajomosc jezykow obcych
    private SelenideElement englishLevelSelect = $("#o0section-5-control≡grid-65-grid≡foreign_language_level-control≡select1≡≡c⊙1");

    //8. Oswiadczenia
  //  private SelenideElement dataProcessingCheckbox = $("#o0o0section-13-control≡grid-18-grid≡statement1-control≡≡e0");
   // private SelenideElement trueInformationCheckbox = $("#o0o0section-79-control≡grid-19-grid≡statement2-control≡≡e0");
  //  private SelenideElement dataConfidentialityCheckbox = $("#o0o0section-79-control≡grid-19-grid≡statement3-control≡≡e0");

    private SelenideElement dataProcessingCheckbox = $("#o0section-13-control≡grid-18-grid≡statement1-control .xforms-deselected .checkbox");
    private SelenideElement trueInformationCheckbox = $("#o0section-79-control≡grid-19-grid≡statement2-control .xforms-deselected .checkbox");
    private SelenideElement dataConfidentialityCheckbox = $("#o0section-79-control≡grid-19-grid≡statement3-control .xforms-deselected .checkbox");
    //private SelenideElement deselect = $(By.xpath("//span[@class='xforms-deselected']"));


    //main form buttons elements
    private SelenideElement submitApplicationButton = $("#o0xf-549≡xf-3408≡xf-3414≡≡c⊙3");
    private SelenideElement saveAsCopyButton = $("#o0xf-549≡xf-3408≡xf-3414≡≡c⊙2");

    //validations elements
    private SelenideElement validationErrorDialogBox = $("#o0fr-error-dialog≡xf-3421");
    private SelenideElement validationErrorDialogBoxLabel = $("#o0fr-error-dialog≡xf-3421 > label");
    private SelenideElement okOnValidationErrorDialogBox = $("#o0fr-error-dialog≡xf-3426≡≡c");
    private SelenideElement bottomErrorHeaderText = $("#o0error-summary-control-bottom≡body≡≡l");
    private SelenideElement savingDraftTitle = $(By.xpath("//span[@class='ui-growl-title']"));
    private SelenideElement savingDraftTitleCloseButton = $(By.xpath("//div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']"));



    //form functions
    @Step("Polski jezyk formularza")
    public void clickPolishLanguageCheckbox() throws InterruptedException {
        polishLanguageCheckbox.click();
    }

    @Step("Angielski jezyk formularza")
    public void clickEnglishLanguageCheckbox() {
        englishLanguageCheckbox.click();
    }

    @Step("Zainteresowany wspolpraca z NAWA")
    public void clickInterestedInNawaCheckbox() {
        interestedInNawaCheckbox.click();
    }

    @Step("Mam kod aktywacyjny od NAWA")
    public void clickHaveActivationCodeFromNavaCheckbox() {
        haveActivationCodeFromNavaCheckbox.click();
    }

    @Step("Wybor losowego programu NAWA")
    public void selectRandomNawaProgram(){
        selectRandomValueFromDropdown(nawaProgramsSelect);
    }

    @Step("Wybor drugiego losowego programu NAWA")
    public void selectSecondRandomNawaProgram(){
        addNextNawaProgramButton.click();
        selectRandomValueFromDropdown(nawaSecondProgramsSelect);
    }

    @Step("Ustawienie numeru telefonu {1}")
    public void setPhoneNumber(String phoneNumberInput){
        this.phoneNumberInput.clear();
        this.phoneNumberInput.sendKeys(phoneNumberInput);
    }



    @Step("Ustawienie tytulu akademickiego {1}")
    public void setAcademicTitle(String academicTitleInput){
        this.academicTitleInput.sendKeys(academicTitleInput);

    }


    @Step("Wybor losowego zakresu tematycznego")
    public void selectRandomThematicScopeProgram(){
        System.out.println("selected prog: "+nawaProgramsSelect.getSelectedOption());
        System.out.println("selected prog: "+nawaProgramsSelect.getAttribute("value"));
        String program = nawaProgramsSelect.getAttribute("value");
        System.out.println(program);


       if(program.equals("2") || program.equals("4") ) {
            selectRandomValueFromDropdown(thematicScopeSelect_bd);
            selectRandomValueFromDropdown(thematicScopeSelect_bd_2);
        }
       else if (program.equals("1") || program.equals("3") || program.equals("5") || program.equals("6")) {
           System.out.println("1 or 3 5 6");
           selectRandomValueFromDropdown(thematicScopeSelect_acfg);
       }
    }

    @Step("Wybor losowego poziomu jezyka")
    public void selectRandomEnglishLevel(){
        selectRandomValueFromDropdown(englishLevelSelect);
    }

    @Step("Zaznaczenie wymaganych checkboxow")
    public void clickRequiredCheckboxes() throws InterruptedException {
     //   dataProcessingCheckbox.setSelected(true);
     //   trueInformationCheckbox.setSelected(true);
      //  dataConfidentialityCheckbox.setSelected(true);

        dataProcessingCheckbox.click();
        trueInformationCheckbox.click();
        dataConfidentialityCheckbox.click();
    }


    //main form buttons functions

    @Step("Wyslij aplikacje")
    public void clickSubmitApplicationButton() {
        submitApplicationButton.click();
    }

    @Step("Zapisz kopie robocza")
    public void clickSaveAsCopyButton() throws InterruptedException {

        saveAsCopyButton.click();
        Thread.sleep(3000);
    }

    @Step("Szkic zostal zapisany - zamkniecie boxa")
    public void clickSavingDraftTitleCloseButton() {
        savingDraftTitleCloseButton.shouldBe(Condition.enabled).click();
    }

    //validation functions

    @Step("Pobieranie tresci bledow")
    public String getValidationErrorDialogBoxLabelText() {
        validationErrorDialogBox.shouldBe(Condition.visible);
        return validationErrorDialogBoxLabel.getText();
    }

    @Step("Klikniecie OK na dialog boxie z bledami")
    public void clickOkOnValidationErrorDialogBox() {
        okOnValidationErrorDialogBox.click();
    }

    @Step("Pobranie listy bledów")
    public String getBottomErrorHeaderText() {
        return bottomErrorHeaderText.getText();
    }

}
