import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

// ANSI Color Codes for enhanced terminal output
class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String WHITE = "\u001B[37m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
}

// Class representing a process that implements Runnable to be run by a thread
class Process implements Runnable {
    private String name; // Name of the process
    private int burstTime; // Total time the process requires to complete (in milliseconds)
    private int timeQuantum; // Time slice (time quantum) allowed per CPU access (in milliseconds)
    private int remainingTime; // Time left for the process to finish its execution
    // Fetures 1: process priority - random priority from 1 to 10 (10= highest) used
    // for display only
    private int priority;

    // Features 3: waiting time tracking - total time spent in the ready queue and
    // the time of the last enqueue
    private long waitingTime = 0;
    private long enqueueTimestamp = 0;

    // Constructor to initialize the process with name, burst time, and time quantum
    public Process(String name, int burstTime, int timeQuantum) {
        this.name = name;
        this.burstTime = burstTime;
        this.timeQuantum = timeQuantum;
        this.remainingTime = burstTime; // Initially, remaining time is equal to the burst time
    }

    // This method will be called when the thread for this process is started
    @Override
    public void run() {
        // Simulate running for either the time quantum or remaining time, whichever is
        // smaller
        int runTime = Math.min(timeQuantum, remainingTime); // Run for the smaller of the two times

        // Show quantum execution starting
        String quantumBar = createProgressBar(0, 15);
        System.out.println(Colors.BRIGHT_GREEN + "  ▶ " + Colors.BOLD + Colors.CYAN + name +
                Colors.RESET + Colors.GREEN + " executing quantum" + Colors.RESET +
                " [" + runTime + "ms] ");

        try {
            // Simulate quantum execution with progress updates
            int steps = 5; // Number of progress updates
            int stepTime = runTime / steps;

            for (int i = 1; i <= steps; i++) {
                Thread.sleep(stepTime);
                int quantumProgress = (i * 100) / steps;
                quantumBar = createProgressBar(quantumProgress, 15);

                // Clear line and show updated progress
                System.out.print("\r  " + Colors.YELLOW + "⚡" + Colors.RESET +
                        " Quantum progress: " + quantumBar);
            }
            System.out.println(); // New line after quantum completion

        } catch (InterruptedException e) {
            System.out.println(Colors.RED + "\n  ✗ " + name + " was interrupted." + Colors.RESET);
        }

        remainingTime -= runTime; // Deduct the run time from the remaining time
        int overallProgress = (int) (((double) (burstTime - remainingTime) / burstTime) * 100);
        String overallProgressBar = createProgressBar(overallProgress, 20);

        System.out.println(Colors.YELLOW + "  ⏸ " + Colors.CYAN + name + Colors.RESET +
                " completed quantum " + Colors.BRIGHT_YELLOW + runTime + "ms" + Colors.RESET +
                " │ Overall progress: " + overallProgressBar);
        System.out.println(Colors.MAGENTA + "     Remaining time: " + remainingTime + "ms" + Colors.RESET);

        // If the process still has remaining time, it yields CPU for the next process
        if (remainingTime > 0) {
            System.out.println(Colors.BLUE + "  ↻ " + Colors.CYAN + name + Colors.RESET +
                    " yields CPU for context switch" + Colors.RESET);
        } else {
            // If no time is left, the process has finished its execution
            System.out.println(Colors.BRIGHT_GREEN + "  ✓ " + Colors.BOLD + Colors.CYAN + name +
                    Colors.RESET + Colors.BRIGHT_GREEN + " finished execution!" +
                    Colors.RESET);
        }
        System.out.println();
    }

