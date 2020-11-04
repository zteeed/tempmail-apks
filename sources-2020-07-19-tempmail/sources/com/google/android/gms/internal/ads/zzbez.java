package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbez extends zzbes {
    private static final Set<String> g = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat h = new DecimalFormat("#,###");

    /* renamed from: e  reason: collision with root package name */
    private File f6218e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6219f;

    public zzbez(zzbdb zzbdb) {
        super(zzbdb);
        File cacheDir = this.f6215b.getCacheDir();
        if (cacheDir == null) {
            zzbba.i("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f6218e = file;
        if (!file.isDirectory() && !this.f6218e.mkdirs()) {
            String valueOf = String.valueOf(this.f6218e.getAbsolutePath());
            zzbba.i(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f6218e = null;
        } else if (!this.f6218e.setReadable(true, false) || !this.f6218e.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.f6218e.getAbsolutePath());
            zzbba.i(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f6218e = null;
        }
    }

    private final File y(File file) {
        return new File(this.f6218e, String.valueOf(file.getName()).concat(".done"));
    }

    public final void c() {
        this.f6219f = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v29, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ee, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f6, code lost:
        if (r1 < 400) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f8, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0208, code lost:
        if (r2.length() == 0) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020a, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0210, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023d, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0246, code lost:
        if (r7 >= 0) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0252, code lost:
        if (r1.length() == 0) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0254, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0259, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025f, code lost:
        com.google.android.gms.internal.ads.zzbba.i(r0);
        l(r9, r12.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        g.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0270, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = h.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwg.e().c(com.google.android.gms.internal.ads.zzaav.n)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0288, code lost:
        if (r7 <= r3) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.zzbba.i(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c3, code lost:
        if (r1.length() == 0) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c5, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ca, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d0, code lost:
        l(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        g.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02de, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.zzbba.f(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzq.zzld();
        r17 = r16.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0338, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r6 = new com.google.android.gms.internal.ads.zzbag(((java.lang.Long) com.google.android.gms.internal.ads.zzwg.e().c(com.google.android.gms.internal.ads.zzaav.q)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzwg.e().c(com.google.android.gms.internal.ads.zzaav.p)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0352, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0356, code lost:
        if (r20 < 0) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0358, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035a, code lost:
        if (r11 <= r3) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035c, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036c, code lost:
        if (r1.length() == 0) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036e, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0374, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0380, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0381, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0384, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038a, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038c, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0396, code lost:
        if (r2.write(r1) > 0) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0398, code lost:
        r1.clear();
        r24 = ((r16.a() - r17) > (1000 * r13) ? 1 : ((r16.a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a7, code lost:
        if (r24 > 0) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a9, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ad, code lost:
        if (r8.f6219f != false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03b3, code lost:
        if (r6.a() == false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b5, code lost:
        r21 = r12.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03bb, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03bd, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03bf, code lost:
        r24 = r10;
        r10 = com.google.android.gms.internal.ads.zzbaq.f6115b;
        r1 = r1;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r4 = r21;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03dd, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r1 = new com.google.android.gms.internal.ads.r8(r30, r31, r4, r11, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03e7, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ec, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fe, code lost:
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0412, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0421, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0422, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0455, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0456, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0459, code lost:
        r2 = r2.toString();
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0460, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0464, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0467, code lost:
        r27 = r4;
        r22 = r15;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x046e, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x047d, code lost:
        if (com.google.android.gms.internal.ads.zzbba.a(3) == false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x047f, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r1 = h.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.zzbba.f(r3.toString());
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b6, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b8, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04c7, code lost:
        if (r0.isFile() == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c9, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04d1, code lost:
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        r0.createNewFile();
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        i(r9, r12.getAbsolutePath(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04dd, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        g.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04eb, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ed, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04f3, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04fa, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04fd, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0503, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x050d, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x050e, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0518, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0519, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051c, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0522, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0525, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x052b, code lost:
        com.google.android.gms.ads.internal.zzq.zzla().e(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x053d, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r9);
        r3.append("\"");
        com.google.android.gms.internal.ads.zzbba.h(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0561, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.zzbba.d(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05a0, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05a5, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x03fe, code lost:
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.zzq.zzli();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwg.e().c(com.google.android.gms.internal.ads.zzaav.r)).intValue();
        r2 = new java.net.URL(r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014c, code lost:
        if (r3 > 20) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014e, code lost:
        r5 = r2.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.zzbau();
        r6.i(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.h(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0173, code lost:
        if ((r7 / 100) != 3) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (r4 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        r6 = new java.net.URL(r2, r4);
        r2 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0186, code lost:
        if (r2 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        if (r2.equals("http") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0196, code lost:
        if (r2.equals("https") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a4, code lost:
        if (r2.length() == 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a6, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ab, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b4, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b5, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bf, code lost:
        if (r4.length() == 0) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c1, code lost:
        r2 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c6, code lost:
        r2 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cc, code lost:
        com.google.android.gms.internal.ads.zzbba.f(r2);
        r5.disconnect();
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e4, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e9, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x04d4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b6 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v8 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v16 java.lang.String), (r22v16 java.lang.String) binds: [B:213:0x04d1, B:214:?, B:211:0x04c9, B:212:?, B:201:0x047f, B:202:?, B:171:0x03bd, B:174:0x03dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v4 java.lang.String) = (r24v12 java.lang.String), (r24v13 java.lang.String), (r24v15 java.lang.String), (r24v17 java.lang.String), (r24v19 java.lang.String), (r24v21 java.lang.String), (r24v26 java.lang.String), (r24v29 java.lang.String) binds: [B:213:0x04d1, B:214:?, B:211:0x04c9, B:212:?, B:201:0x047f, B:202:?, B:171:0x03bd, B:174:0x03dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v10 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v15 java.io.FileOutputStream), (r27v18 java.io.FileOutputStream) binds: [B:213:0x04d1, B:214:?, B:211:0x04c9, B:212:?, B:201:0x047f, B:202:?, B:171:0x03bd, B:174:0x03dd] A[DONT_GENERATE, DONT_INLINE], Splitter:B:174:0x03dd] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.f6218e
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r8.l(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.f6218e
            if (r0 != 0) goto L_0x0016
            r3 = 0
            goto L_0x0032
        L_0x0016:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001d:
            if (r2 >= r1) goto L_0x0032
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x002f
            int r3 = r3 + 1
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0032:
            com.google.android.gms.internal.ads.zzaag<java.lang.Integer> r0 = com.google.android.gms.internal.ads.zzaav.m
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x0095
            java.io.File r0 = r8.f6218e
            if (r0 != 0) goto L_0x004a
        L_0x0048:
            r0 = 0
            goto L_0x0088
        L_0x004a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File[] r0 = r0.listFiles()
            int r3 = r0.length
            r5 = r10
            r4 = 0
        L_0x0056:
            if (r4 >= r3) goto L_0x0073
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0070
            long r12 = r6.lastModified()
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0070
            r5 = r6
            r1 = r12
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x0073:
            if (r5 == 0) goto L_0x0048
            boolean r0 = r5.delete()
            java.io.File r1 = r8.y(r5)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x0088
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x0088:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.zzbba.i(r0)
            java.lang.String r0 = "expireFailed"
            r8.l(r9, r10, r0, r10)
            return r11
        L_0x0095:
            java.lang.String r0 = r30.w(r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.f6218e
            r12.<init>(r1, r0)
            java.io.File r0 = r8.y(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00d8
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00d8
            long r0 = r12.length()
            int r1 = (int) r0
            java.lang.String r0 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00c7
            java.lang.String r0 = r0.concat(r2)
            goto L_0x00cd
        L_0x00c7:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x00cd:
            com.google.android.gms.internal.ads.zzbba.f(r0)
            java.lang.String r0 = r12.getAbsolutePath()
            r8.i(r9, r0, r1)
            return r13
        L_0x00d8:
            java.io.File r1 = r8.f6218e
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f2
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x00f8:
            java.util.Set<java.lang.String> r1 = g
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = g     // Catch:{ all -> 0x05bc }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05bc }
            if (r2 == 0) goto L_0x0128
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05bc }
            int r3 = r2.length()     // Catch:{ all -> 0x05bc }
            if (r3 == 0) goto L_0x0114
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05bc }
            goto L_0x011a
        L_0x0114:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05bc }
            r2.<init>(r0)     // Catch:{ all -> 0x05bc }
            r0 = r2
        L_0x011a:
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ all -> 0x05bc }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05bc }
            java.lang.String r2 = "inProgress"
            r8.l(r9, r0, r2, r10)     // Catch:{ all -> 0x05bc }
            monitor-exit(r1)     // Catch:{ all -> 0x05bc }
            return r11
        L_0x0128:
            java.util.Set<java.lang.String> r2 = g     // Catch:{ all -> 0x05bc }
            r2.add(r14)     // Catch:{ all -> 0x05bc }
            monitor-exit(r1)     // Catch:{ all -> 0x05bc }
            java.lang.String r15 = "error"
            com.google.android.gms.ads.internal.zzq.zzli()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzaag<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaav.r     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.Object r1 = r2.c(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r2.<init>(r9)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r3 = 0
        L_0x0149:
            int r3 = r3 + r13
            r4 = 20
            if (r3 > r4) goto L_0x050e
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r5.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r5.setReadTimeout(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            if (r6 == 0) goto L_0x0503
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzbau r6 = new com.google.android.gms.internal.ads.zzbau     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r6.<init>()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r6.i(r5, r10)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r7 = r5.getResponseCode()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r6.h(r5, r7)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01ec
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r4 == 0) goto L_0x01dd
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r6.<init>(r2, r4)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r2 = r6.getProtocol()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r2 == 0) goto L_0x01d5
            java.lang.String r7 = "http"
            boolean r7 = r2.equals(r7)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r7 != 0) goto L_0x01b5
            java.lang.String r7 = "https"
            boolean r7 = r2.equals(r7)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r7 != 0) goto L_0x01b5
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r3 == 0) goto L_0x01ab
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            goto L_0x01b1
        L_0x01ab:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r1 = r2
        L_0x01b1:
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            throw r0     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
        L_0x01b5:
            java.lang.String r2 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r7 = r4.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r7 == 0) goto L_0x01c6
            java.lang.String r2 = r2.concat(r4)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            goto L_0x01cc
        L_0x01c6:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2 = r4
        L_0x01cc:
            com.google.android.gms.internal.ads.zzbba.f(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r5.disconnect()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2 = r6
            goto L_0x0149
        L_0x01d5:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            throw r0     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
        L_0x01dd:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            throw r0     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
        L_0x01e5:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e7:
            r0 = move-exception
        L_0x01e8:
            r2 = r10
        L_0x01e9:
            r1 = r14
            goto L_0x0527
        L_0x01ec:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            if (r1 == 0) goto L_0x0242
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0242
            java.lang.String r15 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r3 == 0) goto L_0x0210
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2 = r0
            goto L_0x0215
        L_0x0210:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
        L_0x0215:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            java.lang.String r3 = "HTTP status code "
            r4.append(r3)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            r4.append(r1)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            java.lang.String r1 = " at "
            r4.append(r1)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            r4.append(r9)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
            throw r0     // Catch:{ IOException -> 0x0240, RuntimeException -> 0x023e }
        L_0x023e:
            r0 = move-exception
            goto L_0x01e9
        L_0x0240:
            r0 = move-exception
            goto L_0x01e9
        L_0x0242:
            int r7 = r5.getContentLength()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            if (r7 >= 0) goto L_0x0271
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r2 == 0) goto L_0x0259
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            goto L_0x025f
        L_0x0259:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r0 = r1
        L_0x025f:
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r1 = "contentLengthMissing"
            r8.l(r9, r0, r1, r10)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.util.Set<java.lang.String> r0 = g     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            return r11
        L_0x0271:
            java.text.DecimalFormat r1 = h     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            long r2 = (long) r7     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzaag<java.lang.Integer> r2 = com.google.android.gms.internal.ads.zzaav.n     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzaar r3 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.Object r2 = r3.c(r2)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r3 = r2.intValue()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            if (r7 <= r3) goto L_0x02df
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2.append(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r2.append(r9)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            if (r2 == 0) goto L_0x02ca
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            goto L_0x02d0
        L_0x02ca:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r0 = r1
        L_0x02d0:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.lang.String r2 = "sizeExceeded"
            r8.l(r9, r1, r2, r0)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            java.util.Set<java.lang.String> r0 = g     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01e7, RuntimeException -> 0x01e5 }
            return r11
        L_0x02df:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r2 = r2.length()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r4 = r4.length()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r4.append(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r4.append(r9)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            com.google.android.gms.internal.ads.zzbba.f(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            r4.<init>(r12)     // Catch:{ IOException -> 0x0521, RuntimeException -> 0x051f }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzq.zzld()     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            long r17 = r16.a()     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaav.q     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            com.google.android.gms.internal.ads.zzaar r10 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            java.lang.Object r6 = r10.c(r6)     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x04f9, RuntimeException -> 0x04f7 }
            r10 = r14
            long r13 = r6.longValue()     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            com.google.android.gms.internal.ads.zzbag r6 = new com.google.android.gms.internal.ads.zzbag     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            r6.<init>(r13)     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r13 = com.google.android.gms.internal.ads.zzaav.p     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            com.google.android.gms.internal.ads.zzaar r14 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            java.lang.Object r13 = r14.c(r13)     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            long r13 = r13.longValue()     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
        L_0x0352:
            int r20 = r5.read(r1)     // Catch:{ IOException -> 0x04f2, RuntimeException -> 0x04f0 }
            if (r20 < 0) goto L_0x046e
            int r11 = r11 + r20
            if (r11 <= r3) goto L_0x038f
            java.lang.String r15 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.Integer.toString(r11)     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
            if (r2 == 0) goto L_0x0374
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
            r1 = r0
            goto L_0x0379
        L_0x0374:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0389, RuntimeException -> 0x0387 }
        L_0x0379:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0383, RuntimeException -> 0x0381 }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0383, RuntimeException -> 0x0381 }
            throw r0     // Catch:{ IOException -> 0x0383, RuntimeException -> 0x0381 }
        L_0x0381:
            r0 = move-exception
            goto L_0x0384
        L_0x0383:
            r0 = move-exception
        L_0x0384:
            r2 = r1
            r1 = r10
            goto L_0x038c
        L_0x0387:
            r0 = move-exception
            goto L_0x038a
        L_0x0389:
            r0 = move-exception
        L_0x038a:
            r1 = r10
            r2 = 0
        L_0x038c:
            r10 = r4
            goto L_0x0527
        L_0x038f:
            r1.flip()     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
        L_0x0392:
            int r20 = r2.write(r1)     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            if (r20 > 0) goto L_0x0392
            r1.clear()     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            long r20 = r16.a()     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            long r20 = r20 - r17
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r13
            int r24 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r24 > 0) goto L_0x0422
            r20 = r1
            boolean r1 = r8.f6219f     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            if (r1 != 0) goto L_0x0412
            boolean r1 = r6.a()     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            if (r1 == 0) goto L_0x03ec
            java.lang.String r21 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzbaq.f6115b     // Catch:{ IOException -> 0x0466, RuntimeException -> 0x0464 }
            r22 = r15
            com.google.android.gms.internal.ads.r8 r15 = new com.google.android.gms.internal.ads.r8     // Catch:{ IOException -> 0x03e6, RuntimeException -> 0x03e4 }
            r23 = 0
            r24 = r10
            r10 = r1
            r1 = r15
            r25 = r2
            r2 = r30
            r26 = r3
            r3 = r31
            r27 = r4
            r4 = r21
            r21 = r5
            r5 = r11
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            r10.post(r15)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            goto L_0x03fe
        L_0x03e4:
            r0 = move-exception
            goto L_0x03e7
        L_0x03e6:
            r0 = move-exception
        L_0x03e7:
            r27 = r4
            r1 = r10
            goto L_0x04ed
        L_0x03ec:
            r25 = r2
            r26 = r3
            r27 = r4
            r21 = r5
            r19 = r6
            r29 = r7
            r24 = r10
            r22 = r15
            r28 = 3
        L_0x03fe:
            r6 = r19
            r1 = r20
            r5 = r21
            r15 = r22
            r10 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r7 = r29
            goto L_0x0352
        L_0x0412:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            throw r0     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        L_0x0422:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            r2.append(r0)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0458, RuntimeException -> 0x0456 }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0458, RuntimeException -> 0x0456 }
            throw r0     // Catch:{ IOException -> 0x0458, RuntimeException -> 0x0456 }
        L_0x0456:
            r0 = move-exception
            goto L_0x0459
        L_0x0458:
            r0 = move-exception
        L_0x0459:
            r2 = r10
            r1 = r24
            r10 = r27
            goto L_0x0527
        L_0x0460:
            r0 = move-exception
            goto L_0x04bb
        L_0x0462:
            r0 = move-exception
            goto L_0x04bb
        L_0x0464:
            r0 = move-exception
            goto L_0x0467
        L_0x0466:
            r0 = move-exception
        L_0x0467:
            r27 = r4
            r22 = r15
            r1 = r10
            goto L_0x04ff
        L_0x046e:
            r27 = r4
            r24 = r10
            r22 = r15
            r28 = 3
            r27.close()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            boolean r1 = com.google.android.gms.internal.ads.zzbba.a(r28)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            if (r1 == 0) goto L_0x04be
            java.text.DecimalFormat r1 = h     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            long r2 = (long) r11     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            r3.append(r1)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            r3.append(r9)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            com.google.android.gms.internal.ads.zzbba.f(r1)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            goto L_0x04be
        L_0x04b6:
            r0 = move-exception
            goto L_0x04b9
        L_0x04b8:
            r0 = move-exception
        L_0x04b9:
            r15 = r22
        L_0x04bb:
            r1 = r24
            goto L_0x04ff
        L_0x04be:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            if (r1 == 0) goto L_0x04d1
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            r0.setLastModified(r1)     // Catch:{ IOException -> 0x04b8, RuntimeException -> 0x04b6 }
            goto L_0x04d4
        L_0x04d1:
            r0.createNewFile()     // Catch:{ IOException -> 0x04d4, RuntimeException -> 0x04b6 }
        L_0x04d4:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r8.i(r9, r0, r11)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.util.Set<java.lang.String> r0 = g     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r1 = r24
            r0.remove(r1)     // Catch:{ IOException -> 0x04e6, RuntimeException -> 0x04e4 }
            r0 = 1
            return r0
        L_0x04e4:
            r0 = move-exception
            goto L_0x04ed
        L_0x04e6:
            r0 = move-exception
            goto L_0x04ed
        L_0x04e8:
            r0 = move-exception
            goto L_0x04eb
        L_0x04ea:
            r0 = move-exception
        L_0x04eb:
            r1 = r24
        L_0x04ed:
            r15 = r22
            goto L_0x04ff
        L_0x04f0:
            r0 = move-exception
            goto L_0x04f3
        L_0x04f2:
            r0 = move-exception
        L_0x04f3:
            r27 = r4
            r1 = r10
            goto L_0x04fd
        L_0x04f7:
            r0 = move-exception
            goto L_0x04fa
        L_0x04f9:
            r0 = move-exception
        L_0x04fa:
            r27 = r4
            r1 = r14
        L_0x04fd:
            r22 = r15
        L_0x04ff:
            r10 = r27
            r2 = 0
            goto L_0x0527
        L_0x0503:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
            throw r0     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
        L_0x050e:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
            throw r0     // Catch:{ IOException -> 0x051b, RuntimeException -> 0x0519 }
        L_0x0519:
            r0 = move-exception
            goto L_0x051c
        L_0x051b:
            r0 = move-exception
        L_0x051c:
            r15 = r22
            goto L_0x0525
        L_0x051f:
            r0 = move-exception
            goto L_0x0522
        L_0x0521:
            r0 = move-exception
        L_0x0522:
            r1 = r14
            r22 = r15
        L_0x0525:
            r2 = 0
            r10 = 0
        L_0x0527:
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L_0x0534
            com.google.android.gms.internal.ads.zzaxh r3 = com.google.android.gms.ads.internal.zzq.zzla()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r3.e(r0, r4)
        L_0x0534:
            r10.close()     // Catch:{ IOException | NullPointerException -> 0x0538 }
            goto L_0x0539
        L_0x0538:
        L_0x0539:
            boolean r3 = r8.f6219f
            if (r3 == 0) goto L_0x0561
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.zzbba.h(r0)
            goto L_0x0584
        L_0x0561:
            java.lang.String r3 = java.lang.String.valueOf(r31)
            int r3 = r3.length()
            int r3 = r3 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Preload failed for URL \""
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = "\""
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.gms.internal.ads.zzbba.d(r3, r0)
        L_0x0584:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x05ae
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x05ae
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r3 = r12.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x05a5
            java.lang.String r0 = r0.concat(r3)
            goto L_0x05ab
        L_0x05a5:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x05ab:
            com.google.android.gms.internal.ads.zzbba.i(r0)
        L_0x05ae:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.l(r9, r0, r15, r2)
            java.util.Set<java.lang.String> r0 = g
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05bc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05bc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbez.v(java.lang.String):boolean");
    }
}
