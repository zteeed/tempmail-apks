package com.tempmail.utils;

import android.os.Environment;
import android.util.Log;
import com.tempmail.utils.y.b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/* compiled from: Log */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12576a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12577b = false;

    public static void a(String str, String str2) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File file = new File(externalStorageDirectory + "/" + b.f12596c + ".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.append(new Date().toString() + " " + str + " " + str2);
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (SecurityException unused) {
        }
    }

    public static void b(String str, String str2) {
        if (f12577b) {
            Log.d(str, str2);
        }
        if (f12576a) {
            a(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f12577b) {
            Log.e(str, str2);
        }
        if (f12576a) {
            a(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (f12577b) {
            Log.i(str, str2);
        }
        if (f12576a) {
            a(str, str2);
        }
    }

    public static boolean e() {
        return f12576a;
    }

    public static void f(String str, String str2) {
        if (f12577b) {
            Log.w(str, str2);
        }
        if (f12576a) {
            a(str, str2);
        }
    }
}
