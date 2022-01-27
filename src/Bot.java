import org.jibble.pircbot.*;

public class Bot extends PircBot {

    public Bot(){
        this.setName(""); //INSERT YOUR BOT NAME HERE, ALL LOWERCASE

        this.isConnected();

    }

    public void onMessage(String channel, String sender, String login, String hostname, String message){
        if(message.equalsIgnoreCase("!botCommands")){
            sendMessage(channel,"My commands are: !cd20 | !cd30 | !cd1m");
        }
        try {
            if (message.equalsIgnoreCase("!cd20")) {
            sendMessage(channel,"20 second countdown started!");
            for (int i = 1; i <= 20; i++) {
                Thread.sleep(1000); //Wait 1 second (1000 ms)
                if (i == 10)
                    sendMessage(channel, "10 seconds get ready!");
                if (i == 15)
                    sendMessage(channel, "5");
                if (i == 16)
                    sendMessage(channel, "4");
                if (i == 17)
                    sendMessage(channel, "3");
                if (i == 18)
                    sendMessage(channel, "2");
                if (i == 19)
                    sendMessage(channel, "1");
                if (i == 20)
                    sendMessage(channel, "JOIN NOW!");
            }
        }
        }catch(InterruptedException ex){
            sendMessage(channel,"Aw fuck superGamerBoy_ sucks at programming! lolol");
        }
        try {
            if (message.equalsIgnoreCase("!cd30")) {
                sendMessage(channel,"30 second countdown started!");
                for (int i = 1; i <= 30; i++) {
                    Thread.sleep(1000); //Wait 1 second (1000 ms)
                    if (i == 10)
                        sendMessage(channel,"20 seconds");
                    if (i == 20)
                        sendMessage(channel, "10 seconds get ready!");
                    if (i == 25)
                        sendMessage(channel, "5");
                    if (i == 26)
                        sendMessage(channel, "4");
                    if (i == 27)
                        sendMessage(channel, "3");
                    if (i == 28)
                        sendMessage(channel, "2");
                    if (i == 29)
                        sendMessage(channel, "1");
                    if (i == 30)
                        sendMessage(channel, "JOIN NOW!");
                }
            }
        }catch(InterruptedException ex){
            sendMessage(channel,"Aw fuck superGamerBoy_ sucks at programming! lolol");
        }
        try {
            if (message.equalsIgnoreCase("!cd1m")) {
                sendMessage(channel,"1 minute countdown started!");
                for (int i = 1; i <= 60; i++) {
                    Thread.sleep(1000); //Wait 1 second (1000 ms)
                    if (i == 30)
                        sendMessage(channel,"30 seconds");
                    if (i == 40)
                        sendMessage(channel,"20 seconds");
                    if (i == 50)
                        sendMessage(channel, "10 seconds get ready!");
                    if (i == 55)
                        sendMessage(channel, "5");
                    if (i == 56)
                        sendMessage(channel, "4");
                    if (i == 57)
                        sendMessage(channel, "3");
                    if (i == 58)
                        sendMessage(channel, "2");
                    if (i == 59)
                        sendMessage(channel, "1");
                    if (i == 60)
                        sendMessage(channel, "JOIN NOW!");
                }
            }
        }catch(InterruptedException ex){
            sendMessage(channel,"Aw fuck superGamerBoy_ sucks at programming! lolol");
        }

    }


}
