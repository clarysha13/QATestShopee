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

WebUI.navigateToUrl('https://gist.github.com/')

WebUI.click(findTestObject('Create_Gist/Click Sign in'))

WebUI.setText(findTestObject('Create_Gist/Input Username'), 'clarysha79@gmail.com')

WebUI.setEncryptedText(findTestObject('Create_Gist/Input Password'), '/oSRGwXJXSv/Z/D0Zx92TQ==')

WebUI.click(findTestObject('Create_Gist/SubmitLogin'))

WebUI.click(findTestObject('EditGist/ClickProfile'))

WebUI.click(findTestObject('EditGist/ClickYourGists'))

WebUI.click(findTestObject('EditGist/ClickMyGistExample'))

WebUI.click(findTestObject('EditGist/ClickEdit'))

WebUI.click(findTestObject('EditGist/ClickEditorText'))

WebUI.click(findTestObject('EditGist/pre_Clarysha Graceya Tatipikal'))

WebUI.setText(findTestObject('EditGist/div_1Clarysha Graceya Tatipika (1)'), 'Clarysha')

WebUI.click(findTestObject('EditGist/button_Update public gist'))

