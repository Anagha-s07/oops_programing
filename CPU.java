import java.util.*;

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

 
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

  
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter CPU Price: ");
        double price = sc.nextDouble();
        CPU cpu = new CPU(price);

      
        System.out.print("Enter number of processor cores: ");
        int cores = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter processor manufacturer: ");
        String procManufacturer = sc.nextLine();

        CPU.Processor processor = cpu.new Processor(cores, procManufacturer);

        
        System.out.print("Enter RAM size (GB): ");
        int memory = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.nextLine();

        CPU.RAM ram = new CPU.RAM(memory, ramManufacturer);

        
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpu.price);
        processor.display();
        ram.display();

        sc.close();
    }
}

