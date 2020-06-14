/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Data.AdminData;
import Object.Admin;
import Utils.TestUtils;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import junit.framework.TestCase;
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
public class LoginTest extends TestCase {

    private JFrame testFrame;

    static Login login = new Login();

    public LoginTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start");

    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("End");
    }

    @Before
    public void setUp() {
        System.out.println("Start Test case");

    }

    @After
    public void tearDown() {
        System.out.println("End Test case");
    }

    @Test
    public void testLogin() throws Exception {
        String account = "123456";
        assertNotNull(login);

//        JRadioButton rbAdmin = (JRadioButton) TestUtils.getChildName(login, "rbAdmin");
//        assertNotNull(rbAdmin);
//        rbAdmin.setSelected(true);
//
//        JTextField txtTaiKhoan = (JTextField) TestUtils.getChildName(login, "txtTaiKhoan");
//        assertNotNull(txtTaiKhoan);
//        txtTaiKhoan.setText(account);
//
//        JPasswordField txtMatKhau = (JPasswordField) TestUtils.getChildName(login, "txtMatKhau");
//        assertNotNull(txtMatKhau);
//        txtMatKhau.setText(account);
//
//        JButton btLogin = (JButton) TestUtils.getChildName(login, "btLogin");
//        assertNotNull(btLogin);
//        btLogin.requestFocus();
        
        AdminData adminData = new AdminData();
        Admin adminExpected = new Admin("admin", "admin");
        
        Admin adminTest = adminData.dangNhap("admin", "admin");
        assertEquals(adminExpected.getMaAdmin(), adminTest.getMaAdmin());
        assertEquals(adminExpected.getPassword(), adminTest.getPassword());

        

    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
