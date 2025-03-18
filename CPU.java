import java.util.Scanner;

class CPU {
    private double price;

    // Constructor
    public CPU(double price) {
        this.price = price;
    }

    // Method to display CPU price in INR
    public void displayPrice() {
        System.out.println("CPU Price: ₹" + price);
    }

    // Inner class Processor
    class Processor {
        private int cores;
        private String manufacturer;

        // Constructor
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        // Method to display processor details
        public void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        private int memory;
        private String manufacturer;

        // Constructor
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to display RAM details
        public void displayRAMInfo() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input for CPU
        System.out.print("Enter the price of the CPU in INR: ");
        double price = scanner.nextDouble();
        CPU cpu = new CPU(price);
        cpu.displayPrice();

        // Accepting user input for Processor
        System.out.print("Enter the number of cores for the Processor: ");
        int cores = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the manufacturer of the Processor: ");
        String processorManufacturer = scanner.nextLine();
        CPU.Processor processor = cpu.new Processor(cores, processorManufacturer);
        processor.displayProcessorInfo();

        // Accepting user input for RAM
        System.out.print("Enter the amount of memory (in GB) for the RAM: ");
        int memory = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the manufacturer of the RAM: ");
        String ramManufacturer = scanner.nextLine();
        CPU.RAM ram = new CPU.RAM(memory, ramManufacturer);
        ram.displayRAMInfo();

        // Close scanner
        scanner.close();
    }
}

