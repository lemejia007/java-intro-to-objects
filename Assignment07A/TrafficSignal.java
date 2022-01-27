
// TrafficSignal.java
// This enum type called TrafficSignal contains the constants RED, GREEN, 
// YELLOW, WALK, DONT_WALK with each constant having a parameter for the 
// duration of the constant (in terms of seconds) and has an accessor method to 
// retrieve the seconds.

// enum declaration
public enum TrafficSignal {
	
  RED(60),
  GREEN(60),
  YELLOW(6),
  WALK(33),
  DONT_WALK(6);
 
 // Instance fields
 private int seconds; // Duration in seconds of each traffic signal
 
 // enum constructor
 private TrafficSignal(int seconds) {
   this.seconds = seconds;
 }
 
 // Accessor for field seconds
 public int getSeconds() {
   return seconds;
 }

} // End of enum TrafficSignal

