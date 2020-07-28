package Package15Maven;

/**
 * Maven的第一作用就是解决依赖管理
 *  会自动导入依赖包所依赖的包
 *
 * 依赖关系
 * compile      编译时需要用到的该 jar包（默认）               commons-logging
 * test         编译 Test时需要用到的该 jar包                 junit
 * runtime      编译时不需要，但运行时需要用到                  mysql
 * provided     编译时需要用到，但运行时由 jdk或某个服务器提供    servlet-api
 *
 * Maven维护了一个中央仓库（repo1.maven.org）
 * 会在本地自动缓存下载过的包（用户主目录的.m2目录）
 *
 * 唯一 ID
 * 对于某个依赖，Maven需要 3个变量即可唯一确定某个 jar包
 *  groupId: 属于组织的名称
 *  artifactId: 该 jar包自身的名称
 *  version: 该 jar包的版本
 */

public class Dependence {
}

/**
 * 小结
 * Maven通过解析依赖关系确定项目所需的 jar包
 * Maven从中央仓库下载所需的 jar包并缓存在本地
 * 可以通过镜像仓库加速下载
 */