package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.c;
import java.util.List;
import java.util.Map;

interface j3 {
    void K(List<String> list);

    void S(int i);

    c<List<String>> T(Map<String, Long> map);

    c<ParcelFileDescriptor> U(int i, String str, String str2, int i2);

    void V(int i, String str, String str2, int i2);

    void a(int i, String str);

    void d();
}
