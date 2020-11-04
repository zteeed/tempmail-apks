package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.internal.measurement.zzdw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzdw<MessageType extends zzdw<MessageType, BuilderType>, BuilderType extends zzdv<MessageType, BuilderType>> implements zzgw {
    protected int zza = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        zzfr.d(iterable);
        if (iterable instanceof zzgh) {
            List<?> d2 = ((zzgh) iterable).d();
            zzgh zzgh = (zzgh) list;
            int size = list.size();
            for (Object next : d2) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzgh.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzgh.size() - 1; size2 >= size; size2--) {
                        zzgh.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzeg) {
                    zzgh.S((zzeg) next);
                } else {
                    zzgh.add((String) next);
                }
            }
        } else if (iterable instanceof j3) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    public final zzeg d() {
        try {
            q1 z = zzeg.z(i());
            g(z.b());
            return z.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final byte[] j() {
        try {
            byte[] bArr = new byte[i()];
            zzev f2 = zzev.f(bArr);
            g(f2);
            f2.N();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
