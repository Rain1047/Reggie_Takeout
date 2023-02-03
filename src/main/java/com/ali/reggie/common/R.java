package com.ali.reggie.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
//<T>表示这个方法声明为泛型方法

@Data
public class R<T> {
    private Integer code;
    private String msg;
    private T data;
    private Map map = new HashMap();

    /**
     * 通用返回结果，服务端相应的数据最终都会封装成此对象
     * @param object
     * @return
     * @param <T>
     *     对于声明了<T>的类不需要声明泛型方法,
     *     对于带了static的方法,
     *     它并不属于类的一部分,所以相当于没有声明<T>的类,所以需要声明为泛型方法.
     */
    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

//    这是一个动态方法
    public R<T> add(String key, Object value){
        this.map.put(key, value);
        return this;
    }


}
