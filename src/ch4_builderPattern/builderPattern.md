# 建造者模式

**意图：** 将一个复杂对象的构建过程与它的表示分离，使同样的构建过程可以创建不同的表示。

实现：

- 定义一个建造者接口，声明构建各个部分的方法。
- 具体建造者类实现接口，构建并装配具体的部件。
- 指导者类 (Director) 控制构建过程。
  

**使用场景：** 当创建复杂对象的过程独立于对象的组成时，如汽车制造和文档生成器。