package Package15Maven;

public class Artifact {
}

/**
 * 小结
 * 使用Maven发布一个Artifact时：
 *  可以发布到本地，然后由静态服务器提供repo服务，使用方必须声明repo地址；
 *  可以发布到central.sonatype.org，并自动同步到Maven中央仓库，需要前期申请账号以及本地配置；
 *  可以发布到GitHub Packages作为私有仓库使用，必须提供Token以及正确的权限才能发布和使用。
 */
