package a.m.a;

import a.e.h;
import a.m.b.a;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl */
class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f464c = false;

    /* renamed from: a  reason: collision with root package name */
    private final g f465a;

    /* renamed from: b  reason: collision with root package name */
    private final c f466b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends l<D> implements a.C0021a<D> {
        private final int j;
        private final Bundle k;
        private final a.m.b.a<D> l;
        private g m;
        private C0020b<D> n;
        private a.m.b.a<D> o;

        /* access modifiers changed from: protected */
        public void g() {
            if (b.f464c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.f();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void h() {
            if (b.f464c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.g();
        }

        public void i(m<? super D> mVar) {
            super.i(mVar);
            this.m = null;
            this.n = null;
        }

        public void j(D d2) {
            super.j(d2);
            a.m.b.a<D> aVar = this.o;
            if (aVar != null) {
                aVar.e();
                this.o = null;
            }
        }

        /* access modifiers changed from: package-private */
        public a.m.b.a<D> k(boolean z) {
            if (b.f464c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.b();
            this.l.a();
            C0020b<D> bVar = this.n;
            if (bVar != null) {
                i(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.l.h(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.l;
            }
            this.l.e();
            return this.o;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            a.m.b.a<D> aVar = this.l;
            aVar.d(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.n != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.n);
                C0020b<D> bVar = this.n;
                bVar.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m().c(d()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(e());
        }

        /* access modifiers changed from: package-private */
        public a.m.b.a<D> m() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public void n() {
            g gVar = this.m;
            C0020b<D> bVar = this.n;
            if (gVar != null && bVar != null) {
                super.i(bVar);
                f(gVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            a.h.j.a.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.m.a.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0020b<D> implements m<D> {
        public abstract void b(String str, PrintWriter printWriter);

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract void d();
    }

    /* compiled from: LoaderManagerImpl */
    static class c extends p {

        /* renamed from: b  reason: collision with root package name */
        private static final q.a f467b = new a();

        /* renamed from: a  reason: collision with root package name */
        private h<a> f468a = new h<>();

        /* compiled from: LoaderManagerImpl */
        static class a implements q.a {
            a() {
            }

            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c c(r rVar) {
            return (c) new q(rVar, f467b).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void a() {
            super.a();
            int o = this.f468a.o();
            for (int i = 0; i < o; i++) {
                this.f468a.p(i).k(true);
            }
            this.f468a.c();
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f468a.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f468a.o(); i++) {
                    a p = this.f468a.p(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f468a.k(i));
                    printWriter.print(": ");
                    printWriter.println(p.toString());
                    p.l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int o = this.f468a.o();
            for (int i = 0; i < o; i++) {
                this.f468a.p(i).n();
            }
        }
    }

    b(g gVar, r rVar) {
        this.f465a = gVar;
        this.f466b = c.c(rVar);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f466b.b(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f466b.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.h.j.a.a(this.f465a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
