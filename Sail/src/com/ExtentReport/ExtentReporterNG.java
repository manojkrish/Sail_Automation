package com.ExtentReport;
import org.testng.IReporter;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@SuppressWarnings("unused")
public  class ExtentReporterNG implements IReporter {
    private ExtentReports extent;
 
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String 

outputDirectory) {
        extent = new ExtentReports(outputDirectory + File.separator + 

"SAILTestingReport.html", true);
        extent.config().reportHeadline("Social And Informal Learning").documentTitle

("SAIL").reportName("SAIL Testing Report");
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
 
            for (ISuiteResult r : result.values()) {
            	
                ITestContext context = r.getTestContext();
                
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
            }
        }
 
        extent.flush();
    }
 
    private void buildTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;
        
        
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.startTest(result.getMethod().getMethodName

()).assignCategory(result.getTestContext().getCurrentXmlTest().getName

(),result.getTestClass().getName());
               // System.out.println(result.getTestClass().getName());
                test.getTest().startedTime = getTime(result.getStartMillis());
                test.getTest().endedTime = getTime(result.getEndMillis());
               
                String message = "Test " + status.toString().toLowerCase() + "ed";
                
                if (result.getThrowable() != null)
                    message = "<pre>" + result.getThrowable().getMessage() + "</pre>";
                
                test.log(status, message);
                
                extent.endTest(test);
            }
        }
    }
    
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();        
    }
}