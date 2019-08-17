package com.tiagods.javafxspringboot;

import com.tiagods.javafxspringboot.utils.AbstractJavaFxSupport;
import com.tiagods.javafxspringboot.view.Menu;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class JavafxspringbootApplication extends AbstractJavaFxSupport {
	public static void main(String[] args) {
		launch(JavafxspringbootApplication.class, Menu.class, args);
	}
}
