class CommandLineArguments {
    public static void main(String[] args) {
        // Checking if any arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments:");
            // Iterating through the arguments and printing them
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
