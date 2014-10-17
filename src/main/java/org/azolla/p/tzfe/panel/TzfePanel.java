/*
 * @(#)TzfePanel.java		Created at 2014年10月14日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.panel;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.azolla.p.tzfe.cons.NumCons;
import org.azolla.p.tzfe.model.GridButton;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

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
    private static final long              serialVersionUID = 7581667051127144281L;

    public static final int                W                = 400;
    public static final int                H                = 400;

    public static Map<Integer, GridButton> gridButtonMap    = Maps.newHashMap();

    private static TzfePanel               instance;

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
        addKeyListener(new KeyAdapter()
        {
            /**
             * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
             * @param e
             */
            @Override
            public void keyPressed(KeyEvent e)
            {
                boolean goodjob = false;
                //do nothing
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    goodjob = up();
                }

                if(!goodjob)
                {
                    return;
                }

                //TODO
            }
        });
    }

    private boolean up()
    {
        boolean movinged = false;
        boolean computinged[] = {false, false, false, false};

        return movinged || computinged[0] || computinged[1] || computinged[2] || computinged[3];
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
     * The coder is very lazy for this initUI method
     *  void
     */
    private void initUI()
    {
        //do nothing
        setLayout(new GridLayout(4, 4, 3, 3));

        GridButton gridButton;
        for(int i = 0; i < 16; i++)
        {
            gridButton = new GridButton(i / 4, i % 4);
            add(gridButton);
            gridButtonMap.put(i, gridButton);
        }

        roundGridButton().setNumber(NumCons.NUM_LIST.get(Math.abs(new Random().nextInt()) % NumCons.NUM_LIST.size()));
        SwingUtilities.updateComponentTreeUI(getContentPane());
    }

    private GridButton roundGridButton()
    {
        GridButton gridButton = null;
        List<GridButton> freeGridButtonList = Lists.newArrayList();
        for(int i = 0; i < 16; i++)
        {
            gridButton = gridButtonMap.get(i);
            if(gridButton.getNumber() == 0)
            {
                freeGridButtonList.add(gridButton);
            }
        }
        gridButton = null;
        if(freeGridButtonList.size() > 0)
        {
            gridButton = freeGridButtonList.get(Math.abs(new Random().nextInt()) % freeGridButtonList.size());
        }
        return gridButton;
    }

}
