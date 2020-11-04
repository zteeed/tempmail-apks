package com.google.zxing.w.c0.g;

import java.util.List;

/* compiled from: BitArrayBuilder */
final class a {
    static com.google.zxing.t.a a(List<b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).d() == null) {
            size--;
        }
        com.google.zxing.t.a aVar = new com.google.zxing.t.a(size * 12);
        int i = 0;
        int b2 = list.get(0).d().b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b2) != 0) {
                aVar.t(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            b bVar = list.get(i3);
            int b3 = bVar.c().b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b3) != 0) {
                    aVar.t(i);
                }
                i++;
            }
            if (bVar.d() != null) {
                int b4 = bVar.d().b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b4) != 0) {
                        aVar.t(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
