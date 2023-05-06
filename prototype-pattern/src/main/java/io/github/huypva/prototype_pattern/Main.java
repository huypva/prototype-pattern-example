package io.github.huypva.prototype_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    ConcretePrototype concretePrototype = new ConcretePrototype("value1");
    log.info("ConcretePrototype: " + concretePrototype);

    ConcretePrototype concretePrototypeClone = (ConcretePrototype) concretePrototype.clone();
    log.info("ConcretePrototypeClone: " + concretePrototypeClone);

    concretePrototype.setField1("newValue");

    log.info("ConcretePrototype field=: " + concretePrototype.getField1());
    log.info("ConcretePrototypeClone field=: " + concretePrototypeClone.getField1());
  }
}
