# 📝 MY_WORK: Student Information, Development Log, Reflection & Answers

> This is the **only file** your instructor reads to grade Parts 3 and 4 (documentation and video). Everything you write here must be **in your own words**.

---

## 🛑 STOP: Read This Before You Do Anything Else

> ### 1️⃣ Read the whole `README.md` first
> The `README.md` in this repository contains the full instructions: class descriptions, feature specifications, question prompts and the video script. **If you skip it, you will lose marks.**
>
> ### 2️⃣ Understand the full code before answering any question
> Open `SchedulerSimulation.java` and read it **from top to bottom**. You must be able to explain what `Process`, `run()`, `runToCompletion()`, `addProcessToQueue()`, `Thread.start()`, `Thread.join()` and `Thread.sleep()` do **before** you write a single answer in Parts B and C. Run the program at least once and watch the output.
>
> ### 3️⃣ Commit many times, not once
> A single commit, or all commits made in the last hour, costs you **-0.5 mark**. See the [Commit Rules](#-commit-rules-mandatory) below.

**How to use this file:**
1. Fill in your **Student Information** (below) right now.
2. Follow the steps in the **Work Roadmap** in order.
3. Update the **Development Log** *every time* you work on the assignment, not at the end.
4. Do not delete any section header. Replace the `[...]` placeholders with your own text.

---

## 👤 Student Information

> ⚠️ **WARNING:** Fill this in first. Your name and ID must match the student ID you set in `SchedulerSimulation.java` (line 150) and the one you say in your video.

| Field | Your Answer |
|-------|-------------|
| **Full Name** | [Waad Madhi AlShammari] |
| **Student ID** | [444052856] |
| **University Email** | 444052856@std.psau.edu.sa |
| **GitHub Username** | [444052856eng] |
| **Repository Link** | [https://github.com/444052856eng/OS-Assignment1-Waadd-Alshammarri.git] |
 
---

## 🎥 Video Link

**Video Link**: [https://youtu.be/73Ff9yIXjLo?si=gN93awrZF9OSxw8i]

> ⚠️ **WARNING:** The video must be **publicly accessible** ("Anyone with the link can view") on **Google Drive**, **YouTube (Unlisted or Public)** or any other cloud file-sharing system. A private, restricted or broken link counts as a **missing video (-1 mark)**.
>
> 💡 **TIP:** Open the link in a **private/incognito window** before you submit. If it asks you to log in or request access, it is not public.
>
> 📌 **NOTE:** The link goes in **this file only** (`MY_WORK.md`), **not** in `README.md`. Name your video file `StudentID_Assignment1_Demo.mp4`. It must last **2 to 3 minutes**.

---

## 🗺️ Work Roadmap (follow in this order)

| Step | What to do | Where | Marks |
|:----:|------------|-------|:-----:|
| 0 | Read `README.md`, then read and run the full code | Your IDE | – |
| 1 | Fork, rename, keep the repo **PUBLIC**, set your student ID (line 150), **commit** | GitHub + code | Part 1 (1) |
| 2 | Feature 1: Process Priority, **commit** | Code | Part 2 (0.25) |
| 3 | Feature 2: Context Switch Counter, **commit** | Code | Part 2 (0.25) |
| 4 | Feature 3: Waiting Time Tracking, **commit** | Code | Part 2 (0.5) |
| 5 | Development Log (5+ entries, different dates) | This file, Part A | Part 3 (0.5) |
| 6 | Reflection (4 questions) | This file, Part B | Part 3 (0.5) |
| 7 | Technical Answers (4 questions) | This file, Part C | Part 3 (0.5) |
| 8 | Record the video, upload it, paste the link above | Video + this file | Part 4 (1.5) |
| 9 | Final check, then submit the repo link on Blackboard | Blackboard | – |

> 💡 **TIP:** Tick each step off as you go. Do not leave the log, the reflection or the video for the last day.

---

## 🔁 Commit Rules (MANDATORY)

> ### ⚠️ MANY COMMITS ARE REQUIRED. A single bulk commit is penalized (-0.5 mark).

**Minimum: 3 meaningful commits. Aim for 6 or more.**

| # | Commit | Example message |
|:-:|--------|-----------------|
| 1 | Student ID set | `Set my student ID: 441234567` |
| 2 | Feature 1: Priority | `Feature 1: Added priority field to Process class` |
| 3 | Feature 2: Context switches | `Feature 2: Implemented context switch counter` |
| 4 | Feature 3: Waiting time | `Feature 3: Added waiting time tracking and summary table` |
| 5 | Development log entries | `Docs: Added development log entries 1-3` |
| 6 | Reflection and answers | `Docs: Completed reflection and technical answers` |
| 7 | Video link | `Docs: Added demo video link` |

**Rules:**
- ✅ **One commit per feature.** Do not put all three features in one commit.
- ✅ **Commit after each work session**, and after each part of this file.
- ✅ **Spread your commits over different dates.** Not all in one day.
- ❌ **Do not make all commits in the last hour** before the deadline.
- ❌ **No vague messages** like `done`, `update` or `final version`.

> 💡 **TIP:** Your commit history is checked and you **show it in your video** (at least 3 commits visible). Your development log dates should match your commit dates.
>
> 💡 **TIP:** **Use VS Code** (see *Recommended Development Environment* in `README.md` for the full setup). Sign in to GitHub in VS Code, then commit from the Source Control panel (Ctrl+Shift+G) → stage → write a message → Commit → Sync/Push. You can edit and commit this file the same way. **Pushing** matters: commits that are not pushed to GitHub are invisible to the instructor.

---

# Part A: Development Log (0.5 mark)

> ⚠️ **WARNING:** Minimum **5 entries**, spread over **different dates**. Five entries written on the same day, or written all at once at the end, will lose marks and look like a copy. Entry dates should be **between the start of the assignment and the deadline (October 10, 2026)**.
>
> 💡 **TIP:** Write an entry at the **end of each work session**, while you still remember what happened. It takes 5 minutes.
>
> 💡 **TIP:** Be specific. "Worked on the code" is a weak entry. "Added a `static int contextSwitches` counter and incremented it before `currentThread.start()`" is a strong one.
>
> 📌 **NOTE:** Each entry needs: date and time, what you did, details, challenges, solution, and time spent. Real challenges are fine (and expected). Do not invent fake ones.

## Example Entry (do not copy it, write your own)

### Entry 1 - [September 22, 2026, 2:30 PM]
**What I did**: Forked the repository and set up my student ID

**Details**:
- Created GitHub account with university email
- Forked the starter repository and renamed it
- Changed student ID on line 150 to my actual ID (441234567)
- Compiled and ran the program successfully
- Committed and pushed: `Set my student ID: 441234567`

**Challenges**: Had to install JDK first because `javac` wasn't recognized

**Solution**: Downloaded JDK 17 and set the PATH variable

**Time spent**: 30 minutes

---

## Your Development Log

### Entry 1 - [NOV 13,2026,4:30pm]
**What I did**:
Read the assignment, forked the starter repository and set my student ID.
**Details**:
* Read the assignment PDF and the README.md of the starter repository
* Forked makopt/OS-Assignment1-Starter-481 and renamed my fork to OS-Assignment1-Waadd-Alshammarri
* Checked that the repository is public and that my GitHub account uses my university email
* Changed line 150 to int studentID = 444052856;
* Committed and pushed: Set my student ID to personalize the simulation
**Challenges**:
I was not sure whether renaming the fork would break the link to the starter repository.
**Solution**:
I checked in Settings that the rename only changes the name and the repository stayed a fork of the starter.
**Time spent**:
45min
---

### Entry 2 - [NOV13,2026,9pm]
**What I did**:
Read the whole SchedulerSimulation.java and ran it for the first time.
**Details**:
* Read the classes Colors, Process and SchedulerSimulation from top to bottom
* Understood that Process implements Runnable, and that run() simulates one time quantum with Thread.sleep()
* Understood how main takes a thread from the queue with poll(), starts it with start() and waits for it with join()
* Ran the program in VS Code and got 14 processes with a time quantum of 5000ms for my ID
**Challenges**:
The box characters and progress bars appeared as strange symbols in the PowerShell terminal.
**Solution**:
I changed the terminal code page to UTF-8 with chcp 65001, and the symbols appeared correctly.
**Time spent**:
1 hour 15min
---

### Entry 3 - [NOV14,2026,10:30am]
**What I did**:
Implemented Feature 1 (Process Priority) and Feature 2 (Context Switch Counter).
**Details**:
* Added a priority field with setPriority() and getPriority() in the Process class
* Created a separate Random priorityRandom = new Random(studentID) so the burst times from the original random generator did not change
* Printed the priority inside addProcessToQueue() when a process enters the ready queue (display only, the queue is still FIFO)
* Added private static int contextSwitchCount and increased it just before currentThread.start()
* Printed Total Context Switches after the "ALL PROCESSES COMPLETED" banner
* Made two separate commits, one for each feature
**Challenges**:
If I used the same random object for the priority, all burst times after it would change.
**Solution**:
I used a second Random with the same seed, so my output stayed the same as before.
**Time spent**:
1 hour 30min
---

### Entry 4 - [NOV14,2026,2pm]
**What I did**:
Implemented Feature 3 (Waiting Time Tracking) and the final table.
**Details**:
* Added waitingTime and enqueueTimestamp fields with markEnqueued(), recordWaiting(), getWaitingTime() and getTurnaroundTime() in Process
* Called markEnqueued() in addProcessToQueue() and recordWaiting() right before currentThread.start()
* Stored all processes in an ArrayList<Process> and printed a table with Process Name, Burst Time, Waiting Time and Turnaround Time (Waiting + Burst)
* Committed the feature and tested the output
**Challenges**:
A process enters the ready queue several times, so one start time was not enough, and every re-queue creates a new Thread object.
**Solution**:
I kept the time data inside the Process object and added each waiting period to waitingTime, so the total is correct after all rounds.
**Time spent**:
2hour
---

### Entry 5 - [NOV14,2026,5pm]
**What I did**:
Wrote the reflection and the technical answers in this file.
**Details**:
* Wrote the answers for Part B (reflection) and Part C (technical answers)
* Used the real output of my run, for example P2 with a burst time of 11145ms, as the example in Question 2
* Checked that every answer matches the required number of sentences
* Committed: Docs: Completed reflection and technical answers
**Challenges**:
Choosing a clear example for the thread lifecycle question.
**Solution**:
I followed P1 through the code step by step: new Thread, start(), sleep(), join() and the end of run().
**Time spent**:
1hours 15min
---

### Entry 6 - [NOV14,2026,7pm]
**What I did**:
Prepared and recorded the demo video, then added the link.
**Details**:
* Prepared a short script for my name, ID, the three features, the run, one threading concept and the commit history
* Recorded the video in VS Code and uploaded it to Google Drive with public access
* Tested the link in an incognito window and added it to this file
* Committed: Docs: Added demo video link
**Challenges**:
The full simulation takes about two minutes to finish, and the video must be only 2 to 3 minutes.
**Solution**:
I showed the start of the run with my unique parameters and sped up the waiting part in the video editor.
**Time spent**:
1 hours 30min
---

## Development Log Summary

> 💡 **TIP:** Fill this in **last**, after all entries are written.

**Total time spent on assignment**: [X hours]

**Most challenging part**:

**Most interesting learning**:

**What I would do differently next time**:

---

# Part B: Reflection (0.5 mark)

> 🛑 **STOP:** Do **not** start this part until you have read the `README.md`, read the **entire** `SchedulerSimulation.java`, run it, and finished the three features.
>
> ⚠️ **WARNING:** Each answer must be **5 to 7 sentences**, in **your own words**. Copied or AI-generated answers without understanding get **0 marks for the whole assignment**. You may be asked to explain them in person.
>
> 💡 **TIP:** Mention concrete things you actually did: a method you wrote, an error you hit, a line of output you saw. Generic answers score low.
>
> 💡 **TIP:** Draft your answer in a few bullet points first, then turn them into sentences.

## Question 1: What did you learn about multithreading?

> 💡 **TIP:** Talk about thread creation (`Runnable`, `Thread.start()`), waiting with `Thread.join()`, simulating work with `Thread.sleep()`, and what surprised you.

**Your Answer:** *(5-7 sentences)*

[Through this assignment I learned that multithreading lets one program run several tasks as separate threads, and that in Java the simplest way is to put the task inside a class that implements Runnable. In my code the Process class implements Runnable, and the scheduler creates a thread with new Thread(process) and starts it with start(), which calls run(). I also learned that the main thread does not wait for the thread it starts, so Thread.join() is needed to make the scheduler wait until the process finishes its time quantum. Thread.sleep() was used inside run() to simulate CPU work, and in my output it paused each process for up to 5000ms in five small steps. What surprised me is that a thread object cannot be started twice, so every time a process returns to the ready queue the program creates a new Thread for the same Process. This connected the theory of threads and Round-Robin scheduling from the textbook with real code that I could run and watch.]

## Question 2: What was the most challenging part of this assignment?

> 💡 **TIP:** Pick **one** specific challenge (understanding the code, one of the features, Git, the video) and say *why* it was hard.

**Your Answer:** *(5-7 sentences)*

[The most challenging part for me was Feature 3, the waiting time tracking, because I had to understand exactly when a process is waiting. At first I thought one start time for each process was enough, but a process leaves and enters the ready queue several times; for example, P2 in my output was added to the ready queue three times. This means the waiting time is the sum of several separate periods and not one number. The second difficulty was that every re-queue creates a new Thread in addProcessToQueue(), so I could not keep the timing data in the thread and I had to store it inside the Process object. Another problem was that the PowerShell terminal showed strange characters instead of the boxes and progress bars of the output. These problems took time because the waiting time depends on real time with System.currentTimeMillis(), so the numbers are a little different in each run..]

## Question 3: How did you overcome the challenges you faced?

> 💡 **TIP:** Describe your method: reading documentation, adding `System.out.println` to debug, re-reading the README, testing after each small change, asking for help.

**Your Answer:** *(5-7 sentences)*

[First I re-read the README and then read SchedulerSimulation.java from top to bottom, and I ran it once without any change to see the normal output. I followed one process, P2, in the console to see when it entered the queue, when it ran, and when it was added again after its quantum. Then I solved Feature 3 in small steps: I added markEnqueued() inside addProcessToQueue() and recordWaiting() right before currentThread.start(), and I tested the values after each change. For the strange characters I changed the terminal code page with chcp 65001, and the UTF-8 symbols appeared correctly. I made a separate commit after each feature, so I could always go back to the last working version if something broke. Writing a development log entry after each work session also helped me remember what I had changed and why.]

## Question 4: How can you apply multithreading concepts in real-world applications?

> 💡 **TIP:** Use real applications you know (web browser, game, mobile app, music player) and connect each one to what you built here.

**Your Answer:** *(5-7 sentences)*

[Multithreading is used in many applications where several tasks must progress at the same time. A web browser is a good example, because one thread can download a file while another plays a video and another keeps the page responsive, like the processes in my simulation that all get CPU time in turn. A music player on a phone plays the audio in one thread while another thread updates the screen, so the user does not feel that the app is frozen. In operating systems, the CPU scheduler works like my project: each program gets a time quantum, then a context switch gives the CPU to the next one, which is what my Total Context Switches counter measures. A web server also uses a thread for each client request, so one slow client does not block the others. So the basic tools I used here, such as Runnable, start(), join(), sleep() and the time quantum, are the building blocks of these real systems.]

### Optional: What would you like to learn more about?

[Any topics related to threading or operating systems that you're curious about?]

### Optional: How confident do you feel about multithreading concepts now?

[Beginner / Intermediate / Confident. What do you understand well? What needs more practice?]

### Optional: Feedback on the assignment

[Any comments? Was it helpful? Too easy or hard? Suggestions?]

---

# Part C: Technical Answers (0.5 mark)

> 🛑 **STOP:** You cannot answer these questions without understanding the code. Re-read `SchedulerSimulation.java` and **run it** first. Your answers must reference **your own code and your own output** (your student ID makes your output unique).
>
> ⚠️ **WARNING:** Each answer must be **3 to 5 sentences**, with specific examples from your code or output. Use correct terms: thread, process, time quantum, ready queue, context switch, burst time.
>
> 💡 **TIP:** Keep your program output in a text file or screenshot so you can copy real snippets for Question 2.

## Question 1: Thread vs Process

**Question**: Explain the difference between a **thread** and a **process**. Why did we use threads in this assignment instead of creating separate processes? Mention at least **TWO** specific differences (e.g., memory sharing, creation overhead, communication speed), and reference relevant parts of `SchedulerSimulation.java`.

> 💡 **TIP:** Note that the class named `Process` in our code is a *simulated* process, and it is run by a real Java *thread*. Explain that distinction and point to the `new Thread(process)` line in `addProcessToQueue()`.

**Your Answer:** *(3-5 sentences)*

[A process is a program in execution with its own memory space (code, data, heap and stack), while a thread is a unit of execution inside a process that shares the code, data and open files with the other threads of the same process and has only its own stack, program counter and registers. Two important differences are that creating a thread is faster and cheaper than creating a process, and that threads communicate directly through shared memory while processes need inter-process communication such as message passing. In SchedulerSimulation.java the class Process is only a simulated process object, and each one runs inside a real Java thread created with new Thread(process) in addProcessToQueue(). We used threads because the main scheduler thread and the process threads share the same processQueue and processMap in memory, which is simpler and lighter than creating 14 separate operating system processes.]

## Question 2: Ready Queue Behavior

**Question**: In Round-Robin scheduling, what happens when a process doesn't finish within its time quantum? Explain using an example from **your** program output, including **how many times that process was re-queued** before it finished, and explain why re-queueing matters for fairness.

> ⚠️ **WARNING:** The output snippet must come from **your own run** (with your student ID), not from a classmate or from this README.
>
> 💡 **TIP:** Pick a process with a large burst time (e.g., more than 2 × time quantum) and count how many "added to ready queue" lines it has after the first one. Search your console for its name (e.g., `P3`).

**Your Answer:** *(3-5 sentences)*

[In Round-Robin, when a process does not finish within its time quantum it stops, yields the CPU for a context switch, and goes to the end of the ready queue to wait for its next turn. In my output P2 has a burst time of 11145ms with a quantum of 5000ms, so it ran 5000ms (44%, remaining 6145ms), was re-queued, ran another 5000ms (89%, remaining 1145ms), was re-queued again, and finished in its third run of 1145ms, so it was re-queued 2 times before it finished. Re-queueing matters for fairness because no long process can keep the CPU, and every process gets a turn in the same order, while short processes such as P9 (4612ms) finish in their first turn.]

Example from my output:
▶️ P2 executing quantum [5000ms]
  ⏸ P2 completed quantum 5000ms │ Overall progress: 44%
     Remaining time: 6145ms
  ↻ P2 yields CPU for context switch

  ➕ P2 added to ready queue │ Burst time: 11145ms
  ...
  ⏸ P2 completed quantum 5000ms │ Overall progress: 89%
     Remaining time: 1145ms
  ↻ P2 yields CPU for context switch

  ➕ P2 added to ready queue │ Burst time: 11145ms
  ...
  ▶️ P2 executing quantum [1145ms]
  ⏸ P2 completed quantum 1145ms │ Overall progress: 100%
     Remaining time: 0ms
  ✓ P2 finished execution!
```
[Paste a relevant snippet from your program output here showing a process being re-queued]
```

**Explanation of example:**
[Explain what is happening in the output snippet you pasted.]

## Question 3: Thread Lifecycle

**Question**: A thread goes through these states: **New**, **Runnable**, **Running**, **Waiting**, **Terminated**. Walk through these states for one process (e.g., P1) from your simulation. For each state, explain **when** P1 enters it and **which line or method call** triggers the transition (`Thread.start()`, `Thread.join()`, `Thread.sleep()`, etc.).

> 💡 **TIP:** Follow P1 through the code: created in `addProcessToQueue()`, started in the scheduler loop, sleeping inside `run()`, and the main thread waiting on `join()`. Remember that **the main thread waits** on `join()`, while **P1's thread sleeps** in `Thread.sleep()`. Be clear about which thread is in which state.

**Your Answer:** *(3-5 sentences overall; one short explanation per state)*

1. **New**: [P1's thread is in the New state right after new Thread(process) in addProcessToQueue(), before start() is called.]

2. **Runnable**: [When the scheduler loop calls currentThread.start(), the thread becomes Runnable and is ready to get the CPU.]

3. **Running**: [  P1 is Running when the JVM gives it the CPU and it executes the code inside run() for its quantum (5000ms for my ID)]

4. **Waiting**: [Inside run(), Thread.sleep(stepTime) puts P1's thread in a timed waiting state, and at the same time the main thread is waiting at currentThread.join() until P1 finishes.]

5. **Terminated**: [When run() ends, P1's thread is Terminated; if P1 still has remaining time, a new Thread is created for it, because a terminated thread cannot be started again.]

## Question 4: Real-World Applications

**Question**: Give **TWO** real-world examples where Round-Robin scheduling with threads would be useful. **At least one** must be an operating-system-level scenario (e.g., how an OS scheduler shares CPU time among running programs). The second can be any application you choose. For each, explain what the system is and **why Round-Robin fits** (fairness, responsiveness, predictability).

> 💡 **TIP:** Relate each example back to your simulation: what plays the role of the "process", the "time quantum" and the "context switch" in that scenario?

**Your Answer:** *(3-5 sentences per example)*

### Example 1 (operating-system level): [(operating-system level): CPU time sharing in a desktop operating system]

**Description**:
[ In an operating system such as Windows, many programs (a browser, a music player, a text editor) run at the same time on a limited number of CPU cores. The scheduler gives each program a small time slice and then performs a context switch to the next one, like the Process objects and the time quantum in my simulation.]

**Why Round-Robin works well here**:
[ Round-Robin is fair because every program gets the CPU regularly and no program can keep it forever. It also gives good responsiveness, because the user does not wait long to see a reaction from any program.]

### Example 2: [web server handling many client requests]

**Description**:
[ A web server receives many requests from different users, and it can use a thread for each request. The server shares its processing time among these threads in turns, so each request is a "process" and the time slice is the quantum]

**Why Round-Robin works well here**:
[A long request cannot block the short ones, so every user gets a response in a reasonable time. The behavior is also predictable, because each thread gets its turn in a known order]

## Summary

**Key concepts I understood through these questions:**
1. The difference between a process and a thread, and why threads share memory.
2. How Round-Robin uses the time quantum and the ready queue, and why re-queueing makes it fair.
3. The thread lifecycle and the roles of start(), sleep() and join().


**Concepts I need to study more:**
1. Synchronization between threads (locks and semaphores).
2. Other scheduling algorithms and how their waiting times compare with Round-Robin.

---

# ✅ Final Checklist (complete before submitting)

> ⚠️ **WARNING:** Go through every line. Blackboard does not accept submissions after the deadline, which is **October 10, 2026**.

**Repository**
- [ ] Repository is **PUBLIC** (Settings → Danger Zone → Visibility)
- [ ] Repository is renamed to `OS-Assignment1-YourFirstName-YourLastName`
- [ ] GitHub account uses the university email (`@std.psau.edu.sa`)

**Code**
- [ ] Student ID is set in `SchedulerSimulation.java` (line 150)
- [ ] Code compiles and runs with no errors
- [ ] Feature 1 (priority), Feature 2 (context switches) and Feature 3 (waiting time table) all work
- [ ] Each feature has clear comments

**Commits**
- [ ] **At least 3 meaningful commits, ideally 6 or more**
- [ ] **One commit per feature**
- [ ] Commits are spread over **different dates** (not all in the last hour)
- [ ] Everything is **pushed** to GitHub

**This file (`MY_WORK.md`)**
- [ ] Full name and student ID filled in at the top
- [ ] Development log has **5+ entries** on different dates
- [ ] Reflection: 4 questions, 5-7 sentences each
- [ ] Technical answers: 4 questions, 3-5 sentences each, with examples from **your** output
- [ ] No `[...]` placeholders left
- [ ] No section headers deleted

**Video**
- [ ] 2-3 minutes long, named `StudentID_Assignment1_Demo.mp4`
- [ ] Shows your name, ID, repository, 3 features, IDE execution, one threading concept, and commit history
- [ ] Link is **public** (tested in an incognito window) and pasted in the **Video Link** section above

**Blackboard**
- [ ] Submit **only** the link to your public GitHub repository

> 🎯 **Good luck!** Start early, commit regularly, and make sure you can explain every line you submit.
