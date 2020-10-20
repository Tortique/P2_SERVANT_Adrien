package com.hemebiotech.analytics;

import java.io.FileWriter;

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {
        /**
         * Construct a list with input file symptoms.txt
         */
        ISymptomReader reader = new ReadSymptomDataFromFile("C:\\Users\\adrie\\Desktop\\OC-Projet\\P2_SERVANT_Adrien\\Project02Eclipse\\symptoms.txt");
        /**
         * Construct an output file for result
         */
        FileWriter writer = new FileWriter("result.out");
        /**
         * Clean and sort the list
         * Write in output file, symptoms with their occurrence.
         */
        ProcessOut result = new ProcessOut(reader, writer);
        result.ProcessOut();

    }
}
