package Menues;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class SUBMENU extends Application
{
    public void start(Stage primaryStage)
    {
try
{
MenuBar main_menu=new MenuBar();
Menu File=new Menu("File");
Menu Edit=new Menu("Edit");
Menu Source=new Menu("Source");
Menu Refactor=new Menu("Refactor");
// Mapping all the menu objects to menu bar
main_menu.getMenus().add(File);
main_menu.getMenus().add(Edit);
main_menu.getMenus().add(Source);
main_menu.getMenus().add(Refactor);
//Let us add Menu Items for File Menu
Menu New=new Menu("New"); //New is not a menu item its a menu
MenuItem OpenFile=new MenuItem("Open File...");
MenuItem OpenProjects=new MenuItem("Open Projects From File Systems...");
MenuItem RecentFiles=new MenuItem("Recent Files");
MenuItem Save=new MenuItem("Save");
//We will create Menu Items for New Menu
MenuItem JavaProject=new MenuItem("Java Project");
MenuItem Project=new MenuItem("Project");
MenuItem Package1=new MenuItem("Package");
MenuItem Class1=new MenuItem("Class");
//Mapping Menu Items to Menu New
New.getItems().add(JavaProject);
New.getItems().add(Project);
New.getItems().add(Package1);
New.getItems().add(Class1);
//Map the Menu Items to the File Menu
File.getItems().add(New);
File.getItems().add(OpenFile);
File.getItems().add(OpenProjects);
File.getItems().add(RecentFiles);
File.getItems().add(Save);
// Create a Layout and add the menu bar to the Layout
BorderPane root=new BorderPane();
root.setTop(main_menu);
//we need to add this Layout to the Scene
Scene sc=new Scene(root);
primaryStage.setScene(sc);
primaryStage.setWidth(500);
primaryStage.setHeight(500);
primaryStage.show();
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[] args)
{
launch(args);
}
}
