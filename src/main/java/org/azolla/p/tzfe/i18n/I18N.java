/*
 * @(#)I18N.java		Created at 15/8/27
 * 
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.tzfe.i18n;

import com.google.common.collect.Maps;
import org.azolla.l.ling.cfg.PropCfg;
import org.azolla.l.ling.util.Log0;

import java.util.Map;

/**
 * The coder is very lazy, nothing to write for this class
 *
 * @author sk@azolla.org
 * @since ADK1.0
 */
public class I18N
{
    public static PropCfg propCfg = null;

    public static Map<String, String> propMap = Maps.newHashMap();

    static
    {
        try
        {
            PropCfg.cfg("/i18n.Azolla.Cfg.properties");
        }
        catch (Exception e)
        {
            Log0.error(I18N.class, e.toString(), e);
        }
        propMap.put("title", "2048 Ver1.0.9");
    }

    public static String get(String key)
    {
        try
        {
            return propCfg.get(key);
        }
        catch (Exception e)
        {
            return propMap.get(key);
        }
    }

    public static void main(String[] args)
    {
        for(Map.Entry<String, String> entry : propMap.entrySet())
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
