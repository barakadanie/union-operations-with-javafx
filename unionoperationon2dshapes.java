package straightline;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class unionoperationon2dshapes extends Application {
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing Circle1
        Circle circle1=new Circle();
        //Setting the position of the circle
        circle1.setCenterX(250.0f);
        circle1.setCenterY(135.0f);
        //Setting the radius of the circle
        circle1.setRadius(100.0f);
        //Setting the color of the circle
        circle1.setFill(Color.DARKSLATEBLUE);
        //drawing circle 2
        Circle circle2=new Circle();
        //Setting the position of the circle
        circle2.setCenterX(350.0f);
        circle2.setCenterY(135.0f);
        //Setting the radius of the circle
        circle2.setRadius(100.0f);
        //Setting the color of the circle
        circle2.setFill(Color.BLUE);
        //Performing union operation on the circle
        Shape shape= Shape.union(circle1,circle2);
        //Setting the fill color to the result
        shape.setFill(Color.DARKSLATEBLUE);
        Group root=new Group(shape);
        Scene scene=new Scene(root,600,300);
        primaryStage.setTitle("union operation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String []args)
    {
        launch(args);
    }
}
