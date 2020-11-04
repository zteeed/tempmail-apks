package com.tempmail.utils;

import android.content.Context;
import java.util.Locale;

/* compiled from: LanguageHelper */
public class l {
    public static String a(Context context) {
        return Locale.forLanguageTag(w.m(context)).getLanguage();
    }
}
