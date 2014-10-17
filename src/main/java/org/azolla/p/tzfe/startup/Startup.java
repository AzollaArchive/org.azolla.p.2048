/*
 * @(#)Startup.java		Created at 2014年10月14日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.startup;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.azolla.p.tzfe.panel.TzfePanel;

/**
 * The coder is very lazy for this Startup class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class Startup
{

    /**
     * The coder is very lazy for this main method
     * 
     * @param args void
     */
    public static void main(String[] args)
    {
        //do nothing
        TzfePanel tzfePanel = TzfePanel.single();
        tzfePanel.setTitle("2048");
        tzfePanel.setSize(TzfePanel.W, TzfePanel.H);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        tzfePanel.setLocation((int) (screen.getWidth() - TzfePanel.W) / 2, (int) (screen.getHeight() - TzfePanel.H) / 2);
        tzfePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tzfePanel.setResizable(false);
        tzfePanel.setVisible(true);
    }

}
