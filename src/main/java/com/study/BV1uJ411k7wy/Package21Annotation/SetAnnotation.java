package com.study.BV1uJ411k7wy.Package21Annotation;

import java.lang.annotation.*;

// 元注解 修饰其他注解
// @Inherited 定义子类是否可继承父类定义的 Annotation
// @Inherited
// @Repeatable 定义是否可复用
// @Repeatable(SetAnnotations.class)
// @Target 可以定义 Annotation能被应用于源码的哪些位置
@Target({
        ElementType.METHOD,
        ElementType.FIELD
})
// @Retention 定义生命周期
@Retention(RetentionPolicy.SOURCE)
@interface SetAnnotation {
    // default设定一个默认值，最常用的参数应当命名为 value
    int type() default 0;
    String level() default "info";
    String value() default "";
}

// @Target(ElementType.TYPE)
// public @interface SetAnnotations {
//     SetAnnotation[] value();
// }

/**
 * 如何定义 Annotation
 * 1. 用 @interface定义注解
 * 2. 添加参数，默认值
 * 3. 用元注解配置注解
 *
 * 小结：
 * java使用 @interface定义注解
 * 可定义多个参数和默认值，核心参数使用 value名称
 * 必须设置 @Target来指定 Annotation可以应用的范围
 * 应当设置 @Retention(RetentionPolicy.RUNTIME)便于运行期读取该 Annotation
 */
