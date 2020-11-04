package d.a.a0.e.d;

import d.a.a0.d.b;
import d.a.l;
import d.a.s;

/* compiled from: ObservableRange */
public final class j2 extends l<Integer> {

    /* renamed from: b  reason: collision with root package name */
    private final int f13137b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13138c;

    /* compiled from: ObservableRange */
    static final class a extends b<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Integer> f13139b;

        /* renamed from: c  reason: collision with root package name */
        final long f13140c;

        /* renamed from: d  reason: collision with root package name */
        long f13141d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13142e;

        a(s<? super Integer> sVar, long j, long j2) {
            this.f13139b = sVar;
            this.f13141d = j;
            this.f13140c = j2;
        }

        /* renamed from: a */
        public Integer poll() throws Exception {
            long j = this.f13141d;
            if (j != this.f13140c) {
                this.f13141d = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public void clear() {
            this.f13141d = this.f13140c;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f13142e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f13141d == this.f13140c;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.f13142e) {
                s<? super Integer> sVar = this.f13139b;
                long j = this.f13140c;
                for (long j2 = this.f13141d; j2 != j && get() == 0; j2++) {
                    sVar.onNext(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    sVar.onComplete();
                }
            }
        }
    }

    public j2(int i, int i2) {
        this.f13137b = i;
        this.f13138c = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Integer> sVar) {
        a aVar = new a(sVar, (long) this.f13137b, this.f13138c);
        sVar.onSubscribe(aVar);
        aVar.run();
    }
}
