package com.comrades.app.core.bases;


import com.comrades.app.core.log.FuncionalidadeLogEnum;
import com.comrades.app.core.log.OperacaoLogEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface LoggedUseCase {
    OperacaoLogEnum operacao();
    FuncionalidadeLogEnum funcionalidade();
    Class<?> clazz();
}
