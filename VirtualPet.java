import javax.swing.*;


//story about growing up in school
//

/* Virtual Pet, version 2
 * 
 * @author Ratchet
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int tiredness = 0;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
        // String s = (String)JOptionPane.showInputDialog(
        //   new JFrame(),
        //   "Your Message",
        //   "Your Title",
        //   JOptionPane.PLAIN_MESSAGE
  
    }
    public void takeABeat(int ms){
      try {
        Thread.sleep(ms);
      } catch(Exception e) {

      }
  }

    public void react() {
      String r = (String)JOptionPane.showInputDialog(
  
          new JFrame(),
          "Do you want to study for the math exam tomorrow ",
          "Question",
          JOptionPane.PLAIN_MESSAGE
      );
     
        if (r.equals("no") || r.equals("No")){
        face.setMessage("Oh man! I failed my math exam!");
        face.setImage("drakeSad");
        takeABeat(3000);
        face.setMessage("Math is too hard, im gonna drop this class");
        takeABeat(3000);
        }
        else {
        String h = (String)JOptionPane.showInputDialog(
                  new JFrame(),
                  "Did you check my grades? What did I get on the last test?",
                  "Question",
                  JOptionPane.PLAIN_MESSAGE

        );
        int x = Integer.parseInt(h);
      if(x == 100){
      face.setMessage("Yay I'm so happy I did well! I don't need to learn anything more, I'm going to quit school and pursue a music career!");
      face.setImage("drakeJoyous");
      takeABeat(5000);
      } else if (x >= 90) {
      face.setMessage("Wow I did great! I'm so happy I'm going to quit school and pursue a music career!.");
      face.setImage("drakeJoyous");
      takeABeat(5000);
      } else if (x >= 70) {
      face.setMessage("That's good, I could have done better, though. Maybe if I drop out and start making music I will do better.");
      face.setImage("drakeJoyous");
      takeABeat(5000);
      } else {
      face.setMessage("That's terrible! I want to drop out and start a music career!");
      face.setImage("drakeSad");
      takeABeat(5000);
      face.setMessage("I'm going to quit school and start a music career.");
      face.setImage("drakeSad");
      takeABeat(5000);
      }
        }

    }

    public void voice(){
      face.setMessage("Today's my first day of voice lessons, and it was all because of that test! I'm so excited :)");
      face.setImage("drakeSinging");
      takeABeat(3000);

    }

    public void album(){
        face.setMessage("Now that I'm focusing on my music career, I can make my first album!");
        face.setImage("drakeStudio");
        takeABeat(3000);
    }

    public void isAlbumGood(){
    String j = (String)JOptionPane.showInputDialog(
  
          new JFrame(),
          "I just finished my new album! Do you like it ",
          "Question",
          JOptionPane.PLAIN_MESSAGE
      );
      if (j.equals("no") || j.equals("No")){
        face.setMessage("Oh man! That hurts to hear! Maybe I should just pursue acting, music isn't for me.");
        face.setImage("drakeSad");
        takeABeat(3000);
      }
      else {
      face.setMessage("Yay I'm so happy you liked my album! I'm gonna keep making music!");
      face.setImage("drakeJoyous");
      takeABeat(5000);
      }
    }

    public void stopMusicAndStartActing(){
      String a = (String)JOptionPane.showInputDialog(
  
          new JFrame(),
          "I'm tired of music. Should I quit and become an actor?",
          "Question",
          JOptionPane.PLAIN_MESSAGE
      );
      if (!a.equals("no") && !a.equals("No")) {
        face.setMessage("I'm acting now and I'm happier than ever! Thank you for your suggestion!");
        face.setImage("drakeActing");
      }
      else {
        face.setMessage("I will keep making music! I have rediscovered my passion. Thank you for the help!");
        face.setImage("drakeStudio");
      }
        
    

    }
}