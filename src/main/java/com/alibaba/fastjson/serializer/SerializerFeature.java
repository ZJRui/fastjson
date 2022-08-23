/*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
@SuppressWarnings("all")
public enum SerializerFeature {
    QuoteFieldNames,
    /**
     * 
     */
    UseSingleQuotes,
    /**
     * 
     */
    WriteMapNullValue,
    /**
     * 用枚举toString()值输出
     */
    WriteEnumUsingToString,
    /**
     * 用枚举name()输出
     */
    WriteEnumUsingName,
    /**
     *
     */
    UseISO8601DateFormat,
    /**
     * @since 1.1
     */
    WriteNullListAsEmpty,
    /**
     * @since 1.1
     */
    WriteNullStringAsEmpty,
    /**
     * @since 1.1
     */
    WriteNullNumberAsZero,
    /**
     * @since 1.1
     */
    WriteNullBooleanAsFalse,
    /**
     * @since 1.1
     */
    SkipTransientField,
    /**
     * @since 1.1
     */
    SortField,
    /**
     * @since 1.1.1
     */
    @Deprecated
    WriteTabAsSpecial,
    /**
     * @since 1.1.2
     */
    PrettyFormat,
    /**
     * @since 1.1.2
     */
    WriteClassName,

    /**
     * @since 1.1.6
     * DisableCircularReferenceDetect来禁止循环引用检测：
     * JSON.toJSONString(..., SerializerFeature.DisableCircularReferenceDetect)
     * 当进行toJSONString的时候，默认如果重用对象的话，会使用引用的方式进行引用对象。
     * "颜色": [
     *       {
     *         "$ref": "$.itemSkuList[0].itemSpecificationList[0]"
     *       },
     *       {
     *         "$ref": "$.itemSkuList[1].itemSpecificationList[0]"
     *       }
     *     ]
     *
     *
     * 引用是通过"$ref"来表示的
     * 引用	描述
     * "$ref":".."	上一级
     * "$ref":"@"	当前对象，也就是自引用
     * "$ref":"$"	根对象
     * "$ref":"$.children.0"	基于路径的引用，相当于 root.getChildren().get(0)
     */
    DisableCircularReferenceDetect, // 32768

    /**
     * @since 1.1.9
     */
    WriteSlashAsSpecial,

    /**
     * @since 1.1.10
     */
    BrowserCompatible,

    /**
     * @since 1.1.14
     */
    WriteDateUseDateFormat,

    /**
     * @since 1.1.15
     */
    NotWriteRootClassName,

    /**
     * @since 1.1.19
     * @deprecated
     */
    DisableCheckSpecialChar,

    /**
     * @since 1.1.35
     */
    BeanToArray,

    /**
     * @since 1.1.37
     */
    WriteNonStringKeyAsString,
    
    /**
     * @since 1.1.42
     */
    NotWriteDefaultValue,

    /**
     * @since 1.2.6
     */
    BrowserSecure,

    /**
     * @since 1.2.7
     */
    IgnoreNonFieldGetter,

    /**
     * @since 1.2.9
     */
    WriteNonStringValueAsString,

    /**
     * @since 1.2.11
     */
    IgnoreErrorGetter,

    /**
     * @since 1.2.16
     */
    WriteBigDecimalAsPlain,

    /**
     * @since 1.2.27
     */
    MapSortField;

    SerializerFeature(){
        mask = (1 << ordinal());
        //mask:1
        // mask:2
        // mask:4
        // mask:8
        // mask:16
        // mask:32
        // mask:64
        // mask:128
        // mask:256
        // mask:512
        // mask:1024
        // mask:2048
        // mask:4096
        // mask:8192
        // mask:16384
        System.out.println("mask:"+mask);
    }

    public final int mask;

    public final int getMask() {
        return mask;
    }

    public static boolean isEnabled(int features, SerializerFeature feature) {
        //给定一个 list（就是 int features）判断是否包含指定的SerializerFeature

        return (features & feature.mask) != 0;
    }

    public static boolean isEnabled(int features, int featuresB, SerializerFeature feature) {
        int mask = feature.mask;

        return (features & mask) != 0 || (featuresB & mask) != 0;
    }

    public static int config(int features, SerializerFeature feature, boolean state) {

        /**
         *
         * 参考：https://juejin.cn/post/6960935255452680229
         *
         *
         * state的含义：
         *
         * SerializerFeature 是一个枚举类型， 每一个值 用一个位表示，因此第一个枚举值就是二进制00001=1
         *
         * 第二个就是二进制00010=2 ，第三个就是4，第四个就是5.
         *
         *int 类型的features  就相当于一个list，当我们 给 这个feautres中添加一个 枚举值的时候 只需要将 该枚举值
         * 对应的位置 设置为1就可以了， 因此实际上就是 获取枚举值的二进制 表示形式，然后和feature进行或运算。
         *
         *
         */
        if (state) {
            features |= feature.mask;
        } else {
            features &= ~feature.mask;
        }

        return features;
    }
    
    public static int of(SerializerFeature[] features) {
        if (features == null) {
            return 0;
        }
        
        int value = 0;
        
        for (SerializerFeature feature: features) {
            value |= feature.mask;
        }
        
        return value;
    }

    public final static SerializerFeature[] EMPTY = new SerializerFeature[0];

    public static final int WRITE_MAP_NULL_FEATURES
            = WriteMapNullValue.getMask()
            | WriteNullBooleanAsFalse.getMask()
            | WriteNullListAsEmpty.getMask()
            | WriteNullNumberAsZero.getMask()
            | WriteNullStringAsEmpty.getMask()
            ;
}
