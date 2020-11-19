package com.study.LXF01.Package15Maven;

/**
 * Maven Wrapper负责给特定的项目安装指定版本的 Maven，而其他项目不受影响
 *
 * 安装在项目的根目录（pom.xml所在目录）
 * mvn -N io.takari:maven:0.7.7:wrapper
 *
 * 安装指定版本的 Maven版本
 * mvn -N io.takari:maven:0.7.7:wrapper -Dmaven=3.3.3
 *
 * mvnw clean package
 */

public class Mvnw {
}

/**
 * 小结
 * 使用Maven Wrapper，可以为一个项目指定特定的Maven版本。
 */
