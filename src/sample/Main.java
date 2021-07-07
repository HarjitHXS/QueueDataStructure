package sample;



import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

import java.util.PriorityQueue;
import java.util.Queue;


public class Main extends Application {
    private GridPane o = new GridPane();
    private BorderPane one= new BorderPane();
    private Button peek = new Button("peek");
    private Button poll = new Button("pop");
    private  Button add = new Button("Add");
    private Scene scene = new Scene(o,500,500);




    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Track the hikers");

        o.add(add,0,1);
        o.add(poll,0,2);
        o.add(peek,2,0);

        Queue<Integer> stack = new PriorityQueue<>();
        
        poll.setOnAction(e ->  stack_poll(stack));

        add.setOnAction(e ->  stack_push(stack));

        peek.setOnAction(e ->  stack_peek(stack));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    // Pushing element on the top of the Queue
    static void stack_push(Queue<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.add(i);
        }
    }

    // Popping element from the top of the Queue
    static void stack_poll(Queue<Integer> stack)
    {
        System.out.println("Poll Operation:");

        for(int i = 0; i < 1; i++)
        {
            Integer y = (Integer) stack.poll();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the Queue
    static void stack_peek(Queue<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on Queue top: " + element);
    }




}
