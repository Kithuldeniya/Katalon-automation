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

WebUI.openBrowser('')

//log in to facebook
WebUI.navigateToUrl('https://www.facebook.com')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_email'), 'rajitha.kithuldeniya@gmail.com')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_pass'), 'Ruk@9071')

WebUI.click(findTestObject('Page_Facebook  log in or sign up/Log in'))

WebUI.waitForElementPresent(findTestObject('Facebook home/UI layer'), 10)

WebUI.doubleClick(findTestObject('Facebook home/UI layer'))

WebUI.click(findTestObject('Facebook home/a_Account Settings'))

WebUI.click(findTestObject('Facebook home/a_Log out'))

WebUI.deleteAllCookies()

WebUI.refresh()

