/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.KhachHang;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class KhachHangDataTest {
    
    public KhachHangDataTest() {
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

    /**
     * Test of dangNhap method, of class KhachHangData.
     */
    @org.junit.Test
    public void testDangNhap() {
        System.out.println("dangNhap");
        String taiKhoan = "";
        String pass = "";
        KhachHangData instance = new KhachHangData();
        KhachHang expResult = null;
        KhachHang result = instance.dangNhap(taiKhoan, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTextfield method, of class KhachHangData.
     */
    @org.junit.Test
    public void testShowTextfield() {
        System.out.println("showTextfield");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = KhachHangData.showTextfield(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertKhachHang method, of class KhachHangData.
     */
    @org.junit.Test
    public void testInsertKhachHang() {
        System.out.println("InsertKhachHang");
        KhachHang kh = null;
        KhachHangData.InsertKhachHang(kh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateKhachHang method, of class KhachHangData.
     */
    @org.junit.Test
    public void testUpdateKhachHang() {
        System.out.println("UpdateKhachHang");
        KhachHang kh = null;
        KhachHangData instance = new KhachHangData();
        boolean expResult = false;
        boolean result = instance.UpdateKhachHang(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteKhachHang method, of class KhachHangData.
     */
    @org.junit.Test
    public void testDeleteKhachHang() {
        System.out.println("DeleteKhachHang");
        String maKH = "";
        KhachHangData instance = new KhachHangData();
        boolean expResult = false;
        boolean result = instance.DeleteKhachHang(maKH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
