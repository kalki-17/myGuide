/*
*  Copyright MindBridge Analytics Inc. all rights reserved.
*
*  This material is confidential and may not be copied, distributed,
*  reversed engineered, decompiled or otherwise disseminated without
*  the prior written consent of MindBridge Analytics Inc.
*
*
*/
package ai.mindbridge.interview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Output data. You can refactor this class if you like, it's just a POJO but you could
 * move some behaviour here if it makes the service cleaner
 */
public class SummaryData {
    private List<Integer> ids = new ArrayList<>();;
    private int count;
    private double totalAmount;
    private double max = Double.MIN_VALUE;
    private double min = Double.MAX_VALUE;
    private double average;

    /** List of the DataPoint ids that went into this bucket */
    public List<Integer> getIds() {
        return ids;
    }
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /** Count of data points that went into this bucket */
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    /** Sum of the DataPoint amounts that went into this bucket */
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** Largest DataPoint amount that went into this bucket */
    public double getMax() {
        return max;
    }
    public void setMax(double max) {
        this.max = max;
    }

    /** Smallest DataPoint amount that went into this bucket */
    public double getMin() {
        return min;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public double getAverage() {
        return average;
    }

    /** Average of all the DataPoint amounts that went into this bucket */
    public void setAverage(double average) {
        this.average = average;
    }
}
