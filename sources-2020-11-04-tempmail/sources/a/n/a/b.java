package a.n.a;

import a.e.h;
import a.n.b.a;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl */
class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f468c = false;

    /* renamed from: a  reason: collision with root package name */
    private final k f469a;

    /* renamed from: b  reason: collision with root package name */
    private final c f470b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends p<D> implements a.C0021a<D> {
        private final int k;
        private final Bundle l;
        private final a.n.b.a<D> m;
        private k n;
        private C0020b<D> o;
        private a.n.b.a<D> p;

        /* access modifiers changed from: protected */
        public void g() {
            if (b.f468c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.f();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void h() {
            if (b.f468c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.g();
        }

        public void j(q<? super D> qVar) {
            super.j(qVar);
            this.n = null;
            this.o = null;
        }

        public void l(D d2) {
            super.l(d2);
            a.n.b.a<D> aVar = this.p;
            if (aVar != null) {
                aVar.e();
                this.p = null;
            }
        }

        /* access modifiers changed from: package-private */
        public a.n.b.a<D> m(boolean z) {
            if (b.f468c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.b();
            this.m.a();
            C0020b<D> bVar = this.o;
            if (bVar != null) {
                j(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.m.h(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.m;
            }
            this.m.e();
            return this.p;
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            a.n.b.a<D> aVar = this.m;
            aVar.d(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                C0020b<D> bVar = this.o;
                bVar.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(o().c(d()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(e());
        }

        /* access modifiers changed from: package-private */
        public a.n.b.a<D> o() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            k kVar = this.n;
            C0020b<D> bVar = this.o;
            if (kVar != null && bVar != null) {
                super.j(bVar);
                f(kVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            a.h.j.a.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.n.a.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0020b<D> implements q<D> {
        public abstract void b(String str, PrintWriter printWriter);

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract void d();
    }

    /* compiled from: LoaderManagerImpl */
    static class c extends w {

        /* renamed from: d  reason: collision with root package name */
        private static final x.b f471d = new a();

        /* renamed from: c  reason: collision with root package name */
        private h<a> f472c = new h<>();

        /* compiled from: LoaderManagerImpl */
        static class a implements x.b {
            a() {
            }

            public <T extends w> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(y yVar) {
            return (c) new x(yVar, f471d).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            int o = this.f472c.o();
            for (int i = 0; i < o; i++) {
                this.f472c.p(i).m(true);
            }
            this.f472c.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f472c.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f472c.o(); i++) {
                    a p = this.f472c.p(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f472c.k(i));
                    printWriter.print(": ");
                    printWriter.println(p.toString());
                    p.n(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int o = this.f472c.o();
            for (int i = 0; i < o; i++) {
                this.f472c.p(i).p();
            }
        }
    }

    b(k kVar, y yVar) {
        this.f469a = kVar;
        this.f470b = c.g(yVar);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f470b.f(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f470b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.h.j.a.a(this.f469a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
