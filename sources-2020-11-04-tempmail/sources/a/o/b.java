package a.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: MultiDexExtractor */
final class b implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final File f480b;

    /* renamed from: c  reason: collision with root package name */
    private final long f481c;

    /* renamed from: d  reason: collision with root package name */
    private final File f482d;

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f483e;

    /* renamed from: f  reason: collision with root package name */
    private final FileChannel f484f;
    private final FileLock g;

    /* compiled from: MultiDexExtractor */
    class a implements FileFilter {
        a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: a.o.b$b  reason: collision with other inner class name */
    /* compiled from: MultiDexExtractor */
    private static class C0024b extends File {

        /* renamed from: b  reason: collision with root package name */
        public long f486b = -1;

        public C0024b(File file, String str) {
            super(file, str);
        }
    }

    b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f480b = file;
        this.f482d = file2;
        this.f481c = g(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f483e = randomAccessFile;
        try {
            this.f484f = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.g = this.f484f.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                b(this.f484f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                b(this.f484f);
                throw e;
            } catch (Error e4) {
                e = e4;
                b(this.f484f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            b(this.f483e);
            throw e5;
        }
    }

    private void a() {
        File[] listFiles = this.f482d.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f482d.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    private static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    b(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            b(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    private static SharedPreferences e(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long f(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long g(File file) throws IOException {
        long c2 = c.c(file);
        return c2 == -1 ? c2 - 1 : c2;
    }

    private static boolean h(Context context, File file, long j, String str) {
        SharedPreferences e2 = e(context);
        if (e2.getLong(str + "timestamp", -1) == f(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return e2.getLong(sb.toString(), -1) != j;
        }
    }

    private List<C0024b> m(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f480b.getName() + ".classes";
        SharedPreferences e2 = e(context);
        int i = e2.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C0024b bVar = new C0024b(this.f482d, str3 + i2 + ".zip");
            if (bVar.isFile()) {
                bVar.f486b = g(bVar);
                long j = e2.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = e2.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = e2;
                    if (j == bVar.f486b) {
                        arrayList.add(bVar);
                        i2++;
                        e2 = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f486b);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    private List<C0024b> n() throws IOException {
        C0024b bVar;
        boolean z;
        String str = this.f480b.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f480b);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                bVar = new C0024b(this.f482d, str + i + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    d(zipFile, entry, bVar, str);
                    bVar.f486b = g(bVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f486b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (IOException e3) {
            Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e3);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e4) {
                Log.w("MultiDex", "Failed to close resource", e4);
            }
            throw th2;
        }
    }

    private static void o(Context context, String str, long j, long j2, List<C0024b> list) {
        SharedPreferences.Editor edit = e(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C0024b next : list) {
            edit.putLong(str + "dex.crc." + i, next.f486b);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    public void close() throws IOException {
        this.g.release();
        this.f484f.close();
        this.f483e.close();
    }

    /* access modifiers changed from: package-private */
    public List<? extends File> k(Context context, String str, boolean z) throws IOException {
        List<C0024b> list;
        List<C0024b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f480b.getPath() + ", " + z + ", " + str + ")");
        if (this.g.isValid()) {
            if (z || h(context, this.f480b, this.f481c, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = n();
                o(context, str, f(this.f480b), this.f481c, list2);
            } else {
                try {
                    list = m(context, str);
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                    list2 = n();
                    o(context, str, f(this.f480b), this.f481c, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
