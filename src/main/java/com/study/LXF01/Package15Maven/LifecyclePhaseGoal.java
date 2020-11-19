package com.study.LXF01.Package15Maven;

public class LifecyclePhaseGoal {
}

/**
 * 小结
 * Maven通过 lifecycle, phase和 goal来提供标准的构建流程
 * 最常用的构建命令是指定 phase，然后让 Maven执行到指定的 phase
 *  mvn clean           清理所有生成的 class和 jar
 *  mvn clean compile   先清理，再执行到 compile
 *  mvn clean test      先清理，再执行到 test，因为执行 test前必须执行 compile，所以这里不必指定 compile
 *  mvn clean package   先清理，再执行到 package
 * 通常情况，我们总是执行 phase默认绑定的 goal，因此不必指定 goal
 *  mvn tomcat:run
 */
