module com.acebear.sample {
    exports com.acebear.sample;
    opens com.acebear.sample;
    requires org.slf4j;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
}