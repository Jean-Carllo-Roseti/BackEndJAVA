package br.com.jcmar;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})

public @interface ITabela {
    String tabela();
}
