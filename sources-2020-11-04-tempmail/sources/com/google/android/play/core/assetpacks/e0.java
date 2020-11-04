package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

final class e0 extends p {

    /* renamed from: b  reason: collision with root package name */
    private final File f11230b;

    /* renamed from: c  reason: collision with root package name */
    private final File f11231c;

    /* renamed from: d  reason: collision with root package name */
    private final NavigableMap<Long, File> f11232d = new TreeMap();

    e0(File file, File file2) throws IOException {
        this.f11230b = file;
        this.f11231c = file2;
        List<File> a2 = m2.a(this.f11230b, this.f11231c);
        if (!a2.isEmpty()) {
            int size = a2.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                File file3 = a2.get(i);
                this.f11232d.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new v0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{this.f11230b, this.f11231c}));
    }

    private final InputStream e(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f11232d.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new v0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    public final long a() {
        Map.Entry<Long, File> lastEntry = this.f11232d.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* access modifiers changed from: protected */
    public final InputStream b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new v0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= a()) {
            Long floorKey = this.f11232d.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f11232d.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new d0(e(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(j, floorKey));
            for (File fileInputStream : this.f11232d.subMap(floorKey, false, floorKey2, false).values()) {
                arrayList.add(new FileInputStream(fileInputStream));
            }
            arrayList.add(new d0(new FileInputStream((File) this.f11232d.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new v0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }
}
