package cz.projectzet.core.util;

import cz.projectzet.core.AbstractDaemon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DaemonConflict {

    Class<? extends AbstractDaemon<?>>[] value();

}
