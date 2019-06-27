package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static utils.Utils.*;

public class PolishLanguagePromotion extends _TestBase {

    //navigation buttons

    private SelenideElement nextPageOfApplicationButton = $("#o0fr-view-component≡fr-wizard-next≡≡c");



    //0. Metryka


    private SelenideElement projectRealizationPlaceInput = $("#o0fr-view-component≡section-508-section≡grid-1-grid≡textarea-0-control≡field≡≡c");


    //1. Informacje o wnioskodawcy

    private SelenideElement unitStatusSelect = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡select1-0-control≡select1≡≡c");//1.2
    private SelenideElement unitFullNameSelect = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡select1-1-control≡select1≡select1≡≡c");//1.4.8
    private SelenideElement nipInput = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡input-5-control≡xforms-input-1"); // 1.4.8
    private SelenideElement unitFormInput = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡input-7-control≡xforms-input-1");//1.4.10
    private SelenideElement formOfCourtesySelect = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡select1-3-control≡select1≡≡c");//1.6
    private SelenideElement positionInput = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡input-14-control≡xforms-input-1"); //1.10
    private SelenideElement phoneNumberInput = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡input-16-control≡xforms-input-1"); //1.12

    private SelenideElement authorizationToSendApplicationSelect = $("#o0fr-view-component≡section-614-section≡grid-614-grid≡select1-4-control≡select1≡≡c"); //1.14
    private SelenideElement formOfCourtesy2Select = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡select1-5-control≡select1≡≡c"); //1.17
    private SelenideElement nameInput = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-17-control≡xforms-input-1");//1.18
    private SelenideElement surnameInput = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-18-control≡xforms-input-1");//1.19
    private SelenideElement position2Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-19-control≡xforms-input-1");//1.20
    private SelenideElement mailInput = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-20-control≡xforms-input-1");//1.21
    private SelenideElement phoneNumber2Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-21-control≡xforms-input-1");//1.22
    private SelenideElement formOfCourtesy3Select = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡select1-6-control≡select1≡≡c"); //1.25
    private SelenideElement name2Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-23-control≡xforms-input-1");//1.26
    private SelenideElement surname2Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-24-control≡xforms-input-1");//1.27
    private SelenideElement position3Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-25-control≡xforms-input-1");//1.28
    private SelenideElement mail2Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-26-control≡xforms-input-1");//1.29
    private SelenideElement phoneNumber3Input = $("#o0fr-view-component≡section-614-section≡grid-2-grid≡input-27-control≡xforms-input-1"); //1.30
    private SelenideElement descriptionOfApplicantInput = $("#o0fr-view-component≡section-614-section≡grid-3-grid≡textarea-1-control≡field≡≡c");//1.34
    private SelenideElement experienceOfApplicantInput = $("#o0fr-view-component≡section-614-section≡grid-3-grid≡textarea-2-control≡field≡≡c");//1.35


    //3. Informacja o projekcie


    private SelenideElement projectTitleInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-6-control≡field≡≡c"); //3.1
    private SelenideElement projectStartDateInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡input-48-control≡xforms-input-1");//3.3
    private SelenideElement projectEndDateInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡input-49-control≡xforms-input-1");//3.4
    private SelenideElement shortProjectDescriptionInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-8-control≡field≡≡c");//3.5
    private SelenideElement projectAnalysisInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-9-control≡field≡≡c");//3.6
    private SelenideElement projectInnovationInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-10-control≡field≡≡c");//3.7
    private SelenideElement targetGroupDescriptionInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-11-control≡field≡≡c");//3.8
    private SelenideElement projectResultsInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-12-control≡field≡≡c");//3.9
    private SelenideElement projectScheduleInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-13-control≡field≡≡c");//3.10
    private SelenideElement projectManagementInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-14-control≡field≡≡c");//3.11
    private SelenideElement projectEqualityInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-15-control≡field≡≡c");//3.12
    private SelenideElement projectMonitoringInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-16-control≡field≡≡c");//3.13
    private SelenideElement projectEvaluationInput = $("#o0fr-view-component≡section-1057-section≡grid-1057-grid≡textarea-17-control≡field≡≡c");//3.14


