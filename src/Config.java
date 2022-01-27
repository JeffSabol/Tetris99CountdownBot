public class Config {

    public static String currentGame = "Tetris 99";

    public static void main(String[] args) throws Exception {

        String channel = "#"; //INSERT YOUR CHANNEL NAME HERE (NOT CASE SENSITIVE)

        //Define the bot
        Bot bot = new Bot();
        bot.setVerbose(true);
        bot.connect("irc.twitch.tv",6667,""); //password is omitted for protection. To get your own key go to http://twitchapps.com/tmi
        bot.joinChannel(channel);
        bot.getName();
    }
}
