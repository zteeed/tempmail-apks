package com.tempmail.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* compiled from: MyContextWrapper */
public class o extends ContextWrapper {
    public o(Context context) {
        super(context);
    }

    @TargetApi(24)
    public static Locale a(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    public static Locale b(Configuration configuration) {
        return configuration.locale;
    }

    @TargetApi(24)
    public static void c(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    public static void d(Configuration configuration, Locale locale) {
        configuration.locale = locale;
    }

    public static ContextWrapper e(Context context, String str) {
        Locale locale;
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT > 24) {
            locale = a(configuration);
        } else {
            locale = b(configuration);
        }
        if (!str.equals("") && !locale.getLanguage().equals(str)) {
            Locale locale2 = new Locale(str);
            Locale.setDefault(locale2);
            if (Build.VERSION.SDK_INT >= 24) {
                c(configuration, locale2);
            } else {
                d(configuration, locale2);
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            context = context.createConfigurationContext(configuration);
        } else {
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
        return new o(context);
    }
}
