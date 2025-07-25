# ⏰ Java Alarm Clock

A simple console-based alarm clock application written in Java.  
The program lets you input a time in the format `HH:mm:ss`, waits until the specified time, and then plays a sound as the alarm.

---

## 🛠 Features

- Set an alarm using the 24-hour format (e.g., `14:30:00`)
- Live time display updates every second
- Plays a `.wav` audio file as the alarm sound
- Option to stop the alarm by pressing Enter

---

## 🧱 Technologies & Concepts Used

- **Java Threads**  
  Used to run the alarm clock logic in a separate thread to avoid blocking the main thread.

- **Object-Oriented Programming (OOP)**  
  The program uses classes and encapsulation (e.g., `AlarmClock` class) to organize code logically.

- **Java Time API**  
  Utilizes `java.time.LocalTime` and `DateTimeFormatter` for time manipulation and formatting.

- **Exception Handling**  
  Gracefully handles invalid user input and audio playback errors with `try-catch` blocks.

- **File I/O and Audio Playback**  
  Uses `javax.sound.sampled` to load and play `.wav` files from the filesystem.

- **Console Formatting**  
  Uses `System.out.printf("\r...")` to update the current time in-place every second.
