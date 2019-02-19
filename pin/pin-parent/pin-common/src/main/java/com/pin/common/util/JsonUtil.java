package com.pin.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * JSON工具类
 *
 * @author huyueming
 * @date 2017年7月22日 下午2:14:15
 */
public class JsonUtil {

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new GsonBuilder().disableHtmlEscaping().create();
        }
    }

    /**
     * 转成json字符串
     *
     * @param obj
     * @return
     * @date 2017年7月22日
     */
    public static String jsonStr(Object obj) {
        return JSONObject.toJSONString(obj);
    }

    //SerializerFeature是个枚举类型。消除循环引用  避免 $ref对象重复引用问题
    public static String jsonToStr(Object obj) {
        return JSONObject.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     * 转成json字符串
     *
     * @param obj
     * @return
     * @author huyueming
     * @date 2017年7月22日
     */
    public static String gsonStr(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * json转换bean对象
     *
     * @param jsonStr
     * @param cls
     * @return
     * @author huyueming
     * @date 2017年7月22日
     */
    public static <T> T jsonToBean(String jsonStr, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(jsonStr, cls);
        }
        return t;
    }

    /**
     * json转换List集合
     *
     * @param jsonStr
     * @param cls
     * @return
     * @author huyueming
     * @date 2017年7月22日
     */
    public static <T> List<T> jsonToList(String jsonStr, Class<T> cls) {
        return JSONObject.parseArray(jsonStr, cls);
    }

    /**
     * json转换MAP对象
     *
     * @param jsonStr
     * @return
     * @author huyueming
     * @date 2017年7月22日
     */
    @SuppressWarnings("unchecked")
    public static <T> Map<String, T> jsonToMap(String jsonStr) {
        return JSONObject.parseObject(jsonStr, Map.class);
    }

    /**
     * json转换List<Map<String, T>>集合
     *
     * @param jsonStr
     * @return
     * @author huyueming
     * @date 2017年7月22日
     */
    @SuppressWarnings("unchecked")
    public static <T> List<Map<String, T>> jsonToListMap(String jsonStr) {
        return JSONObject.parseObject(jsonStr, List.class);
    }

    /**
     * json转换TreeMap对象
     *
     * @param jsonStr
     * @return
     * @author hejiangping
     * @date 2018年7月20日
     */
    @SuppressWarnings("unchecked")
    public static <T> TreeMap<String, T> jsonToTreeMap(String jsonStr) {
        return JSONObject.parseObject(jsonStr, TreeMap.class);
    }

    /**
     * json转换List<TreeMap<String, T>>集合
     *
     * @author hejiangping
     * @date 2018年8月14日
     */
    @SuppressWarnings("unchecked")
    public static <T> List<TreeMap<String, T>> jsonToListTreeMap(String jsonStr) {
        return JSONObject.parseObject(jsonStr, List.class);
    }

    /**
     * json转listmap
     * @param jsonStr
     * @param <T>
     * @return
     */
    public static <T> List<Map<String, T>> parseToListMap(String jsonStr){
       return JSON.parseObject(jsonStr, new TypeReference<List<Map<String, T>>>(){});
    }

}
