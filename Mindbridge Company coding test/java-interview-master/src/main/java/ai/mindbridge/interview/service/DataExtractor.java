/*
*  Copyright MindBridge Analytics Inc. all rights reserved.
*
*  This material is confidential and may not be copied, distributed,
*  reversed engineered, decompiled or otherwise disseminated without
*  the prior written consent of MindBridge Analytics Inc.
*
*
*/
package ai.mindbridge.interview.service;

import java.util.List;

import ai.mindbridge.interview.model.DataPoint;
import ai.mindbridge.interview.model.SummaryDataGrouping;

/** Your task: implement this as DataExtractorImpl */
public interface DataExtractor {
    /**
     * Summarizes each data point into one of three buckets.
     * If the id is divisible by 3, put it in the "foo" bucket.
     * If the id is divisible by 5, put it in the "bar" bucket.
     * If the id is divisible by 3 and 5, put it in the "fooBar" bucket.
     * Otherwise, the data point doesn't go into any buckets.
     * @param dataPoints list of data points
     * @return grouped summary data
     */
    public SummaryDataGrouping summarizeData(List<DataPoint> dataPoints);
}
