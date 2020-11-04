package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbao {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, List<Map<String, Object>>> f6112a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static List<MediaCodecInfo> f6113b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f6114c = new Object();

    @TargetApi(21)
    private static Integer[] a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }

    @TargetApi(16)
    public static List<Map<String, Object>> b(String str) {
        synchronized (f6114c) {
            if (f6112a.containsKey(str)) {
                List<Map<String, Object>> list = f6112a.get(str);
                return list;
            }
            try {
                synchronized (f6114c) {
                    if (f6113b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f6113b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            f6113b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f6113b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo next : f6113b) {
                    if (!next.isEncoder() && Arrays.asList(next.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", next.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = next.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f6112a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e2.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f6112a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