    // Helper method to create a visual progress bar
    private String createProgressBar(int progress, int width) {
        int filled = (progress * width) / 100;
        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < width; i++) {
            if (i < filled) {
                bar.append(Colors.GREEN + "█" + Colors.RESET);
            } else {
                bar.append(Colors.WHITE + "░" + Colors.RESET);
            }
        }
        bar.append("] ").append(progress).append("%");
        return bar.toString();
    }

    // Method to run the last process to completion, ignoring the time quantum
    public void runToCompletion() {
        try {
            // Run for the remaining time without splitting into smaller time slices
            System.out.println(Colors.BRIGHT_CYAN + "  ⚡ " + Colors.BOLD + Colors.CYAN + name +
                    Colors.RESET + Colors.BRIGHT_CYAN + " is the last process, running to completion" +
                    Colors.RESET + " [" + remainingTime + "ms]");
            Thread.sleep(remainingTime); // Run until completion
            remainingTime = 0; // Mark the process as completed
            System.out.println(Colors.BRIGHT_GREEN + "  ✓ " + Colors.BOLD + Colors.CYAN + name +
                    Colors.RESET + Colors.BRIGHT_GREEN + " finished execution!" + Colors.RESET);
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println(Colors.RED + "  ✗ " + name + " was interrupted." + Colors.RESET);
        }
    }

    // Getter methods for process name, burst time, and remaining time
    public String getName() {
        return name;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    // Check if the process has finished (i.e., no remaining time)
    public boolean isFinished() {
        return remainingTime <= 0;
    }

    // Feature 1: process priority - setter and getter for the priority value
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    // Featere 3: waiting time tracking - save the moment the process enters the
    // ready queue
    public void markEnqueued() {
        enqueueTimestamp = System.currentTimeMillis();
    }

    // Feature 3: waiting time tracking - add the time spent in the ready queue to
    // the total waiting time
    public void recordWaiting() {
        waitingTime += System.currentTimeMillis() - enqueueTimestamp;
    }

    // Feature 3: waiting time tracking - getters for waiting time and turnaround
    // time (waiting + burst)
    public long getWaitingTime() {
        return waitingTime;
    }

    public long getTurnaroundTime() {
        return waitingTime + burstTime;
    }
}

public class SchedulerSimulation {
    // Feature 2: context switch counter - static counter incremented each time a
    // new process starts running
    private static int contextSwitchCount = 0;

