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

WebUI.navigateToUrl('https://accounts.google.com/SignUp')

File f = new File('C:/Users/rajitha/Documents/Automation/10 users.txt')

BufferedReader b = new BufferedReader(new FileReader(f))

String readLine = ''

while ((readLine = b.readLine()) != null) {
    String[] data = readLine.split(',')

    /* 0 First name
	 * 1 Last name
	 * 2 Email
	 * 3 Password
	 * 4 Day
	 * 5 Month
	 * 6 Year
	 * */
    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_FirstName'), data[0])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_LastName'), data[1])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_GmailAddress'), data[2])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_Passwd'), data[3])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_PasswdAgain'), data[3])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_BirthDay'), data[4])

    WebUI.setText(findTestObject('Google/Page_Create your Google Account/input_BirthYear'), data[6])

    WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_Month'))

    switch (data[5]) {
        case '0':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_January'))

            break
        case '1':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_February'))

            break
        case '2':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_March'))

            break
        case '3':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_April'))

            break
        case '4':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_May'))

            break
        case '5':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_June'))

            break
        case '6':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_July'))

            break
        case '7':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_August'))

            break
        case '8':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_September'))

            break
        case '9':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_October'))

            break
        case '10':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_November'))

            break
        case '11':
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_December'))

            break
        default:
            WebUI.click(findTestObject('Google/Page_Create your Google Account/Months/div_January'))

            break
    }
    
    WebUI.click(findTestObject('Google/Page_Create your Google Account/div_I am...'))

    WebUI.click(findTestObject('Google/Page_Create your Google Account/div_Female'))

    WebUI.deleteAllCookies()

    WebUI.delay(2)

    WebUI.refresh()
}

b.close()

WebUI.closeBrowser()

