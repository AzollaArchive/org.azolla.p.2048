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
        COLOR_MAP.put(0, new Color(128, 128, 128, 0));
    }
}
