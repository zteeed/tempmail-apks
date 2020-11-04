package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdkj {

    /* renamed from: a  reason: collision with root package name */
    public final int f8311a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8312b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8313c;

    public zzdkj(int i, int i2, boolean z) {
        this.f8311a = i;
        this.f8312b = i2;
        this.f8313c = z;
    }

    static List<zzdkj> a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzdkj(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
