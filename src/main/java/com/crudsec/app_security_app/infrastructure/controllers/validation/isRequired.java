package com.crudsec.app_security_app.infrastructure.controllers.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;

@Constraint(validatedBy = RequiredValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface isRequired {
	String message() default "El atributo es requerido y no puede se vacio";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