    private SelenideElement riskDescriptionInput = $("#o0fr-view-component≡section-1057-section≡repeat-1194-repeat≡textarea-18-control≡field≡≡c⊙1");//3.15
    private SelenideElement riskProbabilitySelect = $("#o0fr-view-component≡section-1057-section≡repeat-1194-repeat≡select1-13-control≡select1≡≡c⊙1");//3.16
    private SelenideElement riskImpactSelect = $("#o0fr-view-component≡section-1057-section≡repeat-1194-repeat≡select1-14-control≡select1≡≡c⊙1");//3.17
    private SelenideElement riskPreventionInput = $("#o0fr-view-component≡section-1057-section≡repeat-1194-repeat≡textarea-19-control≡field≡≡c⊙1");//3.18
    private SelenideElement riskImpactMinimalizationInput = $("#o0fr-view-component≡section-1057-section≡repeat-1194-repeat≡textarea-20-control≡field≡≡c⊙1");//3.19


    private SelenideElement dataConfidentialityCheckbox = $("#o0section-79-control≡grid-19-grid≡statement3-control .xforms-deselected");
    private SelenideElement deselect = $(By.xpath("//span[@class='xforms-deselected']"));



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


    // navigation
    @Step("Nastepna strona wniosku")
    public void clickNextPageOfApplication(){

        nextPageOfApplicationButton.shouldBe(Condition.enabled).click();
    }


    //0. Metryka
    @Step("Ustawienie miejsca realizacji projektu")
    public void setProjectRealizationPlace(String projectRealizationPlaceInput){
        this.projectRealizationPlaceInput.sendKeys(projectRealizationPlaceInput);
    }

    //1. Informacje o wnioskodawcy

    @Step("Wybor losowego statusu jednostki")
    public void selectRandomUnitStatus(){
        unitStatusSelect.shouldBe(Condition.visible);
        selectRandomValueFromDropdown(unitStatusSelect);
    }

    @Step("Wybor losowej pelnej nazwy")
    public void selectRandomUnitFullName(){
       // safeSelectRandomValueFromDropdown(unitFullNameSelect);
        selectRandomValueFromDropdown(unitFullNameSelect);
    }

    @Step("Uzupelenie nipu")
    public void setNip(String nipInput){
        //safeSendKeys(this.nipInput, nipInput);
        this.nipInput.sendKeys(nipInput);
    }

    @Step("Uzupelenie formy prawnej")
    public void setUnitForm(String unitFormInput){
       // safeSendKeys(this.unitFormInput, unitFormInput);
        this.unitFormInput.sendKeys(unitFormInput);
    }



    @Step("Uzupelnienie danych na temat osoby skladajacej wniosek")
    public void setDetailsOfPersonSubmittingApplication(String positionInput, String phoneNumberInput){
        selectRandomValueFromDropdown(formOfCourtesySelect);
        this.positionInput.sendKeys(positionInput);
        this.phoneNumberInput.sendKeys(phoneNumberInput);
    }

    @Step("Wybor upowaznienia do zlozenia wniosku")
    public void selectRandomAuthorizationToSendApplication(){
        selectRandomValueFromDropdown(authorizationToSendApplicationSelect);
    }


    @Step("Uzupelenie danych osoby do kontaktu w sprawach zwiazanych z projektem")
    public void setContactPerson(String nameInput, String surnameInput, String position2Input, String mailInput, String phoneNumber2Input){
        selectRandomValueFromDropdown(formOfCourtesy2Select);
        this.nameInput.sendKeys(nameInput);
        this.surnameInput.sendKeys(surnameInput);
        this.position2Input.sendKeys(position2Input);
        this.mailInput.sendKeys(mailInput);
        this.phoneNumber2Input.sendKeys(phoneNumber2Input);
    }

    @Step("Uzupelenie danych osoby do kontaktu w sprawach zwiazanych z finansami")
    public void setFinanceContactPerson(String name2Input, String surname2Input, String position3Input, String mail2Input, String phoneNumber3Input){
        selectRandomValueFromDropdown(formOfCourtesy2Select);
        this.name2Input.sendKeys(name2Input);
        this.surname2Input.sendKeys(surname2Input);
        this.position3Input.sendKeys(position3Input);
        this.mail2Input.sendKeys(mail2Input);
        this.phoneNumber3Input.sendKeys(phoneNumber3Input);
    }


    @Step("Uzupelenie opisu wnioskodawcy")
    public void setDescriptionOfApplicant(String descriptionOfApplicantInput){
        this.descriptionOfApplicantInput.sendKeys(descriptionOfApplicantInput);
    }

    @Step("Uzupelenie doswiadczenia wnioskodawcy")
    public void setExperienceOfApplicant(String experienceOfApplicantInput){
        this.experienceOfApplicantInput.sendKeys(experienceOfApplicantInput);
    }



