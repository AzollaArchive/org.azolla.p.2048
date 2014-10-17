/*
 * @(#)GridButton.java		Created at 2014年10月14日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.model;

import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;

import org.azolla.p.tzfe.cons.ColorCons;

/**
 * The coder is very lazy for this GridButton class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class GridButton extends JButton
{

    /**
     * 
     */
    private static final long serialVersionUID = 1103838465571228907L;

    private int               number;

    private int               xValue;

    private int               yValue;

    /**
     * This is a constructor
     *
     */
    public GridButton()
    {
        //do nothing
        this(0, 0);
    }

    public GridButton(int xValue, int yVlaue)
    {
        //do nothing
        super();
        this.xValue = xValue;
        this.yValue = yVlaue;
        number = 0;
        setFont(new Font("Courier New", Font.BOLD, 32));
    }

    /**
     * @see java.awt.Component#addMouseListener(java.awt.event.MouseListener)
     * @param l
     */
    @Override
    public synchronized void addMouseListener(MouseListener l)
    {
        //do nothing
        //        super.addMouseListener(l);
    }

    /**
     * @see java.awt.Component#addMouseMotionListener(java.awt.event.MouseMotionListener)
     * @param l
     */
    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l)
    {
        //do nothing
        //        super.addMouseMotionListener(l);
    }

    /**
     * @see java.awt.Component#addMouseWheelListener(java.awt.event.MouseWheelListener)
     * @param l
     */
    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l)
    {
        //do nothing
        //        super.addMouseWheelListener(l);
    }

    /**
     * this is a getter method for number
     *
     * @return the number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * this is a setter method for number
     *
     * @param number the number to set
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * this is a getter method for xValue
     *
     * @return the xValue
     */
    public int getxValue()
    {
        return xValue;
    }

    /**
     * this is a setter method for xValue
     *
     * @param xValue the xValue to set
     */
    public void setxValue(int xValue)
    {
        this.xValue = xValue;
    }

    /**
     * this is a getter method for yValue
     *
     * @return the yValue
     */
    public int getyValue()
    {
        return yValue;
    }

    /**
     * this is a setter method for yValue
     *
     * @param yValue the yValue to set
     */
    public void setyValue(int yValue)
    {
        this.yValue = yValue;
    }

    /**
     * @see javax.swing.AbstractButton#getText()
     * @return
     */
    @Override
    public String getText()
    {
        setEnabled(0 == number ? false : true);
        setBackground(ColorCons.COLOR_MAP.get(number));
        return "" + (0 == number ? "" : number);
    }
}
