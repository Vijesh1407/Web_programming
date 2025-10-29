 import java.awt.*;
 public class FrameExample
 {
 FrameExample()
 {
 Frame fr=new Frame();  //Creating Frame     
Button b=new Button("Button!!"); 
fr.add(b); //adding button to the frame
 fr.setSize(500, 300);  //setting frame size
 fr.setLayout(new FlowLayout()); //Setting the layout for the Frame
 fr.setVisible(true);                
}
 public static void main(String args[])
 {
 FrameExample ex = new FrameExample(); 
}
 }