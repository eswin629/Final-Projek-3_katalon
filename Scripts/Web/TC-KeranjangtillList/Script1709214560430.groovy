import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_BRODO Store  Brodo/a_FOOTWEAR'))

//WebUI.click(findTestObject('Object Repository/Page_Footwear  Brodo/img_Rp85.000,00_grid-product__image lazyaut_5aa76e_1'))
WebUI.click(findTestObject('Object Repository/Page_Footwear  Brodo/div_Vulcan Hi Navy WS'))

//WebUI.click(findTestObject('Object Repository/Page_Broslides V.2 Full Black/button_Add to cart'))
WebUI.click(findTestObject('Object Repository/Page_Vulcan Hi Navy WS/button_Add to cart'))

WebUI.navigateToUrl('https://bro.do/collections/footwear')

//WebUI.click(findTestObject('Object Repository/Page_Footwear  Brodo/div_Vulcan Hi Navy WS'))
//
//WebUI.click(findTestObject('Object Repository/Page_Vulcan Hi Navy WS/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Footwear  Brodo/div_Broslides V.2 Full Black'))

WebUI.click(findTestObject('Object Repository/Page_Broslides V.2 Full Black  Brodo/button_Add to cart'))

//WebUI.click(findTestObject('Object Repository/Page_Broslides V.2 Full Black/body_Time to own it            Why wait Sho_327a68_1'))
WebUI.navigateToUrl('https://bro.do/collections/footwear')

WebUI.click(findTestObject('Object Repository/Page_Footwear  Brodo/a_Cart                          2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Footwear  Brodo/a_Broslides V.2 Full Black'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Footwear  Brodo/a_Vulcan Hi Navy WS'), 0)

WebUI.closeBrowser()

