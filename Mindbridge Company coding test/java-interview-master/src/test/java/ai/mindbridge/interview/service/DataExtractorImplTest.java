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

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ai.mindbridge.interview.model.DataPoint;
import ai.mindbridge.interview.model.SummaryDataGrouping;

/** Unit test for DataExtractorImpl */
public class DataExtractorImplTest {

    @Before
    public void setUp() {
        // XXX replace mock(...) with your constructor here
        dataExtractor = mock(DataExtractor.class);
        //dataExtractor = new DataExtractorImpl();
        output = dataExtractor.summarizeData(TEST_DATA_POINTS);
    }

    private final static List<DataPoint> TEST_DATA_POINTS = Arrays.asList(
            new DataPoint(1, 134),
            new DataPoint(2, 33.4),
            new DataPoint(3, 653),
            new DataPoint(5, 5532),
            new DataPoint(6, 431.33),
            new DataPoint(8, 444),
            new DataPoint(9, 10),
            new DataPoint(10, 1000),
            new DataPoint(12, 99.99),
            new DataPoint(15, 123.44),
            new DataPoint(20, 323),
            new DataPoint(44, 55),
            new DataPoint(33, 76),
            new DataPoint(50, 1),
            new DataPoint(99, 33.333),
            new DataPoint(63, 33.333),
            new DataPoint(415, 66.333),
            new DataPoint(45, 45.555),
            new DataPoint(36, 55.32));

    private DataExtractor dataExtractor;
    private SummaryDataGrouping output;


    @Test
    public void shouldPopulateBasicFields() {
        assertNotNull(output);
        assertNotNull(output.getFoo());
        assertNotNull(output.getFoo().getIds());

        assertNotNull(output.getBar());
        assertNotNull(output.getBar().getIds());
    }

    @Test
    public void shouldGroupObjectsWithIdONLYMultiple3IntoFoo() {
        for (int id : output.getFoo().getIds()) {
            assertEquals(0, id % 3);
            assertNotEquals(0, id % 5);
        }
    }

    @Test
    public void shouldGroupObjectsWithIdONLYMultiple5IntoBar() {
        for (int id : output.getBar().getIds()) {
            assertNotEquals(0, id % 3);
            assertEquals(0, id % 5);
        }
    }

    @Test
    public void shouldGroupObjectsWithIdONLYMultiple15IntoFooBar() {
        for (int id : output.getFooBar().getIds()) {
            assertEquals(0, id % 3);
            assertEquals(0, id % 5);
        }
    }

    @Test
    public void shouldCountFoo() {
        assertEquals(8, output.getFoo().getCount());
    }

    @Test
    public void shouldSumFoo() {
        assertEquals(1392.306, output.getFoo().getTotalAmount(), 0.01);
    }

    @Test
    public void shouldFindMaxFoo() {
        assertEquals(653, output.getFoo().getMax(), 0.01);
    }

    @Test
    public void shouldFindMinFoo() {
        assertEquals(10, output.getFoo().getMin(), 0.01);
    }

    @Test
    public void shouldFindAverageFoo() {
        assertEquals(174.03825, output.getFoo().getAverage(), 0.01);
    }

    @Test
    public void shouldCountBar() {
        assertEquals(5, output.getBar().getCount());
    }

    @Test
    public void shouldCountFooBar() {
        assertEquals(2, output.getFooBar().getCount());
    }
}
