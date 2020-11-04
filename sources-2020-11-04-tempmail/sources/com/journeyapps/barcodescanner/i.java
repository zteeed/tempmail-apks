package com.journeyapps.barcodescanner;

import com.google.zxing.a;
import com.google.zxing.d;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: DefaultDecoderFactory */
public class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private Collection<a> f12737a;

    /* renamed from: b  reason: collision with root package name */
    private Map<d, ?> f12738b;

    /* renamed from: c  reason: collision with root package name */
    private String f12739c;

    /* renamed from: d  reason: collision with root package name */
    private int f12740d;

    public i() {
    }

    public e a(Map<d, ?> map) {
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.putAll(map);
        Map<d, ?> map2 = this.f12738b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<a> collection = this.f12737a;
        if (collection != null) {
            enumMap.put(d.POSSIBLE_FORMATS, collection);
        }
        String str = this.f12739c;
        if (str != null) {
            enumMap.put(d.CHARACTER_SET, str);
        }
        com.google.zxing.i iVar = new com.google.zxing.i();
        iVar.f(enumMap);
        int i = this.f12740d;
        if (i == 0) {
            return new e(iVar);
        }
        if (i == 1) {
            return new j(iVar);
        }
        if (i != 2) {
            return new e(iVar);
        }
        return new k(iVar);
    }

    public i(Collection<a> collection) {
        this.f12737a = collection;
    }

    public i(Collection<a> collection, Map<d, ?> map, String str, int i) {
        this.f12737a = collection;
        this.f12738b = map;
        this.f12739c = str;
        this.f12740d = i;
    }
}
