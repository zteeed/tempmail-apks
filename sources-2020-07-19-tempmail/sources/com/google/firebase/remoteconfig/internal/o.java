package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class o {
    public static Map<String, String> a(Context context, int i) {
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                return hashMap;
            }
            XmlResourceParser xml = resources.getXml(i);
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    str = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals("entry")) {
                        if (str2 == null || str3 == null) {
                            Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                        } else {
                            hashMap.put(str2, str3);
                        }
                        str2 = null;
                        str3 = null;
                    }
                    str = null;
                } else if (eventType == 4 && str != null) {
                    char c2 = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != 106079) {
                        if (hashCode == 111972721) {
                            if (str.equals("value")) {
                                c2 = 1;
                            }
                        }
                    } else if (str.equals("key")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        str2 = xml.getText();
                    } else if (c2 != 1) {
                        Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                    } else {
                        str3 = xml.getText();
                    }
                }
            }
            return hashMap;
        } catch (IOException | XmlPullParserException e2) {
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e2);
        }
    }
}
