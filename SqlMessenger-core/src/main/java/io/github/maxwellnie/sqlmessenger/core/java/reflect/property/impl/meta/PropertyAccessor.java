package io.github.maxwellnie.sqlmessenger.core.java.reflect.property.impl.meta;

/**
 * @author Maxwell Nie
 */
public class PropertyAccessor {
    private MetaProperty metaProperty;
    private Object bean;
    private Object param;

    public PropertyAccessor(MetaProperty metaProperty, Object bean, Object param) {
        this.metaProperty = metaProperty;
        this.bean = bean;
        this.param = param;
    }

    public MetaProperty getMetaProperty() {
        return metaProperty;
    }

    public Object getBean() {
        return bean;
    }

    public Object getParam() {
        return param;
    }

    public PropertyAccessor getChild(String key, Object param){
        if (metaProperty == null)
            return null;
        MetaProperty result = metaProperty.getChild(key);
        return new PropertyAccessor(result, getPropertyValue(bean, param), param);
    }
    public Object getPropertyValue(Object bean, Object param){
        if (metaProperty != null && metaProperty.getProperty() != null && bean != null)
            return metaProperty.getProperty().getValue(bean, param);
        else
            return null;
    }
    public Result findByWay(Node node){
        return findByWay(node, null);
    }
    public Result findByWay(Node node, Result result){
        Object bean = this.bean;
        MetaProperty metaProperty = this.metaProperty;
        if(result != null){
            bean = result.value;
            metaProperty = result.currentMetaProperty;
        }
        if(bean == null && node != null)
            throw new IllegalStateException("bean is null,But LinedWay is not be end.");

        if(node == null || metaProperty == null || !metaProperty.hasChildren())
            return result;

        if(node.key == null)
            return result;

        MetaProperty child = metaProperty.getChild(node.getKey());

        if (child == null)
            throw new IllegalStateException("can not find property by key: " + node.getKey() +"in "+bean);

        Result current = new Result(node, child, metaProperty, getPropertyValue(bean, node.param));
        if(node.next == null)
            return current;
        return findByWay(node.next, current);
    }
    public static class Result{
        Node node;
        MetaProperty currentMetaProperty;
        MetaProperty parentProperty;
        Object value;

        public Result(Node node, MetaProperty currentMetaProperty, MetaProperty parentProperty, Object value) {
            this.node = node;
            this.currentMetaProperty = currentMetaProperty;
            this.parentProperty = parentProperty;
            this.value = value;
        }
    }
    public static class Node{
        Node previous;
        Node next;
        String key;
        Object param;

        public Node(Node previous, Node next, String key, Object param) {
            this.previous = previous;
            this.next = next;
            this.key = key;
            this.param = param;
        }

        public Node() {
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getParam() {
            return param;
        }

        public void setParam(Object param) {
            this.param = param;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}
