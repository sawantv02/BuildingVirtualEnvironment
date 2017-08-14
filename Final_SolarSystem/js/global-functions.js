/*
   Keylistener functions
*/
// Setup
//var keyListener = new window.keypress.Listener();

// check targets object
// keyListener.simple_combo('letter', function(){
//    do a thing
// });

/*
   Reload page after so many seconds, used for development
*/
function reloadPage(seconds){

   function reloadCallback(){ 
      return function(){
         window.location.reload();
      }
   }
   var millis = seconds * 1000;

   setTimeout(reloadCallback(), millis);

}


/*
   Toggle to a target. Works by setting all targets below the ground plane, then pulling up the active one
*/


function devTools(){
   if(settings.enterVR == true){
      scene.enterVR();
   }
   // If the reload setting is turned on, enterVR and reload the page after a set time
   if(settings.reload == true){
      reloadPage(settings.reloadTime);
   }
}



function toggleCameraTo(targetCamera){

   if(cameras.active != undefined){
      activeCamera = cameras.active;
   }else if(settings.camera != undefined){
      activeCamera = settings.camera;
   }else{
      return;
   }


   // Deactivate active camera
   scene.querySelector('#' + activeCamera).setAttribute('active', false);

   // Activate target camera
   scene.querySelector('#' + targetCamera).setAttribute('active', true);

   // Set new active camera
   cameras.active = targetCamera;
}
