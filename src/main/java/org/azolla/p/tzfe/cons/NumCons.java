/*
 * @(#)NumCons.java		Created at 2014年10月17日
 * 
 * Copyright (c) 2011-2014 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.cons;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * The coder is very lazy for this NumCons class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class NumCons
{
    public static List<Integer> NUM_LIST = Lists.newArrayList();

    static
    {
        NUM_LIST.add((int) Math.scalb(1, 1));
        NUM_LIST.add((int) Math.scalb(1, 2));
    }
}
