package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzeeh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzeeh<MessageType extends zzeeh<MessageType, BuilderType>, BuilderType extends zzeeg<MessageType, BuilderType>> implements zzehl {
    protected int zzhzi = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        zzegd.a(iterable);
        if (iterable instanceof zzegw) {
            List<?> E = ((zzegw) iterable).E();
            zzegw zzegw = (zzegw) list;
            int size = list.size();
            for (Object next : E) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzegw.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzegw.size() - 1; size2 >= size; size2--) {
                        zzegw.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzeer) {
                    zzegw.n((zzeer) next);
                } else {
                    zzegw.add((String) next);
                }
            }
        } else if (iterable instanceof q70) {
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

    public final zzeer e() {
        try {
            w50 G = zzeer.G(f());
            i(G.b());
            return G.a();
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

    public final byte[] g() {
        try {
            byte[] bArr = new byte[f()];
            zzefl E0 = zzefl.E0(bArr);
            i(E0);
            E0.E();
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
    public int h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void j(int i) {
        throw new UnsupportedOperationException();
    }
}
