package Package15Maven;

/**
 * Maven执行每个 phase，都是通过某个插件来执行的，本身并不知道如何执行，只是负责找到对应的插件
 */

public class Plugin {
}

/**
 * 小结
 * Maven通过自定义插件可以执行项目构建时需要的额外功能，使用自定义插件必须在 pom.xml中声明插件及配置
 * 插件会在某个 phase被执行时执行
 * 插件的配置和用法需要参考插件的官方文档
 */
