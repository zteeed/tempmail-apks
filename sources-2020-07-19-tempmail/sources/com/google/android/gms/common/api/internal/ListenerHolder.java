package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;

@KeepForSdk
public final class ListenerHolder<L> {

    /* renamed from: a  reason: collision with root package name */
    private final a f2755a;

    /* renamed from: b  reason: collision with root package name */
    private final ListenerKey<L> f2756b;

    @KeepForSdk
    public static final class ListenerKey<L> {

        /* renamed from: a  reason: collision with root package name */
        private final L f2757a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2758b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f2757a == listenerKey.f2757a && this.f2758b.equals(listenerKey.f2758b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2757a) * 31) + this.f2758b.hashCode();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
    }

    private final class a extends zap {
    }

    @KeepForSdk
    public final void a() {
    }

    @KeepForSdk
    public final ListenerKey<L> b() {
        return this.f2756b;
    }

    @KeepForSdk
    public final void c(Notifier<? super L> notifier) {
        Preconditions.l(notifier, "Notifier must not be null");
        this.f2755a.sendMessage(this.f2755a.obtainMessage(1, notifier));
    }
}
