/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cpd4414.assign2;

import cpd4414.assign2.OrderQueue;
import cpd4414.assign2.Purchase;
import cpd4414.assign2.Order;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class OrderQueueTest {
    
    public OrderQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWhenCustomerExistsAndPurchasesExistThenTimeReceivedIsNow() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("CUST00001", "ABC Construction");
        order.addPurchase(new Purchase("PROD0004", 450));
        order.addPurchase(new Purchase("PROD0006", 250));
        orderQueue.add(order);
        
        long expResult = new Date().getTime();
        long result = order.getTimeReceived().getTime();
        assertTrue(Math.abs(result - expResult) < 1000);
    }
     @Test
    public void testWhenCustomerNotExistsAndPurchasesNotExistThenThrowException() {
        boolean catchit = false;
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("", "");
        order.addPurchase(new Purchase("PROD0004", 450));
        order.addPurchase(new Purchase("PROD0006", 250));
       try {
        orderQueue.add(order);
       } catch(Exception ex) {
          catchit = true; 
       }
         assertTrue(catchit);
    }
    @Test
    public void testWhenPurchaseNotExistThrowException() {
        boolean catchit = false;
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("CUST00001", "ABC Construction");
       try {
        orderQueue.add(order);
       } catch(Exception ex) {
          catchit = true; 
       }
         assertTrue(catchit);
    }
    @Test
    public void testReceiveNextOrder() {
    }
    @Test
    public void testNoReceivedtOrderReturnNull() {
    }
    @Test
    public void testProcessPurchasesWithTimeRecivedAndItemsInStock() {
    }
    @Test
    public void testProcessPurchasesWithoutTimeRecivedThrowException() {
    }
    @Test
    public void testFulfillProcessedOrders() {
    }

    /**
     * Test of add method, of class OrderQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Order order = null;
        OrderQueue instance = new OrderQueue();
        instance.add(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Next method, of class OrderQueue.
     */
    @Test
    public void testNext() throws Exception {
        System.out.println("Next");
        OrderQueue instance = new OrderQueue();
        Order expResult = null;
        Order result = instance.Next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Process method, of class OrderQueue.
     */
    @Test
    public void testProcess() throws Exception {
        System.out.println("Process");
        Order order = null;
        OrderQueue instance = new OrderQueue();
        instance.Process(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Fulfill method, of class OrderQueue.
     */
    @Test
    public void testFulfill() throws Exception {
        System.out.println("Fulfill");
        Order order = null;
        OrderQueue instance = new OrderQueue();
        instance.Fulfill(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
