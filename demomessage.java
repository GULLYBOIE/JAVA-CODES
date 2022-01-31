abstract class message{
  abstract void playmessage();
}
class Textmessage extends message{
   void playmessage(){
    System.out.println("Text Message");
  }
}
class Voicemessage extends message{
   void playmessage(){
    System.out.println("Voice Message");
  }
}
class Faxmessage extends message{
   void playmessage(){
     System.out.println("Fax message");
  }
}
class demomessage{
  public static void main(String[] args){
    /*message m1=new message();*/
    Textmessage tm=new Textmessage();
    Voicemessage vm=new Voicemessage();
    Faxmessage fm=new Faxmessage();
  
	tm.playmessage();
	vm.playmessage();
	fm.playmessage();
  }
}

    