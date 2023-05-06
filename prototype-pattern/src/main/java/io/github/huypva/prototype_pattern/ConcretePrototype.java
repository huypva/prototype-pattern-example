package io.github.huypva.prototype_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author huypva
 */
@Getter
@Setter
@AllArgsConstructor
public class ConcretePrototype implements Cloneable {
    private String field1;

    public ConcretePrototype(ConcretePrototype prototype) {
        this.field1 = prototype.field1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ConcretePrototype(this);
    }


}
