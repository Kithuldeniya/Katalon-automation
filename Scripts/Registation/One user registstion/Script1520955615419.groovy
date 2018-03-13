import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/SignUp')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_FirstName'), 'Aakithya')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_LastName'), 'Abayakoon')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_GmailAddress'), 'Aakithya.VSzhk.83978.Abayakoon')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_Passwd'), 'VSzhk.83978')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_PasswdAgain'), 'VSzhk.83978')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_BirthDay'), '9')

WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_BirthYear'), '1988')

WebUI.click(findTestObject('Google/Page_Create your Google Account/div_March'))

WebUI.click(findTestObject('Google/Page_Create your Google Account/div_Female'))

WebUI.click(findTestObject('Google/Page_Create your Google Account/input_submitbutton'))

WebUI.waitForElementPresent(findTestObject('Google/Page_Create your Google Account/img_tos-scroll-button-icon'), 5)

WebUI.click(findTestObject('Google/Page_Create your Google Account/img_tos-scroll-button-icon'))

WebUI.click(findTestObject('Google/Page_Create your Google Account/img_tos-scroll-button-icon'))

WebUI.click(findTestObject('Google/Page_Create your Google Account/input_iagreebutton'))

needMobile = WebUI.verifyElementPresent(findTestObject('Google/Page_Google Accounts/input_deviceAddress'), 3)

if (needMobile) {
	WebUI.setText(findTestObject('Google/Page_Google Accounts/input_deviceAddress'), '0716558604')
	
	WebUI.click(findTestObject('Google/Page_Google Accounts/input_SendCode'))
	
	WebUI.setText(findTestObject('Google/Page_Google Accounts/input_smsUserPin'), '607541')
	
	WebUI.click(findTestObject('Google/Page_Google Accounts/input_VerifyPhone'))
	
	WebUI.click(findTestObject('Google/Page_Google Accounts/input_submitbutton'))
}



WebUI.closeBrowser()

