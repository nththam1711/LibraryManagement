/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Admin;
import java.sql.ResultSet;
import junit.framework.TestCase;

/**
 *
 * @author ASUS
 */
public class AdminDataTest extends TestCase {
    
    public AdminDataTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of dangNhap method, of class AdminData.
     */
    public void testDangNhap() {
        System.out.println("dangNhap");
        String taiKhoan = "";
        String pass = "";
        AdminData instance = new AdminData();
        Admin expResult = null;
        Admin result = instance.dangNhap(taiKhoan, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTextfield method, of class AdminData.
     */
    public void testShowTextfield() {
        System.out.println("showTextfield");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = AdminData.showTextfield(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateAdmin method, of class AdminData.
     */
    public void testUpdateAdmin() {
        System.out.println("UpdateAdmin");
        Admin ad = null;
        AdminData instance = new AdminData();
        boolean expResult = false;
        boolean result = instance.UpdateAdmin(ad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteAdmin method, of class AdminData.
     */
    public void testDeleteAdmin() {
        System.out.println("DeleteAdmin");
        String maAd = "";
        AdminData instance = new AdminData();
        boolean expResult = false;
        boolean result = instance.DeleteAdmin(maAd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
