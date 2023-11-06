import PanelManagers.*;

public class Main
{
    public static void main(String [] args)
    {
        PanelController.initializeFrame();

        PanelCreator.CreateMainPanel();

        PanelController.openPanel("Main");
    }
}