/*
 * @(#)TzfePanel.java		Created at 2014年10月14日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.panel;

import javax.swing.JFrame;

/**
 * The coder is very lazy for this TzfePanel class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class TzfePanel extends JFrame
{

    /**
     * 
     */
    private static final long serialVersionUID = 7581667051127144281L;

    private static TzfePanel  instance;

    public static TzfePanel single()
    {
        return instance = null == instance ? new TzfePanel() : instance;
    }

    private TzfePanel()
    {
        super();
        initUI();
        initListener();
    }

    /**
     * The coder is very lazy for this initListener method
     *  void
     */
    private void initListener()
    {
        //do nothing

    }

    /**
     * The coder is very lazy for this initUI method
     *  void
     */
    private void initUI()
    {
        //do nothing

    }

}
