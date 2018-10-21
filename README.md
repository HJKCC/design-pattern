# design-pattern
the nodes of Head First Design Patterns

# 设计模式
- 策略模式：定义了一系列算法族(如FlyBehavior、QuackBehavior)，分别将其封装起来，让它们之间可以相互替换。让算法的变化独立于使用算法的客户。
- 观察者模式：在对象之间定义一对多的依赖，当一个对象改变状态，依赖它的对象都会收到通知，并自动完成更新操作。如Jbutton按钮。
- 装饰者模式：动态地将责任附加到对象上。若要拓展功能，装饰者提供了比继承更具有弹性的替代方案。它在被装饰者的行为之前或之后，加上自己的行为，以达到特定的目的。如java.io中InputStream（抽象组件）、FileInputStream（抽象装饰者）和BufferedInputStream（具体装饰者）。
- 动态代理：如日志、事务处理等。
- 单例模式
- 多例模式：如数据库连接池。
- 工厂模式：如spring IOC中的bean工厂（抽象工厂模式）。
- 责任链模式：如tomcat的过滤器Filter 和 struts的intercepter。
- 桥接模式：
- 适配器模式：如java.io中的inputStreamReader。

# 设计原则
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 对象之间松耦合
- 开放-关闭原则：类应该对拓展开放，对修改关闭
