import javax.swing.*;

class SimpleButton{
 
   public static void main(String args[]){
 
       JFrame frame = new JFrame();
       JButton button = new JButton("Button");
 
       frame.add(button);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true) 
    }
}


const videoElement = document.querySelector('Snømann.mp4.mp4');

document.addEventListener('click', function() {
    videoElement.style.position = 'fixed';
    videoElement.style.top = '0';
    videoElement.style.left = '0';
    videoElement.style.width = '100%';
    videoElement.play();
});
    