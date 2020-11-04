package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class t3 extends q3<FieldDescriptorType, Object> {
    t3(int i) {
        super(i, (t3) null);
    }

    public final void e() {
        if (!i()) {
            for (int i = 0; i < j(); i++) {
                Map.Entry h = h(i);
                if (((zzfg) h.getKey()).d()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((zzfg) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
