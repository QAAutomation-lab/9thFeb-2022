package actitime.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TaskPage extends SeleniumUtility {

	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".title.ellipsis")
	private WebElement addnew;
	@FindBy(css = ".item.createNewTasks")
	private WebElement newtasks;

	@FindBy(css = "div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div.components_combobox>div.comboboxButton>div.selectedItem")
	private WebElement customerdropdown;

	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ' or @class='itemRow cpItemRow selected']")
	private WebElement customer;

	@FindBy(css = ".projectSelector>.components_combobox.cpCombobox>.comboboxButton>.selectedItem")
	private WebElement projectdropdown;

	@FindBy(css = "tr.selectProjectRow.projectSelectorRow>td:nth-child(1)>div>div>div:nth-child(2)>div>div:nth-child(1)>div>div:nth-child(5)")
	private WebElement project;

	@FindBy(css = "tbody>tr>td.nameCell>input.inputFieldWithPlaceholder:nth-child(1)")
	private WebElement taskname;
	@FindBy(id = "ext-gen45")
	private WebElement deadline;

	@FindBy(id = "ext-gen110")
	private WebElement nextmonth;

	@FindBy(css = "#ext-gen95>#ext-gen99>#ext-gen103>#ext-gen104>#ext-gen105>tbody>tr:nth-child(2)>td>table>tbody>tr:nth-child(3)>td:nth-child(2)")
	private WebElement date;
	@FindBy(css = ".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div.typeOfWorkButton.editable>div")
	private WebElement typeofwork;

	@FindBy(css = ".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(1)>div>div>div:nth-child(1)>div>div:nth-child(11)>div")
	private WebElement selectwork;

	@FindBy(css = ".basicLightboxFooter>div:nth-child(2)>div>div>div:nth-child(1)")
	private WebElement creat_tasks;

	@FindBy(css = ".tasksTablesWrapper>div:nth-child(1)>table>tbody>tr>td:nth-child(2) div.title")
	private WebElement task_created_or_not;

	@FindBy(css = ".taskRow.noLastTrackingDate .img")
	private WebElement checkbox1;

	@FindBy(css = ".delete.button")
	private WebElement deletebtn;

	@FindBy(xpath = "//span[text()='Delete permanently' and @class='submitTitle buttonTitle']")
	private WebElement deletePermanent;

	public void createTask(String taskName) {
		clickOnElement(addnew);
		clickOnElement(newtasks);
		clickOnElement(customerdropdown);
		clickOnElement(customer);
		clickOnElement(projectdropdown);
		clickOnElement(project);
		typeInput(taskname, taskName);
		clickOnElement(deadline);
		clickOnElement(nextmonth);
		clickOnElement(date);
		clickOnElement(typeofwork);
		clickOnElement(selectwork);
		clickOnElement(creat_tasks);
	}
	public boolean checkNewlyCreatedTask() {
		return isElementExist(task_created_or_not);
	}
	
	public void deleteNewlyCreatedTask() {
		clickOnElement(checkbox1);
		clickOnElement(deletebtn);
		clickOnElement(deletePermanent);
	}
}
