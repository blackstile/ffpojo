package com.github.ffpojo.metadata.positional.annotation;

import com.github.ffpojo.metadata.positional.PaddingAlign;

public @interface NumberFieldPosition {

	int initialPosition();
	int finalPosition();
	PaddingAlign paddingAlign() default PaddingAlign.RIGHT;
	char paddingCharacter() default ' ';
	boolean trimOnRead() default true;
	Class<? extends Number> numberClass() default Long.class;
	int precision() default 0;
	
}
