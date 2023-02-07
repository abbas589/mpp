package com.miu.mpp.lab10.q1.bugreporter;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import com.miu.mpp.lab10.q1.*;


/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * <p>
 * Joe Smith
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * Tom Jones
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 */
public class BugReportGenerator {
    private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
    private static final String PACKAGE_TO_SCAN = "com.miu.mpp.lab10.q1.javapackage";
    private static final String REPORT_NAME = "bug_report.txt";
    private static final String REPORTED_BY = "reportedBy: ";
    private static final String CLASS_NAME = "classname: ";
    private static final String DESCRIPTION = "description: ";
    private static final String SEVERITY = "severity: ";

    public void reportGenerator() {
        List<Class<?>> classes = com.miu.mpp.lab10.q1.classfinder.ClassFinder.find(PACKAGE_TO_SCAN);

        //sample code for reading annotations -- you will need to change
        //this quite a bit to solve the problem
        //Sample code below obtains a list of names of developers assigned to bugs
        List<String> names = new ArrayList<String>();

        HashMap<String, String> reportMap = new HashMap<>();

        for (Class<?> cl : classes) {
            if (cl.isAnnotationPresent(BugReport.class)) {
                BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
                String name = annotation.assignedTo();
                String reportedBy = annotation.reportedBy();
                int severity = annotation.severity();
                String description = annotation.description();
                String className = cl.getTypeName();

                System.out.println(className);
                names.add(name);
                if (reportMap.get(name)==null) {
                    reportMap.put(name, concatString(reportedBy, severity, description, className));
                } else {
                    reportMap.put(name, reportMap.get(name) + concatString(reportedBy, severity, description, className));
                }
            }
        }
        System.out.println(names);

        try (FileWriter fileWriter = new FileWriter(REPORT_NAME)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            reportMap.forEach((key, value) -> printWriter.write(key + "\n" + value));

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    private String concatString(String reportedBy, int severity, String description, String className) {
        StringBuilder sb = new StringBuilder();

        return sb.append(REPORTED_BY).append(reportedBy).append("\n")
                .append(CLASS_NAME).append(className).append("\n")
                .append(DESCRIPTION).append(description).append("\n")
                .append(SEVERITY).append(severity).append("\n\n")
                .toString();

    }


}
