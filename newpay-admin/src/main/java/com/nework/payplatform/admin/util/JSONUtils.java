package com.nework.payplatform.admin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Json操作工具类
 *
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/3/20
 */
public final class JSONUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private JSONUtils() {
    }

    public static <T> T toBean(String json, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(json, clazz);
    }

    public static String toJson(Object bean) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(bean);
    }
}