public class WelcomeMessage {
    public static void main(String[] args) {
        String name = "Alice";
        String city = "Melbourne";

        // Use StringBuffer to construct a personalized message
        StringBuffer message = new StringBuffer();
        message.append("Welcome, ").append(name);
        message.append("! We hope you're enjoying your time in ");
        message.append(city).append(".");
        System.out.println(message);
    }
}
