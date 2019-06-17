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

/** Input data */
public class DataPoint {
    private int id;
    private double amount;

    public DataPoint(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
