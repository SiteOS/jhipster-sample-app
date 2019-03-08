open module io.github.jhipster.sample {

    requires org.apache.commons.lang3;

    requires org.apache.logging.slf4j;
    requires org.apache.logging.log4j;
    requires slf4j.api;
    requires logback.classic;

    requires hibernate.core;
    requires hibernate.envers;
    requires hibernate.jpamodelgen;

    requires liquibase.core;

    requires spring.boot.actuator;
    requires spring.security.core;
    requires spring.security.config;
    requires spring.security.web;

    requires org.aspectj.weaver;

    requires problem;
    requires problem.violations;
    requires problem.spring.web;

    requires jhipster.framework;

    requires jackson.annotations;
    requires jackson.datatype.problem;
    requires com.fasterxml.jackson.datatype.hibernate5;
    requires com.fasterxml.jackson.datatype.jdk8;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.module.afterburner;

    requires cache.api;

    // requires activation;
    requires java.annotation;
    requires java.instrument;
    requires java.persistence;
    requires java.sql;
    requires java.transaction;
    requires java.validation;
    requires java.xml.bind;

    requires org.hibernate.validator;
    requires hibernate.commons.annotations;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;

    requires jdk.unsupported;
}
