package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class d80 extends e80<FieldDescriptorType, Object> {
    d80(int i) {
        super(i, (d80) null);
    }

    public final void g() {
        if (!a()) {
            for (int i = 0; i < h(); i++) {
                Map.Entry p = p(i);
                if (((zzefw) p.getKey()).F()) {
                    p.setValue(Collections.unmodifiableList((List) p.getValue()));
                }
            }
            for (Map.Entry entry : i()) {
                if (((zzefw) entry.getKey()).F()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }
}
