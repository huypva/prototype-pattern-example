The hello-world project

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
- Make sure following software is installed on your PC
  - [OpenJDK 17](https://adoptium.net/temurin/releases/?version=17) or later


## Project structure
```
.
├── prototype-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./prototype-pattern/target/prototype-pattern-0.0.1-SNAPSHOT.jar
10:18:38.279 [main] INFO io.github.huypva.prototype_pattern.Main - ConcretePrototype: io.github.huypva.prototype_pattern.ConcretePrototype@46ee7fe8
10:18:38.280 [main] INFO io.github.huypva.prototype_pattern.Main - ConcretePrototypeClone: io.github.huypva.prototype_pattern.ConcretePrototype@73c6c3b2
10:18:38.280 [main] INFO io.github.huypva.prototype_pattern.Main - ConcretePrototype field=: newValue
10:18:38.280 [main] INFO io.github.huypva.prototype_pattern.Main - ConcretePrototypeClone field=: value1
```

## Contribute

## Reference