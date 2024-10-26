import java.util.Random;

public class SkibidiCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            showHelp();
            return;
        }

        switch (args[0]) {
            case "dance":
                dance();
                break;
            case "fact":
                fact();
                break;
            default:
                showHelp();
                break;
        }
    }

    private static void dance() {
        System.out.println("💃 Skibidi dop dop dop dop dop, yes yes yes 💃");
    }

    private static void fact() {
        String[] facts = {
            "Skibidi is very goofy.",
            "The skibidi dance has aura",
            "The word 'skibidi' doesn’t mean anything; it's just 𝓯𝓻𝓮𝓪𝓴𝔂!"
        };
        Random random = new Random();
        System.out.println(facts[random.nextInt(facts.length)]);
    }

    private static void showHelp() {
        System.out.println("Usage: skibidi <command>");
        System.out.println("Commands:");
        System.out.println("  dance   - Make the Skibidi CLI dance");
        System.out.println("  fact    - Get a random Skibidi fun fact");
    }
}
