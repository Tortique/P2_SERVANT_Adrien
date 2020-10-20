package com.hemebiotech.analytics;

import java.io.FileWriter;

public class AnalyticsCounter {
    /**
     * Construct a list with input file symptoms.txt
     * Construct an output file for result
     * Clean and sort the list
     * Write in output file, symptoms with their occurrence.
     */
    public static void main(String args[]) throws Exception {
        ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        FileWriter writer = new FileWriter("result.out");
        ProcessOut result = new ProcessOut(reader, writer);
        result.ProcessOut();

    }
}
