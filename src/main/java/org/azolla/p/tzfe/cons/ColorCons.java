/*
 * @(#)ColorCons.java		Created at 2014年10月16日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.cons;

import java.awt.Color;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * The coder is very lazy for this ColorCons class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class ColorCons
{
    public static Map<Integer, Color> COLOR_MAP = Maps.newHashMap();

    static
    {
        COLOR_MAP.put((int) Math.scalb(0, 0), new Color(255, 255, 255, 0));
        COLOR_MAP.put((int) Math.scalb(1, 1), new Color(255, 192, 192, 0));
        COLOR_MAP.put((int) Math.scalb(1, 2), new Color(255, 128, 128, 0));
        COLOR_MAP.put((int) Math.scalb(1, 3), new Color(255, 64, 64, 0));

        COLOR_MAP.put((int) Math.scalb(1, 4), new Color(192, 255, 255, 0));
        COLOR_MAP.put((int) Math.scalb(1, 5), new Color(192, 192, 192, 0));
        COLOR_MAP.put((int) Math.scalb(1, 6), new Color(192, 128, 128, 0));
        COLOR_MAP.put((int) Math.scalb(1, 7), new Color(192, 64, 64, 0));

        COLOR_MAP.put((int) Math.scalb(1, 8), new Color(128, 255, 255, 0));
        COLOR_MAP.put((int) Math.scalb(1, 9), new Color(128, 192, 192, 0));
        COLOR_MAP.put((int) Math.scalb(1, 10), new Color(128, 128, 128, 0));
        COLOR_MAP.put((int) Math.scalb(1, 11), new Color(128, 64, 64, 0));

        COLOR_MAP.put((int) Math.scalb(1, 12), new Color(64, 255, 255, 0));
        COLOR_MAP.put((int) Math.scalb(1, 13), new Color(64, 192, 192, 0));
        COLOR_MAP.put((int) Math.scalb(1, 14), new Color(64, 128, 128, 0));
        COLOR_MAP.put((int) Math.scalb(1, 15), new Color(64, 64, 64, 0));
    }
}
