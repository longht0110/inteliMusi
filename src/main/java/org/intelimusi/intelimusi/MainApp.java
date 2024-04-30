package org.intelimusi.intelimusi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Tạo WebView
        WebView webView = new WebView();

        // Tải trang HTML
        webView.getEngine().load(getClass().getResource("index.html").toExternalForm());

        // Tạo Scene và thêm WebView vào Scene
        BorderPane root = new BorderPane();
        root.setCenter(webView);
        Scene scene = new Scene(root);

        // Thiết lập kích thước cố định cho cửa sổ
        primaryStage.setWidth(1200);
        primaryStage.setHeight(800);

        // Không cho phép thay đổi kích thước cửa sổ
        primaryStage.setResizable(false);

        // Thiết lập Scene và hiển thị Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}