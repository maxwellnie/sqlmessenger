package io.github.maxwellnie.sqlmessenger.core.java.reflect.property.impl.meta;

import java.util.Map;

/**
 * @author Maxwell Nie
 */
public class MetaObject {
    PropertyAccessor accessor;

    MetaObject(PropertyAccessor accessor) {
        this.accessor = accessor;
    }
    /**
     * 获取元对象
     * @param property 属性
     * @param bean 对象
     * @return MetaObject
     */
    public static MetaObject get(MetaProperty property, Object bean){
        return new MetaObject(new PropertyAccessor(property, bean, null));
    }
    /**
     * 根据链路找到属性值
     * @param linedWayHead 链路头节点
     * @return Result
     */
    public PropertyAccessor.Result find(PropertyAccessor.Node linedWayHead){
        return accessor.findByWay(linedWayHead);
    }
}
