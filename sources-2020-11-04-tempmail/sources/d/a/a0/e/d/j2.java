package d.a.a0.e.d;

import d.a.a0.d.b;
import d.a.l;
import d.a.s;

/* compiled from: ObservableRange */
public final class j2 extends l<Integer> {

    /* renamed from: b  reason: collision with root package name */
    private final int f13695b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13696c;

    /* compiled from: ObservableRange */
    static final class a extends b<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Integer> f13697b;

        /* renamed from: c  reason: collision with root package name */
        final long f13698c;

        /* renamed from: d  reason: collision with root package name */
        long f13699d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13700e;

        a(s<? super Integer> sVar, long j, long j2) {
            this.f13697b = sVar;
            this.f13699d = j;
            this.f13698c = j2;
        }

        /* renamed from: a */
        public Integer poll() throws Exception {
            long j = this.f13699d;
            if (j != this.f13698c) {
                this.f13699d = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public void clear() {
            this.f13699d = this.f13698c;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f13700e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f13699d == this.f13698c;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.f13700e) {
                s<? super Integer> sVar = this.f13697b;
                long j = this.f13698c;
                for (long j2 = this.f13699d; j2 != j && get() == 0; j2++) {
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
        this.f13695b = i;
        this.f13696c = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super Integer> sVar) {
        a aVar = new a(sVar, (long) this.f13695b, this.f13696c);
        sVar.onSubscribe(aVar);
        aVar.run();
    }
}
