package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: d  reason: collision with root package name */
    private T f2941d;

    public T next() {
        if (hasNext()) {
            int i = this.f2929c + 1;
            this.f2929c = i;
            if (i == 0) {
                T t = this.f2928b.get(0);
                this.f2941d = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.f2941d.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) this.f2941d).a(i);
            }
            return this.f2941d;
        }
        int i2 = this.f2929c;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
