import UIExtensions.Frame;

public class Main
{
    public static void main(String [] args)
    {
        Frame window = new Frame();
        Style.window = window;

        Style.CreateMainPanel();
        window.openPanel("Main");
    }
}