    //3. Informacje o projekcie

    @Step("Uzupelnienie tytulu projektu")
    public void setProjectTitle(String projectTitleInput){
        this.projectTitleInput.sendKeys(projectTitleInput);
    }

    @Step("Wybor daty startowej projektu")
    public void setProjectStartDate(String projectStartDateInput){
        this.projectStartDateInput.sendKeys(projectStartDateInput);
    }

    @Step("Wybor daty koncowej projektu")
    public void setProjectEndDate(String projectEndDateInput){
        this.projectEndDateInput.sendKeys(projectEndDateInput);
    }

    @Step("Uzupelenie krotkiego opisu projektu")
    public void setShortProjectDescription(String shortProjectDescriptionInput ){
        this.shortProjectDescriptionInput.sendKeys(shortProjectDescriptionInput);
    }


    @Step("Uzupelnienie analizy projektu")
    public void setProjectAnalysis(String projectAnalysisInput){
        this.projectAnalysisInput.sendKeys(projectAnalysisInput);
    }

    @Step("Uzupelnienie innowacyjnosci dzialan projektowych")
    public void setProjectInnovation(String projectInnovationInput){
        this.projectInnovationInput.sendKeys(projectInnovationInput);
    }


    @Step("Uzupelnienie opisu grup docelowych")
    public void setTargetGroupDescription(String targetGroupDescriptionInput){
        this.targetGroupDescriptionInput.sendKeys(targetGroupDescriptionInput);
    }



    @Step("Uzupelenie planowanych rezultatow")
    public void setProjectResults(String projectResultsInput){
        this.projectResultsInput.sendKeys(projectResultsInput);
    }

    @Step("Uzupelenie harmonogramu dzialan")
    public void setProjectSchedule(String projectScheduleInput){
        this.projectScheduleInput.sendKeys(projectScheduleInput);
    }

    @Step("Uzupelenie zarzadzania projektem")
    public void setProjectManagement(String projectManagementInput){
        this.projectManagementInput.sendKeys(projectManagementInput);
    }

    @Step("Uzupelenie rownosci szans w projekcie")
    public void setProjectEquality(String projectEqualityInput){
        this.projectEqualityInput.sendKeys(projectEqualityInput);
    }

    @Step("Uzupelenie monitorowania dzialan w projekcie")
    public void setProjectMonitoring(String projectMonitoringInput){
        this.projectMonitoringInput.sendKeys(projectMonitoringInput);
    }

    @Step("Uzupelenie ewaluacji dzialan projektowych")
    public void setProjectEvaluation(String projectEvaluationInput){
        this.projectEvaluationInput.sendKeys(projectEvaluationInput);
    }

    @Step("Uzupelenie opisu ryzyka")
    public void setRiskDescription(String riskDescriptionInput){
        this.riskDescriptionInput.sendKeys(riskDescriptionInput);
    }

    @Step("Wybor losowego prawdopodobienstwa wystawpienia ryzyka")
    public void selectRandomRiskProbability(){
        selectRandomValueFromDropdown(riskProbabilitySelect);
    }

    @Step("Wybor losowego wplywu ryzyka ")
    public void selectRandomRiskImpact(){
        selectRandomValueFromDropdown(riskImpactSelect);
    }

    @Step("Uzupelenie spospobu zapiegania wystapieniu ryzyka")
    public void setRiskPrevention(String riskPreventionInput){
        this.riskPreventionInput.sendKeys(riskPreventionInput);
    }

    @Step("Uzupelenie sposobu minimalizacji skutkow wystapienia ryzyka")
    public void setRiskImpactMinimalization(String riskImpactMinimalizationInput){
        this.riskImpactMinimalizationInput.sendKeys(riskImpactMinimalizationInput);
    }




    //main form buttons functions

    @Step("Wyslij aplikacje")
    public void clickSubmitApplicationButton() {
        submitApplicationButton.click();
    }

    @Step("Zapisz kopie robocza")
    public void clickSaveAsCopyButton() {
        saveAsCopyButton.click();
    }

    @Step("Szkic zostal zapisany - zamkniecie boxa")
    public void clickSavingDraftTitleCloseButton() {
        savingDraftTitleCloseButton.click();
    }

    //validation functions

    @Step("Pobieranie tresci bledow")
    public String getvalidationErrorDialogBoxLabelText() {
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
