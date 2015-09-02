/*
 * @(#)Startup.java		Created at 2014年10月14日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.startup;

import org.azolla.l.ling.cfg.PropCfg;
import org.azolla.l.ling.util.Log0;
import org.azolla.p.tzfe.i18n.I18N;
import org.azolla.p.tzfe.panel.TzfePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * The coder is very lazy for this Startup class
 *
 * @author sk@azolla.org
 * @since ADK1.0
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
        SwingUtilities.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                //do nothing
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI()
    {
        Log0.info(Startup.class,"2048 starting...");
        //do nothing
        JFrame tzfeFrame = new JFrame();
        tzfeFrame.setLayout(new BorderLayout());
        tzfeFrame.add(TzfePanel.single(), BorderLayout.CENTER);
        tzfeFrame.setTitle(getTitle());
        tzfeFrame.setSize(TzfePanel.W, TzfePanel.H);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        tzfeFrame.setLocation((int) (screen.getWidth() - TzfePanel.W) / 2, (int) (screen.getHeight() - TzfePanel.H) / 2);
        tzfeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tzfeFrame.setResizable(false);
        tzfeFrame.setVisible(true);
        Log0.info(Startup.class,"2048 started");
    }

    public static String getTitle()
    {
        return I18N.get("artifact") + " - " + I18N.get("version");
    }

}
