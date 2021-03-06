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

WebUI.navigateToUrl('http://192.168.8.100:8888/')

WebUI.waitForElementPresent(findTestObject('AirDroid/Page_AirDroid/img'), 5)

WebUI.click(findTestObject('AirDroid/Page_AirDroid/img'))

WebUI.waitForElementVisible(findTestObject('AirDroid/Page_Messages  AirDroid Web/i_icon-search'), 5)

WebUI.delay(5)

WebUI.setText(findTestObject('AirDroid/Page_Messages  AirDroid Web/input_span3 mod-messageList-se'), 'your google verification code is')

WebUI.click(findTestObject('AirDroid/Page_Messages  AirDroid Web/i_icon-search'))

WebUI.delay(5)

codefulltext = WebUI.getText(findTestObject('AirDroid/Page_Messages  AirDroid Web/div_Your Google verification c'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment(codefulltext.replaceAll("Your Google verification code is", " ").replace(" ", ""))

WebUI.closeBrowser()

