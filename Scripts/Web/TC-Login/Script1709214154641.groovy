import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bro.do/')

CustomKeywords.'loginHelper.Login.login'('winnapitupulu@gmail.com', 'Up8HqaQZPlgleczU7SAdeqHYgS/mGzjV')

//WebUI.click(findTestObject('Object Repository/Page_BRODO Store  Brodo/svg_BRO LABS_icon icon-user'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Account  Brodo/input_Email_customeremail'), 'winnapitupulu@gmail.com')
//WebUI.click(findTestObject('Object Repository/Page_Account  Brodo/input_Show_customerLogin'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Account  Brodo/img_Search_small--hide'), 0)
WebUI.navigateToUrl('https://bro.do/')
