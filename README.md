# 问答系统

使用了SSM框架搭建仿知乎问答社区
## 一.项目的来源

项目是来自牛客网的高级项目课程，对于一个本菜鸡来说是全新的技术栈，第一遍跟着做，做完后进行总结。争取今年五六月份进行项目的二次重构，并进行功能的扩展和完善。

## 二.项目环境搭建

- **操作系统**:Windows 10
- **IDE**:IntelliJ IDEA 2018.3
- **JDK Version** : JDK1.8 建议使用JDK1.7以上版本
- **Web容器** ： SpringBoot集成的默认容器-Tomcat
- **数据库** ：Mysql-8.0.13
- **依赖管理工具** : Maven 管理jar包真的很方便
- **版本控制**: Git

## 三.项目的运行

xx

## 三.项目问题总结

**1.启动的时候报错显示无法注入（AutoWired）**

    org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'initDatabaseTests': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:334) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1214) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:543) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:772) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:839) ~[spring-context-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:538) ~[spring-context-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:766) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.SpringApplication.createAndRefreshContext(SpringApplication.java:361) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.test.SpringApplicationContextLoader.loadContext(SpringApplicationContextLoader.java:98) [spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:98) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:116) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:83) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:117) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:228) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:230) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:289) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:291) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:249) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:89) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runners.ParentRunner.run(ParentRunner.java:363) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:193) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runner.JUnitCore.run(JUnitCore.java:137) [junit-4.12.jar:4.12]
    	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70) [junit-rt.jar:na]
    Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:573) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:331) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	... 40 common frames omitted
    Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1373) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1119) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1014) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:545) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	... 42 common frames omitted
    
    2019-01-06 20:09:12.377  INFO 219244 --- [           main] .b.l.ClasspathLoggingApplicationListener : Application failed to start with classpath: unknown
    2019-01-06 20:09:12.378 ERROR 219244 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener@815b41f] to prepare test instance [com.howie.wenda.InitDatabaseTests@37ceb1df]
    
    java.lang.IllegalStateException: Failed to load ApplicationContext
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:83) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:117) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:228) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:230) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:289) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:291) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:249) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:89) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58) [junit-4.12.jar:4.12]
    	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runners.ParentRunner.run(ParentRunner.java:363) [junit-4.12.jar:4.12]
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:193) [spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.junit.runner.JUnitCore.run(JUnitCore.java:137) [junit-4.12.jar:4.12]
    	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242) [junit-rt.jar:na]
    	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70) [junit-rt.jar:na]
    Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'initDatabaseTests': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:334) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1214) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:543) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:772) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:839) ~[spring-context-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:538) ~[spring-context-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:766) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.SpringApplication.createAndRefreshContext(SpringApplication.java:361) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.boot.test.SpringApplicationContextLoader.loadContext(SpringApplicationContextLoader.java:98) ~[spring-boot-1.3.5.RELEASE.jar:1.3.5.RELEASE]
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:98) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:116) ~[spring-test-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	... 24 common frames omitted
    Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:573) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:331) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	... 40 common frames omitted
    Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1373) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1119) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1014) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:545) ~[spring-beans-4.2.6.RELEASE.jar:4.2.6.RELEASE]
    	... 42 common frames omitted
    
    
    java.lang.IllegalStateException: Failed to load ApplicationContext
    
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
    	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:83)
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:117)
    	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83)
    	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:228)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:230)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:289)
    	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:291)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:249)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:89)
    	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
    	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
    	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:193)
    	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
    	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
    	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
    	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
    	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
    Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'initDatabaseTests': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:334)
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1214)
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:543)
    	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482)
    	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306)
    	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
    	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302)
    	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:772)
    	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:839)
    	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:538)
    	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:766)
    	at org.springframework.boot.SpringApplication.createAndRefreshContext(SpringApplication.java:361)
    	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
    	at org.springframework.boot.test.SpringApplicationContextLoader.loadContext(SpringApplicationContextLoader.java:98)
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:98)
    	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:116)
    	... 24 more
    Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: com.howie.wenda.dao.UserDAO com.howie.wenda.InitDatabaseTests.userDAO; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:573)
    	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:331)
    	... 40 more
    Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.howie.wenda.dao.UserDAO] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1373)
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1119)
    	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1014)
    	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:545)
    	... 42 more

**解决方法:** 这里我是改了一下注解的方式，手动指定bean

    @Autowired(required=false)
    @Qualifier("questionService")
    @QuestionService questionService;
       
 然后在DAO层的注解中改变了如下代码：

    @Mapper
    @Component
    @Repository
    
## 五.项目中的技术点讲解
xx

## 六.项目中的重难点

## 七.项目可以完善的地方
- 用户注册，邮箱激活流程
- 首页滚动到底部自动加载更多
- 管理员后台管理(图形化的显示:进行数据分析与图形化显示)
- 运营推荐问题置顶
- timeline推拉结合
- 个性化首页，timeline更多事件
- 关键词过滤的优化算法
- 搜索结果排序打分
- 爬虫覆盖用户，评论，内容去html标签
- 个性化推荐(优化后的推荐算法)
- 分布式存储，数据库的分库分表
- 小程序进行同时显示
- 模版引擎优化为freemaker或者是Thymeleaf，替代掉Velocity
- 提高系统的并发量和准确率
- Ajax进行跨域传输(进行优化)
- 密码加密加强
- 争取使用Python中的框架进行二次开发
- 自定义拦截器(针对ip进行拦截)，限制单点登录
- 

## 七.课下需要做的功课
