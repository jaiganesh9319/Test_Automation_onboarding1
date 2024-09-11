package Strategy_pattern;

//Main class to test the app
public class CameraAppTest {
 public static void main(String[] args) {
     // Create a BasicCameraApp instance
     PhoneCameraApp basicApp = new BasicCameraApp();
     basicApp.takePhoto();
     basicApp.editPhoto();
     basicApp.savePhoto();
     
     // Set sharing method to Text and perform sharing
     basicApp.setShareBehavior(new ShareByText());
     basicApp.performShare();

     // Switch sharing method to Social Media
     basicApp.setShareBehavior(new ShareBySocialMedia());
     basicApp.performShare();

     // Create a CameraPlusApp instance with advanced features
     PhoneCameraApp cameraPlusApp = new CameraPlusApp();
     cameraPlusApp.takePhoto();
     cameraPlusApp.editPhoto();
     cameraPlusApp.savePhoto();

     // Set sharing method to Email for CameraPlusApp
     cameraPlusApp.setShareBehavior(new ShareByEmail());
     cameraPlusApp.performShare();
 }
}
