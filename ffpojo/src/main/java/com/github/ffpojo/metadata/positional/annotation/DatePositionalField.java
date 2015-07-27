package com.github.ffpojo.metadata.positional.annotation;

import com.github.ffpojo.metadata.positional.PaddingAlign;
import com.github.ffpojo.metadata.positional.annotation.PositionalField; 

public @interface DatePositionalField{
	int initialPosition();
	int finalPosition();
	PaddingAlign paddingAlign() default PaddingAlign.RIGHT;
	char paddingCharacter() default ' ';
	boolean trimOnRead() default true;
	String pattern();

}
