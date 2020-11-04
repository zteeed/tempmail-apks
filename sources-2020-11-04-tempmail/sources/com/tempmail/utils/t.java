package com.tempmail.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tempmail.utils.y.d;

/* compiled from: SharedPreferenceMainHelper */
public abstract class t {
    public static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : -1;
    }

    public static boolean b(Context context, String str, boolean z) {
        return context.getSharedPreferences(d.f13145a, 0).getBoolean(str, z);
    }

    public static Boolean c(Context context, String str, int i) {
        return h(context.getSharedPreferences(d.f13145a, 0).getInt(str, i));
    }

    public static Float d(Context context, String str, float f2) {
        return Float.valueOf(context.getSharedPreferences(d.f13145a, 0).getFloat(str, f2));
    }

    public static int e(Context context, String str, int i) {
        return context.getSharedPreferences(d.f13145a, 0).getInt(str, i);
    }

    public static long f(Context context, String str, long j) {
        return context.getSharedPreferences(d.f13145a, 0).getLong(str, j);
    }

    public static String g(Context context, String str, String str2) {
        return context.getSharedPreferences(d.f13145a, 0).getString(str, str2);
    }

    public static Boolean h(int i) {
        if (i > 0) {
            return Boolean.TRUE;
        }
        if (i < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static void i(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void j(Context context, String str, Boolean bool) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putInt(str, a(bool));
        edit.apply();
    }

    public static void k(Context context, String str, float f2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putFloat(str, f2);
        edit.apply();
    }

    public static void l(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void m(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void n(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(d.f13145a, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