    public static void main(String[] args) {
        // ⚠️ IMPORTANT: Put your student ID here to seed the random number generator
        // This makes your output unique to you - DO NOT forget to change this!
        int studentID = 444052856; // ← CHANGE THIS TO YOUR ACTUAL STUDENT ID

        Random random = new Random(studentID);

        // Feature 1: process priorty - separate generator with the same seed so burst
        // times stay unchanged
        Random priorityRandom = new Random(studentID);
        // Define the time quantum in milliseconds (the maximum time a process gets in
        // one round)
        // Choose a random number between 2000 and 5000 ms with a step of 1000 ms
        int timeQuantum = 2000 + random.nextInt(4) * 1000; // Random: 2000, 3000, 4000, or 5000

        // Generate random number of processes between 10 and 20
        int numProcesses = 10 + random.nextInt(11); // Random number between 10 and 20

        // Queue to manage processes in a First-In-First-Out (FIFO) order
        Queue<Thread> processQueue = new LinkedList<>();

        // Map to associate each thread with its respective process object
        Map<Thread, Process> processMap = new HashMap<>();

        // Feature 3: waiting time tracking - list of all processes used to print the
        // final table
        ArrayList<Process> allProcesses = new ArrayList<>();

        // Print simulation header with elegant formatting
        System.out.println("\n" + Colors.BOLD + Colors.BRIGHT_CYAN +
                "╔═══════════════════════════════════════════════════════════════════════════════════════╗" +
                Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET +
                Colors.BG_BLUE + Colors.BRIGHT_WHITE + Colors.BOLD +
                "                          CPU SCHEDULER SIMULATION                                " +
                Colors.RESET + Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN +
                "╠═══════════════════════════════════════════════════════════════════════════════════════╣" +
                Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET +
                Colors.YELLOW + "  ⚙ Processes:     " + Colors.RESET + Colors.BRIGHT_YELLOW +
                String.format("%-65s", numProcesses) +
                Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET +
                Colors.YELLOW + "  ⏱ Time Quantum:  " + Colors.RESET + Colors.BRIGHT_YELLOW +
                String.format("%-65s", timeQuantum + "ms") +
                Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET +
                Colors.YELLOW + "  🔑 Student ID:    " + Colors.RESET + Colors.BRIGHT_YELLOW +
                String.format("%-65s", studentID) +
                Colors.BOLD + Colors.BRIGHT_CYAN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN +
                "╚═══════════════════════════════════════════════════════════════════════════════════════╝" +
                Colors.RESET + "\n");

        // Create 'numProcesses' number of processes
        for (int i = 1; i <= numProcesses; i++) {
            // Random burst time for each process between timeQuantum/2 and 3*timeQuantum
            int burstTime = timeQuantum / 2 + random.nextInt(2 * timeQuantum + 1);

            // Create a new process object with a unique name, burst time, and the defined
            // time quantum
            Process process = new Process("P" + i, burstTime, timeQuantum);

            // Feature 1: process priority - assign a random priority from 1 to 10 the new
            // process
            process.setPriority(1 + priorityRandom.nextInt(10));

            // Feature 3: waiting time tracking - keep the process in the list for the final
            // table
            allProcesses.add(process);
            // Add the process to the ready queue and the map
            addProcessToQueue(process, processQueue, processMap);
        }

        // Start of the scheduler simulation
        System.out.println(Colors.BOLD + Colors.GREEN +
                "╔════════════════════════════════════════════════════════════════════════════════╗" +
                Colors.RESET);
        System.out.println(Colors.BOLD + Colors.GREEN + "║" + Colors.RESET +
                Colors.BG_GREEN + Colors.WHITE + Colors.BOLD +
                "                        ▶  SCHEDULER STARTING  ◀                               " +
                Colors.RESET + Colors.BOLD + Colors.GREEN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.GREEN +
                "╚════════════════════════════════════════════════════════════════════════════════╝" +
                Colors.RESET + "\n");

        // Loop to manage the scheduling of processes
        while (!processQueue.isEmpty()) {
            // Get the next thread from the queue (FIFO)
            Thread currentThread = processQueue.poll(); // Dequeues the next thread

            // Print the current process queue (list of process IDs in the queue)
            System.out.println(Colors.BOLD + Colors.MAGENTA + "┌─ Ready Queue " + "─".repeat(65) + Colors.RESET);
            System.out.print(Colors.MAGENTA + "│ " + Colors.RESET + Colors.BRIGHT_WHITE + "[" + Colors.RESET);
            int queueCount = 0;
            for (Thread thread : processQueue) {
                Process process = processMap.get(thread);
                if (queueCount > 0)
                    System.out.print(Colors.WHITE + " → " + Colors.RESET);
                System.out.print(Colors.BRIGHT_CYAN + process.getName() + Colors.RESET);
                queueCount++;
            }
            if (queueCount == 0) {
                System.out.print(Colors.YELLOW + "empty" + Colors.RESET);
            }
            System.out.println(Colors.BRIGHT_WHITE + "]" + Colors.RESET);
            System.out.println(Colors.BOLD + Colors.MAGENTA + "└" + "─".repeat(79) + Colors.RESET + "\n");

            // Feature 2: context switch counter - a new process is about to start running
            // so increase the counter
            contextSwitchCount++;

            // Feature 3: waiting time tracking - add the time process waited in the ready
            // queue
            processMap.get(currentThread).recordWaiting();

            // Start the thread, which will run the process for one time quantum
            currentThread.start();

            try {
                // Wait for the thread to finish its time quantum before continuing to the next
                // process
                currentThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }

            // Retrieve the process associated with the thread from the map
            Process process = processMap.get(currentThread);

            // Check if the process is not finished
            if (!process.isFinished()) {
                // If the process still has remaining time, check if there are more processes in
                // queue
                if (!processQueue.isEmpty()) {
                    // Re-enqueue the process to give it another chance to run in the next round
                    addProcessToQueue(process, processQueue, processMap);
                } else {
                    // If this is the last process in the queue, run it to completion
                    System.out.println(Colors.BRIGHT_YELLOW + "  ⚠ " + Colors.CYAN + process.getName() +
                            Colors.RESET + Colors.YELLOW + " is the last process → running to completion" +
                            Colors.RESET);
                    process.runToCompletion(); // Run until the process completes
                }
            }
        }

        // End of the scheduler simulation
        System.out.println(Colors.BOLD + Colors.BRIGHT_GREEN +
                "╔════════════════════════════════════════════════════════════════════════════════╗" +
                Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_GREEN + "║" + Colors.RESET +
                Colors.BG_GREEN + Colors.WHITE + Colors.BOLD +
                "                     ✓  ALL PROCESSES COMPLETED  ✓                            " +
                Colors.RESET + Colors.BOLD + Colors.BRIGHT_GREEN + "║" + Colors.RESET);
        System.out.println(Colors.BOLD + Colors.BRIGHT_GREEN +
                "╚════════════════════════════════════════════════════════════════════════════════╝" +
                Colors.RESET + "\n");

        // Feature 2: context switch counter - print the total number of context
        // switches at the end
        System.out.println(Colors.BOLD + Colors.BRIGHT_YELLOW + "Total Context Switches: " + contextSwitchCount
                + Colors.RESET + "\n");

        // Feature 3: Waiting Time Tracking - print the final table (Turnaround Time =
        // Waiting Time + Burst Time)
        System.out.println(Colors.BOLD + Colors.BRIGHT_CYAN + "FINAL STATISTICS TABLE" + Colors.RESET);
        System.out.println(
                String.format("%-10s %-15s %-15s %-18s", "Process", "Burst Time", "Waiting Time", "Turnaround Time"));
        System.out.println("-".repeat(60));
        long totalWaiting = 0;
        long totalTurnaround = 0;
        for (Process p : allProcesses) {
            System.out.println(String.format("%-10s %-15s %-15s %-18s",
                    p.getName(), p.getBurstTime() + " ms", p.getWaitingTime() + " ms", p.getTurnaroundTime() + " ms"));
            totalWaiting += p.getWaitingTime();
            totalTurnaround += p.getTurnaroundTime();
        }
        System.out.println("-".repeat(60));
        System.out.println("Average Waiting Time: " + (totalWaiting / allProcesses.size()) + " ms");
        System.out.println("Average Turnaround Time: " + (totalTurnaround / allProcesses.size()) + " ms");
    }

    // Method to add a process to the queue and map, while printing a "ready"
    // message
    public static void addProcessToQueue(Process process, Queue<Thread> processQueue,
            Map<Thread, Process> processMap) {
        // Create a new thread to run the process
        Thread thread = new Thread(process);

        // Add the thread to the ready queue
        processQueue.add(thread);

        // Map the thread to the process, so we can track the process associated with
        // each thread
        processMap.put(thread, process);

        // Feature 3: waiting time tracking - the process starts waiting now so save the
        // current time
        process.markEnqueued();

        // Print a message indicating the process has entered the ready queue
        System.out.println(Colors.BLUE + "  ➕ " + Colors.BOLD + Colors.CYAN + process.getName() +
                Colors.RESET + Colors.BLUE + " added to ready queue" + Colors.RESET +
                " │ Burst time: " + Colors.YELLOW + process.getBurstTime() + "ms" +
                Colors.RESET);

        // Feature 1: Process Priority - show the priority when the process enters the
        // ready queue (display only)
        System.out.println(Colors.BLUE + "     Priority: " + Colors.BRIGHT_YELLOW + process.getPriority() + Colors.RESET);
    }
}
