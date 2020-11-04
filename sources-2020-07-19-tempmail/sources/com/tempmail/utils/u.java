package com.tempmail.utils;

import android.content.Context;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import com.tempmail.R;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/* compiled from: StringUtils */
public class u {
    public static String a(Context context, int i, String str) {
        return context.getString(i).replace("__0__", str);
    }

    public static String b(Context context, int i, String str, String str2) {
        return context.getString(i).replace("__0__", str).replace("__1__", str2);
    }

    public static Spannable c(Context context, int i, int i2) {
        String string = context.getString(i);
        int indexOf = string.indexOf("**");
        int lastIndexOf = string.lastIndexOf("**") - 2;
        int indexOf2 = string.indexOf("++") - 4;
        int lastIndexOf2 = string.lastIndexOf("++") - 6;
        SpannableString spannableString = new SpannableString(string.replace("**", "").replace("++", ""));
        StyleSpan styleSpan = new StyleSpan(1);
        StyleSpan styleSpan2 = new StyleSpan(1);
        spannableString.setSpan(styleSpan, indexOf, lastIndexOf, 18);
        spannableString.setSpan(new URLSpan(context.getString(R.string.tos_link)), indexOf, lastIndexOf, 18);
        spannableString.setSpan(new ForegroundColorSpan(i2), indexOf, lastIndexOf, 18);
        spannableString.setSpan(styleSpan2, indexOf2, lastIndexOf2, 18);
        spannableString.setSpan(new URLSpan(context.getString(R.string.privacy_link)), indexOf2, lastIndexOf2, 18);
        spannableString.setSpan(new ForegroundColorSpan(i2), indexOf2, lastIndexOf2, 18);
        return spannableString;
    }

    public static Uri d(String str) {
        try {
            return Uri.parse(new URL(str).toURI().toString());
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return null;
        } catch (URISyntaxException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
