package anotacao;

import java.lang.annotation.*;

/**
 *@author rafael.marques
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
