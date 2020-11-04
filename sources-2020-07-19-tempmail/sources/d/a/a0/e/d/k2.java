package d.a.a0.e.d;

import d.a.a0.d.b;
import d.a.l;
import d.a.s;

/* compiled from: ObservableRangeLong */
public final class k2 extends l<Long> {

    /* renamed from: b  reason: collision with root package name */
    private final long f13167b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13168c;

    /* compiled from: ObservableRangeLong */
    static final class a extends b<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Long> f13169b;

        /* renamed from: c  reason: collision with root package name */
        final long f13170c;

        /* renamed from: d  reason: collision with root package name */
        long f13171d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13172e;

        a(s<? super Long> sVar, long j, long j2) {
            this.f13169b = sVar;
            this.f13171d = j;
            this.f13170c = j2;
        }

        /* renamed from: a */
        public Long poll() throws Exception {
            long j = this.f13171d;
            if (j != this.f13170c) {
                this.f13171d = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }

        public void clear() {
            this.f13171d = this.f13170c;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f13172e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f13171d == this.f13170c;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.f13172e) {
                s<? super Long> sVar = this.f13169b;
                long j = this.f13170c;
                for (long j2 = this.f13171d; j2 != j && get() == 0; j2++) {
                    sVar.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    sVar.onComplete();
                }
            }
        }
    }

    public k2(long j, long j2) {
        this.f13167b = j;
        this.f13168c = j2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Long> sVar) {
        long j = this.f13167b;
        a aVar = new a(sVar, j, j + this.f13168c);
        sVar.onSubscribe(aVar);
        aVar.run();
    }
}
