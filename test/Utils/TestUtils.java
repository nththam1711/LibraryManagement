/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JMenu;

/**
 *
 * @author ASUS
 */
public class TestUtils {

    public static Component getChildName(Component parent, String name) {
        // Debug line
        //System.out.println("Class: " + parent.getClass() +
        //    " Name: " + parent.getName());

        if (name.equals(parent.getName())) {
            return parent;
        }

        if (parent instanceof Container) {
            Component[] children = (parent instanceof JMenu) ? ((JMenu) parent).getMenuComponents() : ((Container) parent).getComponents() ;
            for (int i = 0; i < children.length; i++) {
                Component child = getChildName(children[i], name);
//                child.getName()
                if (child != null) {
                    return child;
                }
            }
        }

        return null;
    }

}
