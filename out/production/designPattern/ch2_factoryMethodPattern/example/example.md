# 咖啡店制作饮品
假设我们在开发一个咖啡店的点单系统。
咖啡店提供多种饮品，比如咖啡、拿铁、卡布奇诺等。
每种饮品都有不同的制作方法，但是顾客只需要简单地下单就能得到饮品，而不关心饮品是如何制作的。
在这种情况下，工厂方法模式可以帮助我们将不同的饮品创建逻辑封装起来，使得添加新饮品变得简单和灵活。

## 1.定义产品接口

首先，我们定义一个通用的饮品接口，所有饮品都需要实现这个接口的方法，比如 prepare() 方法，用于制作饮品。
```java
// 饮品接口
interface Drink {
    void prepare();
}
```

## 2.实现具体的饮品类

每种具体饮品都实现 Drink 接口，并定义具体的制作步骤。

```java
// 具体产品类：咖啡
class Coffee implements Drink {
    @Override
    public void prepare() {
        System.out.println("准备咖啡：磨咖啡豆、冲泡咖啡、加糖和牛奶...");
    }
}

// 具体产品类：拿铁
class Latte implements Drink {
    @Override
    public void prepare() {
        System.out.println("准备拿铁：蒸牛奶、冲泡浓缩咖啡、混合并加奶泡...");
    }
}

// 具体产品类：卡布奇诺
class Cappuccino implements Drink {
    @Override
    public void prepare() {
        System.out.println("准备卡布奇诺：冲泡浓缩咖啡、加蒸牛奶和厚奶泡...");
    }
}

```

## 3.定义工厂接口

创建一个工厂接口，声明一个 createDrink() 方法，用于创建饮品。
```java
// 工厂接口
interface DrinkFactory {
    Drink createDrink();
}

```

## 4. 实现具体工厂类
每个具体工厂类负责创建一种具体的饮品
```java
// 具体工厂类：咖啡工厂
class CoffeeFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}

// 具体工厂类：拿铁工厂
class LatteFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}

// 具体工厂类：卡布奇诺工厂
class CappuccinoFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Cappuccino();
    }
}
```

## 5. 客户代码
客户代码通过工厂来创建饮品，并调用 prepare() 方法进行制作。
```java
public class CoffeeShop {
    public static void main(String[] args) {
        // 创建咖啡工厂并制作咖啡
        DrinkFactory coffeeFactory = new CoffeeFactory();
        Drink coffee = coffeeFactory.createDrink();
        coffee.prepare(); // 输出：准备咖啡：磨咖啡豆、冲泡咖啡、加糖和牛奶...

        // 创建拿铁工厂并制作拿铁
        DrinkFactory latteFactory = new LatteFactory();
        Drink latte = latteFactory.createDrink();
        latte.prepare(); // 输出：准备拿铁：蒸牛奶、冲泡浓缩咖啡、混合并加奶泡...

        // 创建卡布奇诺工厂并制作卡布奇诺
        DrinkFactory cappuccinoFactory = new CappuccinoFactory();
        Drink cappuccino = cappuccinoFactory.createDrink();
        cappuccino.prepare(); // 输出：准备卡布奇诺：冲泡浓缩咖啡、加蒸牛奶和厚奶泡...
    }
}
```