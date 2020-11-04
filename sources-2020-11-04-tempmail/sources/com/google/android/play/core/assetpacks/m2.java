package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

final class m2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11335a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static List<File> a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(l2.f11323a);
        if (listFiles != null) {
            fileArr = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr[parseInt] != null) {
                    throw new v0("Metadata folder ordering corrupt.");
                }
                fileArr[parseInt] = file3;
            }
        } else {
            fileArr = new File[0];
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    q2 b2 = new m0(fileInputStream).b();
                    if (b2.b() != null) {
                        File file5 = new File(file, b2.b());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new v0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new v0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    x.a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
