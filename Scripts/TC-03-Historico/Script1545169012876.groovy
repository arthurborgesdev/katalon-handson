import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Tokyo CURA Healthcare C'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/input_Apply for hospital readm'))

WebUI.click(findTestObject('Object Repository/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('Object Repository/div_Visit Date (Required)_inpu'))

WebUI.click(findTestObject('Object Repository/td_28'))

WebUI.setText(findTestObject('Object Repository/textarea_Comment_comment'), 'marcar consulta')

WebUI.click(findTestObject('Object Repository/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/a_History'))

WebUI.click(findTestObject('Object Repository/p_marcar consulta'))

WebUI.click(findTestObject('Object Repository/a_Go to Homepage'))

