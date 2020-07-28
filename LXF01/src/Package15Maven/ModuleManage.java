package Package15Maven;

/**
 * 中央仓库
 *  大多数第三方模块所在
 * 私有仓库
 *  指公司内部搭建仓库，放一些源码和 jar包
 * 本地仓库
 *  指把本地开发的项目"发布"在本地
 */

public class ModuleManage {
}

/**
 * 小结
 * Maven支持模块化管理，可以把一个大项目拆成几个模块
 *  可以通过继承在 parent的 pom.xml统一定义重复配置
 *  可以通过 <modules>编译多个模块
 */
