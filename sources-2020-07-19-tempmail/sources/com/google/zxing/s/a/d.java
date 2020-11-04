package com.google.zxing.s.a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: DecodeHintManager */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11757a = "d";

    static {
        Pattern.compile(",");
    }

    public static Map<com.google.zxing.d, Object> a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
        for (com.google.zxing.d dVar : com.google.zxing.d.values()) {
            if (!(dVar == com.google.zxing.d.CHARACTER_SET || dVar == com.google.zxing.d.NEED_RESULT_POINT_CALLBACK || dVar == com.google.zxing.d.POSSIBLE_FORMATS)) {
                String name = dVar.name();
                if (extras.containsKey(name)) {
                    if (dVar.f().equals(Void.class)) {
                        enumMap.put(dVar, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(name);
                        if (dVar.f().isInstance(obj)) {
                            enumMap.put(dVar, obj);
                        } else {
                            Log.w(f11757a, "Ignoring hint " + dVar + " because it is not assignable from " + obj);
                        }
                    }
                }
            }
        }
        Log.i(f11757a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
