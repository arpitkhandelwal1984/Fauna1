package com.singtel.fauna.util;

import java.util.Locale;

/**
 * Created by Arpit Khandelwal.
 */
public class LocaleUtil {

    public static String getCurrentLocale(){
        Locale currentLocale = Locale.getDefault();
        return currentLocale.getDisplayLanguage();
    }
}
