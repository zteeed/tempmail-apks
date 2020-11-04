package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class c {
    public static c a(long j, Map<String, b> map) {
        return new h0(j, map);
    }

    public static c b(Bundle bundle, y0 y0Var) {
        return c(bundle, y0Var, new ArrayList());
    }

    public static c c(Bundle bundle, y0 y0Var, List<String> list) {
        return d(bundle, y0Var, list, a0.f11192a);
    }

    private static c d(Bundle bundle, y0 y0Var, List<String> list, z zVar) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, b.a(bundle, str, y0Var, zVar));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, b.b(str2, 4, 0, 0, 0, 0.0d));
        }
        return a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, b> e();

    public abstract long f();
}
