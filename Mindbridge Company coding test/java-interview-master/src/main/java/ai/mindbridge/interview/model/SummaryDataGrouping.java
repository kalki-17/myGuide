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

public class SummaryDataGrouping {
    private SummaryData foo;
    private SummaryData bar;
    private SummaryData fooBar;

    public SummaryDataGrouping() {}

    public SummaryData getFoo() {
        return foo;
    }
    public void setFoo(SummaryData foo) {
        this.foo = foo;
    }
    public SummaryData getBar() {
        return bar;
    }
    public void setBar(SummaryData bar) {
        this.bar = bar;
    }
    public SummaryData getFooBar() {
        return fooBar;
    }
    public void setFooBar(SummaryData fooBar) {
        this.fooBar = fooBar;
    }
}
